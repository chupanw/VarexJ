package cmu.defect4j.math3.fraction;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BigFractionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testConstructor();
        }
    }

    @Test(timeout=600000)
    public void testGoldenRatio() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testGoldenRatio();
        }
    }

    @Test(timeout=600000)
    public void testDoubleConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testDoubleConstructor();
        }
    }

    @Test(timeout=600000)
    public void testDigitLimitConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testDigitLimitConstructor();
        }
    }

    @Test(timeout=600000)
    public void testEpsilonLimitConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testEpsilonLimitConstructor();
        }
    }

    @Test(timeout=600000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=600000)
    public void testDoubleValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testDoubleValue();
        }
    }

    @Test(timeout=600000)
    public void testDoubleValueForLargeNumeratorAndDenominator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testDoubleValueForLargeNumeratorAndDenominator();
        }
    }

    @Test(timeout=600000)
    public void testFloatValueForLargeNumeratorAndDenominator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testFloatValueForLargeNumeratorAndDenominator();
        }
    }

    @Test(timeout=600000)
    public void testFloatValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testFloatValue();
        }
    }

    @Test(timeout=600000)
    public void testLongValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testLongValue();
        }
    }

    @Test(timeout=600000)
    public void testConstructorDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testConstructorDouble();
        }
    }

    @Test(timeout=600000)
    public void testBigDecimalValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testBigDecimalValue();
        }
    }

    @Test(timeout=600000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=600000)
    public void testGetReducedFraction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testGetReducedFraction();
        }
    }

    @Test(timeout=600000)
    public void testPercentage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testPercentage();
        }
    }

    @Test(timeout=600000)
    public void testMath340() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testMath340();
        }
    }

    @Test(timeout=600000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testDivide();
        }
    }

    @Test(timeout=600000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testAdd();
        }
    }

    @Test(timeout=600000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testSubtract();
        }
    }

    @Test(timeout=600000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testMultiply();
        }
    }

    @Test(timeout=600000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testNegate();
        }
    }

    @Test(timeout=600000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testReciprocal();
        }
    }

    @Test(timeout=600000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testPow();
        }
    }

    @Test(timeout=600000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testAbs();
        }
    }

    @Test(timeout=600000)
    public void testIntValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testIntValue();
        }
    }

    @Test(timeout=600000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionTest object = new org.apache.commons.math3.fraction.BigFractionTest();
               object.testSerial();
        }
    }

}