package cmu.defect4j.math3.stat.correlation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CovarianceTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testLongly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.CovarianceTest object = new org.apache.commons.math3.stat.correlation.CovarianceTest();
               object.testLongly();
        }
    }

    @Test(timeout=60000)
    public void testSwissFertility() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.CovarianceTest object = new org.apache.commons.math3.stat.correlation.CovarianceTest();
               object.testSwissFertility();
        }
    }

    @Test(timeout=60000)
    public void testOneColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.CovarianceTest object = new org.apache.commons.math3.stat.correlation.CovarianceTest();
               object.testOneColumn();
        }
    }

    @Test(timeout=60000)
    public void testInsufficientData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.CovarianceTest object = new org.apache.commons.math3.stat.correlation.CovarianceTest();
               object.testInsufficientData();
        }
    }

    @Test(timeout=60000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.CovarianceTest object = new org.apache.commons.math3.stat.correlation.CovarianceTest();
               object.testConstant();
        }
    }

    @Test(timeout=60000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.correlation.CovarianceTest object = new org.apache.commons.math3.stat.correlation.CovarianceTest();
               object.testConsistency();
        }
    }

}