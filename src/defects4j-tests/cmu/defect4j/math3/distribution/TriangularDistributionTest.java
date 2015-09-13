package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TriangularDistributionTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math22b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testPreconditions1();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testPreconditions2();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testPreconditions3();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testPreconditions4();
        }
    }

    @Test(timeout=1800000)
    public void testMeanVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testMeanVariance();
        }
    }

    @Test(timeout=1800000)
    public void testGetLowerBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testGetLowerBound();
        }
    }

    @Test(timeout=1800000)
    public void testGetUpperBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testGetUpperBound();
        }
    }

    @Test(timeout=1800000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=1800000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=1800000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1800000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1800000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.setUp();
               object.testIsSupportUpperBoundInclusive();
        }
    }

}