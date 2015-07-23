package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BinaryChromosomeTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testInvalidConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.BinaryChromosomeTest object = new org.apache.commons.math3.genetics.BinaryChromosomeTest();
               object.testInvalidConstructor();
        }
    }

    @Test(timeout=1800000)
    public void testRandomConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.BinaryChromosomeTest object = new org.apache.commons.math3.genetics.BinaryChromosomeTest();
               object.testRandomConstructor();
        }
    }

    @Test(timeout=1800000)
    public void testIsSame() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.BinaryChromosomeTest object = new org.apache.commons.math3.genetics.BinaryChromosomeTest();
               object.testIsSame();
        }
    }

}