package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HypergeometricDistributionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testAccessors();
        }
    }

    @Test(timeout=60000)
    public void testDegenerateNoFailures() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testDegenerateNoFailures();
        }
    }

    @Test(timeout=60000)
    public void testDegenerateNoSuccesses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testDegenerateNoSuccesses();
        }
    }

    @Test(timeout=60000)
    public void testDegenerateFullSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testDegenerateFullSample();
        }
    }

    @Test(timeout=60000)
    public void testLargeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testLargeValues();
        }
    }

    @Test(timeout=60000)
    public void testMoreLargeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testMoreLargeValues();
        }
    }

    @Test(timeout=60000)
    public void testMath644() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testMath644();
        }
    }

    @Test(timeout=60000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testMoments();
        }
    }

    @Test(timeout=60000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testPreconditions();
        }
    }

    @Test(timeout=60000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=60000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=60000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=60000)
    public void testConsistencyAtSupportBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testConsistencyAtSupportBounds();
        }
    }

    @Test(timeout=60000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=60000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.HypergeometricDistributionTest object = new org.apache.commons.math3.distribution.HypergeometricDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

}