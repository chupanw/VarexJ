package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class VectorialMeanTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest();
               object.testSerial();
        }
    }

    @Test(timeout=1800000)
    public void testMismatch() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest();
               object.testMismatch();
        }
    }

    @Test(timeout=1800000)
    public void testSimplistic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest();
               object.testSimplistic();
        }
    }

    @Test(timeout=1800000)
    public void testBasicStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest object = new org.apache.commons.math3.stat.descriptive.moment.VectorialMeanTest();
               object.testBasicStats();
        }
    }

}