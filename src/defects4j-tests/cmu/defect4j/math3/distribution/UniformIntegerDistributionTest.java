package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UniformIntegerDistributionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=60000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=60000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=60000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=60000)
    public void testConsistencyAtSupportBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testConsistencyAtSupportBounds();
        }
    }

    @Test(timeout=60000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=60000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformIntegerDistributionTest object = new org.apache.commons.math3.distribution.UniformIntegerDistributionTest();
               object.testIllegalArguments();
        }
    }

}