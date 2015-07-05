package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ChromosomeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.ChromosomeTest object = new org.apache.commons.math3.genetics.ChromosomeTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=1000000)
    public void testFindSameChromosome() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.ChromosomeTest object = new org.apache.commons.math3.genetics.ChromosomeTest();
               object.testFindSameChromosome();
        }
    }

}