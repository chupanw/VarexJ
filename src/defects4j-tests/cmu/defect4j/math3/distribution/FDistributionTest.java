package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FDistributionTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math22b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testMoments();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1800000)
    public void testDfAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testDfAccessors();
        }
    }

    @Test(timeout=1800000)
    public void testCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1800000)
    public void testLargeDegreesOfFreedom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testLargeDegreesOfFreedom();
        }
    }

    @Test(timeout=1800000)
    public void testSmallDegreesOfFreedom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testSmallDegreesOfFreedom();
        }
    }

    @Test(timeout=1800000)
    public void testMath785() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testMath785();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testPreconditions();
        }
    }

    @Test(timeout=1800000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=1800000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=1800000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.setUp();
               object.testIsSupportUpperBoundInclusive();
        }
    }

}