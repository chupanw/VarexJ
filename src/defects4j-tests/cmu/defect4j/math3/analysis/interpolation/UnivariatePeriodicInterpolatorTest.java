package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnivariatePeriodicInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest();
               object.testSine();
        }
    }

    @Test(timeout=60000)
    public void testLessThanOnePeriodCoverage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest();
               object.testLessThanOnePeriodCoverage();
        }
    }

    @Test(timeout=60000)
    public void testMoreThanOnePeriodCoverage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest();
               object.testMoreThanOnePeriodCoverage();
        }
    }

    @Test(timeout=60000)
    public void testTooFewSamples() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest();
               object.testTooFewSamples();
        }
    }

    @Test(timeout=60000)
    public void testUnsortedSamples() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NonMonotonicSequenceException", config)) {
               org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.UnivariatePeriodicInterpolatorTest();
               object.testUnsortedSamples();
        }
    }

}