import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class JPFCoreRunner {

	public static void main(String[] args) {
		new JPFCoreRunner();
	}

	public JPFCoreRunner() {
		System.out.println("JPFCoreRunner.JPFCoreRunner()");
		String[] testClasses = new String[] { inc.IncJPF_Core.class.getName(), array.ArrayJPF_Core.class.getName() };
		for (String test : testClasses) {
			LinkedList<String> commands = new LinkedList<>();
			commands.add("java");
			commands.add("-Xmx7g");
			commands.add("-jar");
			commands.add("C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core_old\\build\\RunJPF.jar");

			commands.add("+classpath=C:\\Users\\meinicke\\git\\VarexJ\\VarexJSmallScaleEvaluation\\bin\\;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core_old\\build\\jpf.jar");
			commands.add("+search.class=.search.DFSearch");

			commands.add(test);
			commands.add("");
			for (int complexity = 0; complexity <= 100; complexity++) {
				commands.removeLast();
				commands.add("" + complexity);
				boolean maxReached = false;
				for (int round = 0; round < 3; round++) {
					long start = System.currentTimeMillis();
					process(commands);
					long timeInS = (System.currentTimeMillis() - start) / 1000;
					if (timeInS > 30) {
						maxReached = true;
						break;
					}
				}
				if (maxReached) {
					break;
				}
			}
			File resultsFile = new File("JPF.csv");
			resultsFile.renameTo(new File("JPF-" + test + ".csv"));
		}
	}

	private void process(List<String> commands) {
		for (String s : commands) {
			System.out.print(s);
			System.out.print(" ");
		}
		System.out.println();
		ProcessBuilder processBuilder = new ProcessBuilder(commands);
		BufferedReader input = null;
		BufferedReader error = null;
		try {
			Process process = processBuilder.start();
			input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

			while (true) {
				try {
					String line;
					while ((line = input.readLine()) != null) {
						System.out.println(line);
					}
					while ((line = error.readLine()) != null) {
						System.out.println(line);
					}

					try {
						process.waitFor();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					int exitValue = process.exitValue();
					if (exitValue != 0) {
						throw new IOException("The process doesn't finish normally (exit=" + exitValue + ")!");
					}
					break;
				} catch (IllegalThreadStateException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (input != null)
					input.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (error != null)
					try {
						error.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	}
}
