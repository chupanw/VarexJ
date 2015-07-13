package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DescriptiveStatisticsTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testToString();
        }
    }

    @Test(timeout=60000)
    public void testSetterInjection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testSetterInjection();
        }
    }

    @Test(timeout=60000)
    public void testWindowSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testWindowSize();
        }
    }

    @Test(timeout=60000)
    public void testGetValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testGetValues();
        }
    }

    @Test(timeout=60000)
    public void testShuffledStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testShuffledStatistics();
        }
    }

    @Test(timeout=60000)
    public void testPercentileSetter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testPercentileSetter();
        }
    }

    @Test(timeout=60000)
    public void test20090720() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.test20090720();
        }
    }

    @Test(timeout=60000)
    public void testRemoval() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testRemoval();
        }
    }

    @Test(timeout=60000)
    public void testSummaryConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testSummaryConsistency();
        }
    }

    @Test(timeout=60000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest object = new org.apache.commons.math3.stat.descriptive.DescriptiveStatisticsTest();
               object.testCopy();
        }
    }

}