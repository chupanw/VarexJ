package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CholeskyDecompositionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testDimensions();
        }
    }

    @Test(timeout=60000)
    public void testNotSymmetricMatrixException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSymmetricMatrixException", config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testNotSymmetricMatrixException();
        }
    }

    @Test(timeout=60000)
    public void testNotPositiveDefinite() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException", config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testNotPositiveDefinite();
        }
    }

    @Test(timeout=60000)
    public void testMath274() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonPositiveDefiniteMatrixException", config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testMath274();
        }
    }

    @Test(timeout=60000)
    public void testAEqualLLT() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testAEqualLLT();
        }
    }

    @Test(timeout=60000)
    public void testLLowerTriangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testLLowerTriangular();
        }
    }

    @Test(timeout=60000)
    public void testLTTransposed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testLTTransposed();
        }
    }

    @Test(timeout=60000)
    public void testNonSquare() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSquareMatrixException", config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testNonSquare();
        }
    }

    @Test(timeout=60000)
    public void testMatricesValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.CholeskyDecompositionTest object = new org.apache.commons.math3.linear.CholeskyDecompositionTest();
               object.testMatricesValues();
        }
    }

}