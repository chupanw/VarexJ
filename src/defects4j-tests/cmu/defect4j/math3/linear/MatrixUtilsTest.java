package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MatrixUtilsTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testCreateRealMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCreateRealMatrix();
        }
    }

    @Test(timeout=60000)
    public void testcreateFieldMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testcreateFieldMatrix();
        }
    }

    @Test(timeout=60000)
    public void testCreateRowRealMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCreateRowRealMatrix();
        }
    }

    @Test(timeout=60000)
    public void testCreateRowFieldMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCreateRowFieldMatrix();
        }
    }

    @Test(timeout=60000)
    public void testCreateColumnRealMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCreateColumnRealMatrix();
        }
    }

    @Test(timeout=60000)
    public void testCreateColumnFieldMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCreateColumnFieldMatrix();
        }
    }

    @Test(timeout=60000)
    public void testCreateIdentityMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCreateIdentityMatrix();
        }
    }

    @Test(timeout=60000)
    public void testcreateFieldIdentityMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testcreateFieldIdentityMatrix();
        }
    }

    @Test(timeout=60000)
    public void testBigFractionConverter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testBigFractionConverter();
        }
    }

    @Test(timeout=60000)
    public void testFractionConverter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testFractionConverter();
        }
    }

    @Test(timeout=60000)
    public void testSolveLowerTriangularSystem() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testSolveLowerTriangularSystem();
        }
    }

    @Test(timeout=60000)
    public void testSolveUpperTriangularSystem() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testSolveUpperTriangularSystem();
        }
    }

    @Test(timeout=60000)
    public void testBlockInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testBlockInverse();
        }
    }

    @Test(timeout=60000)
    public void testIsSymmetric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testIsSymmetric();
        }
    }

    @Test(timeout=60000)
    public void testIsSymmetricTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testIsSymmetricTolerance();
        }
    }

    @Test(timeout=60000)
    public void testCheckSymmetric1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCheckSymmetric1();
        }
    }

    @Test(timeout=60000)
    public void testCheckSymmetric2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSymmetricMatrixException", config)) {
               org.apache.commons.math3.linear.MatrixUtilsTest object = new org.apache.commons.math3.linear.MatrixUtilsTest();
               object.testCheckSymmetric2();
        }
    }

}