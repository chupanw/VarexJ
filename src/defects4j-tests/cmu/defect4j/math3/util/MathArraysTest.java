package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MathArraysTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testScaleInPlace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testScaleInPlace();
        }
    }

    @Test(timeout=60000)
    public void testEbeAddPrecondition() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeAddPrecondition();
        }
    }

    @Test(timeout=60000)
    public void testEbeSubtractPrecondition() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeSubtractPrecondition();
        }
    }

    @Test(timeout=60000)
    public void testEbeMultiplyPrecondition() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeMultiplyPrecondition();
        }
    }

    @Test(timeout=60000)
    public void testEbeDividePrecondition() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeDividePrecondition();
        }
    }

    @Test(timeout=60000)
    public void testEbeAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeAdd();
        }
    }

    @Test(timeout=60000)
    public void testEbeSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeSubtract();
        }
    }

    @Test(timeout=60000)
    public void testEbeMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeMultiply();
        }
    }

    @Test(timeout=60000)
    public void testEbeDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testEbeDivide();
        }
    }

    @Test(timeout=60000)
    public void testL1DistanceDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testL1DistanceDouble();
        }
    }

    @Test(timeout=60000)
    public void testL1DistanceInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testL1DistanceInt();
        }
    }

    @Test(timeout=60000)
    public void testL2DistanceDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testL2DistanceDouble();
        }
    }

    @Test(timeout=60000)
    public void testL2DistanceInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testL2DistanceInt();
        }
    }

    @Test(timeout=60000)
    public void testLInfDistanceDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testLInfDistanceDouble();
        }
    }

    @Test(timeout=60000)
    public void testLInfDistanceInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testLInfDistanceInt();
        }
    }

    @Test(timeout=60000)
    public void testCheckOrder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCheckOrder();
        }
    }

    @Test(timeout=60000)
    public void testIsMonotonic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testIsMonotonic();
        }
    }

    @Test(timeout=60000)
    public void testIsMonotonicComparable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testIsMonotonicComparable();
        }
    }

    @Test(timeout=60000)
    public void testCheckRectangular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCheckRectangular();
        }
    }

    @Test(timeout=60000)
    public void testCheckPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCheckPositive();
        }
    }

    @Test(timeout=60000)
    public void testCheckNonNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCheckNonNegative();
        }
    }

    @Test(timeout=60000)
    public void testCheckNonNegative2D() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCheckNonNegative2D();
        }
    }

    @Test(timeout=60000)
    public void testSortInPlace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testSortInPlace();
        }
    }

    @Test(timeout=60000)
    public void testSortInPlaceExample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testSortInPlaceExample();
        }
    }

    @Test(timeout=60000)
    public void testSortInPlaceFailures() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testSortInPlaceFailures();
        }
    }

    @Test(timeout=60000)
    public void testCopyOfInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCopyOfInt();
        }
    }

    @Test(timeout=60000)
    public void testCopyOfInt2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCopyOfInt2();
        }
    }

    @Test(timeout=60000)
    public void testCopyOfInt3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCopyOfInt3();
        }
    }

    @Test(timeout=60000)
    public void testCopyOfDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCopyOfDouble();
        }
    }

    @Test(timeout=60000)
    public void testCopyOfDouble2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCopyOfDouble2();
        }
    }

    @Test(timeout=60000)
    public void testCopyOfDouble3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testCopyOfDouble3();
        }
    }

    @Test(timeout=60000)
    public void testLinearCombination1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testLinearCombination1();
        }
    }

    @Test(timeout=60000)
    public void testLinearCombination2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testLinearCombination2();
        }
    }

    @Test(timeout=60000)
    public void testLinearCombinationInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testLinearCombinationInfinite();
        }
    }

    @Test(timeout=60000)
    public void testArrayEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testArrayEquals();
        }
    }

    @Test(timeout=60000)
    public void testArrayEqualsIncludingNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testArrayEqualsIncludingNaN();
        }
    }

    @Test(timeout=60000)
    public void testNormalizeArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testNormalizeArray();
        }
    }

    @Test(timeout=60000)
    public void testScale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MathArraysTest object = new org.apache.commons.math3.util.MathArraysTest();
               object.testScale();
        }
    }

}