package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class VarianceTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testWeightedVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testWeightedVariance();
        }
    }

    @Test(timeout=1800000)
    public void testNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testNaN();
        }
    }

    @Test(timeout=1800000)
    public void testPopulation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testPopulation();
        }
    }

    @Test(timeout=1800000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testSerial();
        }
    }

    @Test(timeout=1800000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testSerialization();
        }
    }

    @Test(timeout=1800000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testIncrementation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testIncrementation();
        }
    }

    @Test(timeout=1800000)
    public void testMomentSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testMomentSmallSamples();
        }
    }

    @Test(timeout=1800000)
    public void testCopyConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testCopyConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testCopy();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=1800000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VarianceTest();
               object.testWeightedConsistency();
        }
    }

}