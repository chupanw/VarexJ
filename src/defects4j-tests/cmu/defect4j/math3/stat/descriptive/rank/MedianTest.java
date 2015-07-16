package cmu.defect4j.math3.stat.descriptive.rank;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MedianTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testWeightedConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MedianTest object = new org.apache.commons.math3.stat.descriptive.rank.MedianTest();
               object.testWeightedConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MedianTest object = new org.apache.commons.math3.stat.descriptive.rank.MedianTest();
               object.testCopy();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MedianTest object = new org.apache.commons.math3.stat.descriptive.rank.MedianTest();
               object.testEvaluation();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluateArraySegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MedianTest object = new org.apache.commons.math3.stat.descriptive.rank.MedianTest();
               object.testEvaluateArraySegment();
        }
    }

    @Test(timeout=1800000)
    public void testEvaluateArraySegmentWeighted() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.rank.MedianTest object = new org.apache.commons.math3.stat.descriptive.rank.MedianTest();
               object.testEvaluateArraySegmentWeighted();
        }
    }

}