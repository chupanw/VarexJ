package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StableRandomGeneratorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testNextDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testNextDouble();
        }
    }

    @Test(timeout=60000)
    public void testGaussianCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testGaussianCase();
        }
    }

    @Test(timeout=60000)
    public void testCauchyCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testCauchyCase();
        }
    }

    @Test(timeout=60000)
    public void testAlphaRangeBelowZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testAlphaRangeBelowZero();
        }
    }

    @Test(timeout=60000)
    public void testAlphaRangeAboveTwo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testAlphaRangeAboveTwo();
        }
    }

    @Test(timeout=60000)
    public void testBetaRangeBelowMinusOne() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testBetaRangeBelowMinusOne();
        }
    }

    @Test(timeout=60000)
    public void testBetaRangeAboveOne() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.StableRandomGeneratorTest object = new org.apache.commons.math3.random.StableRandomGeneratorTest();
               object.testBetaRangeAboveOne();
        }
    }

}