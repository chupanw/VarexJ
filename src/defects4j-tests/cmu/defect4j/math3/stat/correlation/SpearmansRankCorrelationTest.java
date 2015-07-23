package cmu.defect4j.math3.stat.correlation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SpearmansRankCorrelationTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testConstant();
        }
    }

    @Test(timeout=1800000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testLongly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testLongly();
        }
    }

    @Test(timeout=1800000)
    public void testInsufficientData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testInsufficientData();
        }
    }

    @Test(timeout=1800000)
    public void testSwiss() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testSwiss();
        }
    }

    @Test(timeout=1800000)
    public void testStdErrorConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testStdErrorConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testCovarianceConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testCovarianceConsistency();
        }
    }

    @Test(timeout=1800000)
    public void testSwissFertility() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testSwissFertility();
        }
    }

    @Test(timeout=1800000)
    public void testPValueNearZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest object = new org.apache.commons.math3.stat.correlation.SpearmansRankCorrelationTest();
               object.testPValueNearZero();
        }
    }

}