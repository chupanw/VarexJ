package cmu.defect4j.math3.stat.correlation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PearsonsCorrelationTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testLongly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testLongly();
        }
    }

    @Test(timeout=60000)
    public void testSwissFertility() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testSwissFertility();
        }
    }

    @Test(timeout=60000)
    public void testInsufficientData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testInsufficientData();
        }
    }

    @Test(timeout=60000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testConstant();
        }
    }

    @Test(timeout=60000)
    public void testPValueNearZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testPValueNearZero();
        }
    }

    @Test(timeout=60000)
    public void testStdErrorConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testStdErrorConsistency();
        }
    }

    @Test(timeout=60000)
    public void testCovarianceConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testCovarianceConsistency();
        }
    }

    @Test(timeout=60000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest object = new org.apache.commons.math3.stat.correlation.PearsonsCorrelationTest();
               object.testConsistency();
        }
    }

}