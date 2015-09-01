package cmu.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Parse the PassingList.txt file to get the statistics
 *
 * @author: chupanw
 */
public class PassingListParser {

    // provide by constructor
    String patchedList;
    String unpatchedList;
    String output;

    // initialized by parse() method
    HashMap<String, Boolean> patchedMap;
    HashMap<String, Boolean> unpatchedMap;

    public PassingListParser(String patchedList, String unpatchedList, String output) {
        this.patchedList = patchedList;
        this.unpatchedList = unpatchedList;
        this.output = output;
    }

    private void parse() {
        // init
        File patchedFile = new File(patchedList);
        File unpatchedFile = new File(unpatchedList);
        patchedFile.setReadOnly();
        unpatchedFile.setReadOnly();
        patchedMap = new HashMap<>();
        unpatchedMap = new HashMap<>();
        initMap(patchedFile, patchedMap);
        initMap(unpatchedFile, unpatchedMap);

        try {
            outputMarkDown();
        } catch (IOException e) {
            e.printStackTrace();
        }
        checkMissingPass();
    }

    private void checkMissingPass() {
        String filePath = "/Users/chupanw/Downloads/ServerRun/math6-coverage-all/build/defects4j-tests/report/all-tests.html";
        String errorFilePath = "/Users/chupanw/Downloads/ServerRun/math6-coverage-all/build/defects4j-tests/report/alltests-errors.html";
        File file = new File(filePath);
        File errorFile = new File(errorFilePath);
        assert file.exists();
        assert errorFile.exists();
        HashSet<String> errorNames = new HashSet<>();
        try {
            Document errorDoc = Jsoup.parse(errorFile, "UTF-8", "");
            Elements errorElements = errorDoc.select("tr");
            for (Element e : errorElements) {
                Element firstTd = e.getElementsByTag("td").first();
                if (firstTd == null) {
                    continue;
                }
                if (firstTd.getElementsByTag("a").isEmpty()) {
                    continue;
                }
                String href = firstTd.getElementsByTag("a").first().attr("href");
                String[] fields = href.split("/");
                String prefix = "org.apache.commons.";
                for (int i = 2; i < fields.length - 1; i++) {
                    prefix += fields[i] + ".";
                }
                Element secondTd = e.getElementsByTag("td").get(1);
                String testCase = prefix + firstTd.text() + "::" + secondTd.text();
                errorNames.add(testCase);
            }


            Document doc = Jsoup.parse(file, "UTF-8", "");
            Elements elements = doc.select("tr");
            int count = 0;
            int missCount = 0;
            for (Element e : elements) {
                Element firstTd = e.getElementsByTag("td").first();
                if (firstTd == null) {
                    continue;
                }
                if (firstTd.getElementsByTag("a").isEmpty()) {
                    continue;
                }
                String href = firstTd.getElementsByTag("a").first().attr("href");
                String[] fields = href.split("/");
                String prefix = "org.apache.commons.";
                for (int i = 2; i < fields.length - 1; i++) {
                    prefix += fields[i] + ".";
                }
                count++;
                Element secondTd = e.getElementsByTag("td").get(1);
                String testCase = prefix + firstTd.text() + "::" + secondTd.text();
                if (!patchedMap.containsKey(testCase) && !errorNames.contains(testCase)) {
                    System.out.println("Missing: " + testCase);
                    missCount++;
                }
            }
            System.out.println("Total # test cases: " + count);
            System.out.println("Total # missing test cases: " + missCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void outputMarkDown() throws IOException {
        File outFile = new File(output);
        if (!outFile.exists()) {
            if (outFile.getParentFile() != null) {
                outFile.getParentFile().mkdirs();
            }
            outFile.createNewFile();
        }
        FileWriter writer = new FileWriter(outFile);
        writer.write("| Number | Test Case |              Pass with Patches             ||              Fail with Patches             ||\n");
        writer.write("| ------ | --------- | -------------------- | -------------------- | -------------------- | -------------------- |\n");
        writer.write("|        |           | Pass without patches | Fail without patches | Pass without Patches | Fail without Patches |\n");

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sbOrphan = new StringBuilder();
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;
        int counter4 = 1;
        int orphanCounter = 1;


        ArrayList<String> names = new ArrayList(patchedMap.keySet());
        Collections.sort(names);
        for (String n : names) {
            int index = n.indexOf("math3") + 6;
            String shortName = n.substring(index);
            if (unpatchedMap.containsKey(n)) {
                boolean patched = patchedMap.get(n);
                boolean unpatched = unpatchedMap.get(n);
                if (patched && unpatched) {
                    sb1.append("| " + counter1 + " | " + shortName + " | * |   |   |   |\n");
                    counter1++;
                } else if (patched && !unpatched) {
                    sb2.append("| " + counter2 + " | " + shortName + " |   | * |   |   |\n");
                    counter2++;
                } else if (!patched && unpatched) {
                    sb3.append("| " + counter3 + " | " + shortName + " |   |   | * |   |\n");
                    counter3++;
                } else {
                    sb4.append("| " + counter4 + " | " + shortName + " |   |   |   | * |\n");
                    counter4++;
                }
            } else {
                // orphan
                // TODO: check why
                sbOrphan.append("| " + orphanCounter + " | " + shortName + " | - | - | - | - |\n");
                orphanCounter++;
            }
        }
        writer.write(sb2.toString());
        writer.write(sb3.toString());
        writer.write(sb4.toString());
        writer.write(sb1.toString());
        writer.write(sbOrphan.toString());
        int total = counter1 + counter2 + counter3 + counter4 + orphanCounter - 5;
        writer.write("| Total | " + total + " |\n");
        writer.flush();
        writer.close();
    }


    private void initMap(File f, HashMap<String, Boolean> map) {
        assert f.exists();
        assert map != null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            while ((line = reader.readLine()) != null) {
                // passing entirely or conditionally
                if (line.startsWith("[*]") || line.startsWith("[?]")) {
                    String[] fields = line.split(" ");
                    map.put(fields[1], true);
                }
                else if (line.startsWith("[x]")) {
                    String[] fields = line.split(" ");
                    map.put(fields[1], false);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        assert args.length == 3;
        PassingListParser parser = new PassingListParser(args[0], args[1], args[2]);
        parser.parse();
    }
}
