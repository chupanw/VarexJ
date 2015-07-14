package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SummaryStatisticsTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testSerialization();
        }
    }

    @Test(timeout=600000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=600000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testStats();
        }
    }

    @Test(timeout=600000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testN0andN1Conditions();
        }
    }

    @Test(timeout=600000)
    public void testProductAndGeometricMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testProductAndGeometricMean();
        }
    }

    @Test(timeout=600000)
    public void testSetterIllegalState() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testSetterIllegalState();
        }
    }

    @Test(timeout=600000)
    public void testNaNContracts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testNaNContracts();
        }
    }

    @Test(timeout=600000)
    public void testGetSummary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testGetSummary();
        }
    }

    @Test(timeout=600000)
    public void testOverrideVarianceWithMathClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testOverrideVarianceWithMathClass();
        }
    }

    @Test(timeout=600000)
    public void testOverrideMeanWithMathClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testOverrideMeanWithMathClass();
        }
    }

    @Test(timeout=600000)
    public void testOverrideGeoMeanWithMathClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testOverrideGeoMeanWithMathClass();
        }
    }

    @Test(timeout=600000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testCopy();
        }
    }

    @Test(timeout=600000)
    public void testSetterInjection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.SummaryStatisticsTest();
               object.testSetterInjection();
        }
    }

}