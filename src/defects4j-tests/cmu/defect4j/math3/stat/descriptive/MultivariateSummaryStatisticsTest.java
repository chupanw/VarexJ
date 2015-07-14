package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateSummaryStatisticsTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testSetterInjection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testSetterInjection();
        }
    }

    @Test(timeout=600000)
    public void testShuffledStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testShuffledStatistics();
        }
    }

    @Test(timeout=600000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=600000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testSerialization();
        }
    }

    @Test(timeout=600000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testToString();
        }
    }

    @Test(timeout=600000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testStats();
        }
    }

    @Test(timeout=600000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testN0andN1Conditions();
        }
    }

    @Test(timeout=600000)
    public void testSetterIllegalState() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testSetterIllegalState();
        }
    }

    @Test(timeout=600000)
    public void testDimension() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testDimension();
        }
    }

    @Test(timeout=600000)
    public void testNaNContracts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatisticsTest();
               object.testNaNContracts();
        }
    }

}