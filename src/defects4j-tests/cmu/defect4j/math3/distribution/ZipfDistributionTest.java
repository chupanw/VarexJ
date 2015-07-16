package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ZipfDistributionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testMoments();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testPreconditions1();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testPreconditions2();
        }
    }

    @Test(timeout=1800000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=1800000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=1800000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testConsistencyAtSupportBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testConsistencyAtSupportBounds();
        }
    }

    @Test(timeout=1800000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ZipfDistributionTest object = new org.apache.commons.math3.distribution.ZipfDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

}