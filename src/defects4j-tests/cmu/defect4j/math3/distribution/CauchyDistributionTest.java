package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CauchyDistributionTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math22.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=1800000)
    public void testScale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testScale();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1800000)
    public void testMedian() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testMedian();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=1800000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=1800000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1800000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.CauchyDistributionTest object = new org.apache.commons.math3.distribution.CauchyDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

}