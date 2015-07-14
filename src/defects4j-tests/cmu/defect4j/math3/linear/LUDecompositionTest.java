package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LUDecompositionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testNonSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testNonSquare();
        }
    }

    @Test(timeout=600000)
    public void testLLowerTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testLLowerTriangular();
        }
    }

    @Test(timeout=600000)
    public void testPAEqualLU() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testPAEqualLU();
        }
    }

    @Test(timeout=600000)
    public void testUUpperTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testUUpperTriangular();
        }
    }

    @Test(timeout=600000)
    public void testPPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testPPermutation();
        }
    }

    @Test(timeout=600000)
    public void testSingular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testSingular();
        }
    }

    @Test(timeout=600000)
    public void testMatricesValues1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testMatricesValues1();
        }
    }

    @Test(timeout=600000)
    public void testMatricesValues2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testMatricesValues2();
        }
    }

    @Test(timeout=600000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUDecompositionTest object = new org.apache.commons.math3.linear.LUDecompositionTest();
               object.testDimensions();
        }
    }

}