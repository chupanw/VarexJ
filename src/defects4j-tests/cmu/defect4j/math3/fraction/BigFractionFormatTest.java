package cmu.defect4j.math3.fraction;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BigFractionFormatTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testFormat();
        }
    }

    @Test(timeout=60000)
    public void testFormatNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testFormatNegative();
        }
    }

    @Test(timeout=60000)
    public void testFormatZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testFormatZero();
        }
    }

    @Test(timeout=60000)
    public void testFormatImproper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testFormatImproper();
        }
    }

    @Test(timeout=60000)
    public void testFormatImproperNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testFormatImproperNegative();
        }
    }

    @Test(timeout=60000)
    public void testParse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParse();
        }
    }

    @Test(timeout=60000)
    public void testParseInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseInteger();
        }
    }

    @Test(timeout=60000)
    public void testParseInvalid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseInvalid();
        }
    }

    @Test(timeout=60000)
    public void testParseInvalidDenominator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseInvalidDenominator();
        }
    }

    @Test(timeout=60000)
    public void testParseNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseNegative();
        }
    }

    @Test(timeout=60000)
    public void testParseProper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseProper();
        }
    }

    @Test(timeout=60000)
    public void testParseProperNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseProperNegative();
        }
    }

    @Test(timeout=60000)
    public void testParseProperInvalidMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseProperInvalidMinus();
        }
    }

    @Test(timeout=60000)
    public void testParseBig() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testParseBig();
        }
    }

    @Test(timeout=60000)
    public void testNumeratorFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testNumeratorFormat();
        }
    }

    @Test(timeout=60000)
    public void testDenominatorFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testDenominatorFormat();
        }
    }

    @Test(timeout=60000)
    public void testWholeFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testWholeFormat();
        }
    }

    @Test(timeout=60000)
    public void testLongFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testLongFormat();
        }
    }

    @Test(timeout=60000)
    public void testDoubleFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.BigFractionFormatTest object = new org.apache.commons.math3.fraction.BigFractionFormatTest();
               object.setUp();
               object.testDoubleFormat();
        }
    }

}