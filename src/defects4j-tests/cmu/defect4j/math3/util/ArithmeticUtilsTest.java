package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ArithmeticUtilsTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testPow();
        }
    }

    @Test(timeout=60000)
    public void testAddAndCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testAddAndCheck();
        }
    }

    @Test(timeout=60000)
    public void testAddAndCheckLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testAddAndCheckLong();
        }
    }

    @Test(timeout=60000)
    public void testBinomialCoefficient() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testBinomialCoefficient();
        }
    }

    @Test(timeout=60000)
    public void test0Choose0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.test0Choose0();
        }
    }

    @Test(timeout=60000)
    public void testBinomialCoefficientFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testBinomialCoefficientFail();
        }
    }

    @Test(timeout=60000)
    public void testBinomialCoefficientLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testBinomialCoefficientLarge();
        }
    }

    @Test(timeout=60000)
    public void testFactorial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testFactorial();
        }
    }

    @Test(timeout=60000)
    public void testFactorialFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testFactorialFail();
        }
    }

    @Test(timeout=60000)
    public void testGcd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testGcd();
        }
    }

    @Test(timeout=60000)
    public void testGcdConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testGcdConsistency();
        }
    }

    @Test(timeout=60000)
    public void testGcdLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testGcdLong();
        }
    }

    @Test(timeout=60000)
    public void testLcm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testLcm();
        }
    }

    @Test(timeout=60000)
    public void testLcmLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testLcmLong();
        }
    }

    @Test(timeout=60000)
    public void testMulAndCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testMulAndCheck();
        }
    }

    @Test(timeout=60000)
    public void testMulAndCheckLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testMulAndCheckLong();
        }
    }

    @Test(timeout=60000)
    public void testSubAndCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testSubAndCheck();
        }
    }

    @Test(timeout=60000)
    public void testSubAndCheckErrorMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testSubAndCheckErrorMessage();
        }
    }

    @Test(timeout=60000)
    public void testSubAndCheckLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testSubAndCheckLong();
        }
    }

    @Test(timeout=60000)
    public void testIsPowerOfTwo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testIsPowerOfTwo();
        }
    }

    @Test(timeout=60000)
    public void testStirlingS2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testStirlingS2();
        }
    }

    @Test(timeout=60000)
    public void testStirlingS2NegativeN() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testStirlingS2NegativeN();
        }
    }

    @Test(timeout=60000)
    public void testStirlingS2LargeK() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testStirlingS2LargeK();
        }
    }

    @Test(timeout=60000)
    public void testStirlingS2Overflow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testStirlingS2Overflow();
        }
    }

}