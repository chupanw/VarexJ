package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DiagonalMatrixTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testAdd();
        }
    }

    @Test(timeout=1800000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testSubtract();
        }
    }

    @Test(timeout=1800000)
    public void testMultiply2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testMultiply2();
        }
    }

    @Test(timeout=1800000)
    public void testOperate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testOperate();
        }
    }

    @Test(timeout=1800000)
    public void testSetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testSetSubMatrix();
        }
    }

    @Test(timeout=1800000)
    public void testAddToEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testAddToEntry();
        }
    }

    @Test(timeout=1800000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testCopy();
        }
    }

    @Test(timeout=1800000)
    public void testConstructor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testConstructor1();
        }
    }

    @Test(timeout=1800000)
    public void testConstructor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testConstructor2();
        }
    }

    @Test(timeout=1800000)
    public void testConstructor3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testConstructor3();
        }
    }

    @Test(timeout=1800000)
    public void testCreateError() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testCreateError();
        }
    }

    @Test(timeout=1800000)
    public void testCreate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testCreate();
        }
    }

    @Test(timeout=1800000)
    public void testGetData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testGetData();
        }
    }

    @Test(timeout=1800000)
    public void testMultiplyEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testMultiplyEntry();
        }
    }

    @Test(timeout=1800000)
    public void testMultiply1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testMultiply1();
        }
    }

    @Test(timeout=1800000)
    public void testPreMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testPreMultiply();
        }
    }

    @Test(timeout=1800000)
    public void testSetNonDiagonalEntry() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testSetNonDiagonalEntry();
        }
    }

    @Test(timeout=1800000)
    public void testSetNonDiagonalZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testSetNonDiagonalZero();
        }
    }

    @Test(timeout=1800000)
    public void testAddNonDiagonalEntry() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testAddNonDiagonalEntry();
        }
    }

    @Test(timeout=1800000)
    public void testAddNonDiagonalZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testAddNonDiagonalZero();
        }
    }

    @Test(timeout=1800000)
    public void testMultiplyNonDiagonalEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testMultiplyNonDiagonalEntry();
        }
    }

    @Test(timeout=1800000)
    public void testMultiplyNonDiagonalZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testMultiplyNonDiagonalZero();
        }
    }

    @Test(timeout=1800000)
    public void testSetEntryOutOfRange() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testSetEntryOutOfRange();
        }
    }

    @Test(timeout=1800000)
    public void testNull() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testNull();
        }
    }

    @Test(timeout=1800000)
    public void testSetSubMatrixError() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.linear.DiagonalMatrixTest object = new org.apache.commons.math3.linear.DiagonalMatrixTest();
               object.testSetSubMatrixError();
        }
    }

}