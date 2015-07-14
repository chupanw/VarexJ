package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class VectorialCovarianceTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest();
               object.testSerial();
        }
    }

    @Test(timeout=600000)
    public void testMismatch() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest();
               object.testMismatch();
        }
    }

    @Test(timeout=600000)
    public void testSimplistic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest();
               object.testSimplistic();
        }
    }

    @Test(timeout=600000)
    public void testBasicStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialCovarianceTest();
               object.testBasicStats();
        }
    }

}