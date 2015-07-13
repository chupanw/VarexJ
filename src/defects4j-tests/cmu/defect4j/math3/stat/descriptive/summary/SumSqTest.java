package cmu.defect4j.math3.stat.descriptive.summary;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SumSqTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSpecialValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testSpecialValues();
        }
    }

    @Test(timeout=60000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testSerialization();
        }
    }

    @Test(timeout=60000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testSerial();
        }
    }

    @Test(timeout=60000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testConsistency();
        }
    }

    @Test(timeout=60000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=60000)
    public void testIncrementation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testIncrementation();
        }
    }

    @Test(timeout=60000)
    public void testMomentSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testMomentSmallSamples();
        }
    }

    @Test(timeout=60000)
    public void testCopyConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testCopyConsistency();
        }
    }

    @Test(timeout=60000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=60000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=60000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

    @Test(timeout=60000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testWeightedConsistency();
        }
    }

    @Test(timeout=60000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.summary.SumSqTest object = new org.apache.commons.math3.stat.descriptive.summary.SumSqTest();
               object.testCopy();
        }
    }

}