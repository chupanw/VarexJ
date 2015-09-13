package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LogNormalDistributionTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math22b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testDensity();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testPreconditions();
        }
    }

    @Test(timeout=1800000)
    public void testQuantiles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testQuantiles();
        }
    }

    @Test(timeout=1800000)
    public void testGetScale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testGetScale();
        }
    }

    @Test(timeout=1800000)
    public void testGetShape() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testGetShape();
        }
    }

    @Test(timeout=1800000)
    public void testExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testExtremeValues();
        }
    }

    @Test(timeout=1800000)
    public void testMeanVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testMeanVariance();
        }
    }

    @Test(timeout=1800000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=1800000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=1800000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.setUp();
               object.testIsSupportUpperBoundInclusive();
        }
    }

}