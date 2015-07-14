package cmu.defect4j.math3.stat.inference;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TTestTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testSmallSamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TTestTest object = new org.apache.commons.math3.stat.inference.TTestTest();
               object.setUp();
               object.testSmallSamples();
        }
    }

    @Test(timeout=600000)
    public void testOneSampleT() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TTestTest object = new org.apache.commons.math3.stat.inference.TTestTest();
               object.setUp();
               object.testOneSampleT();
        }
    }

    @Test(timeout=600000)
    public void testOneSampleTTest() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TTestTest object = new org.apache.commons.math3.stat.inference.TTestTest();
               object.setUp();
               object.testOneSampleTTest();
        }
    }

    @Test(timeout=600000)
    public void testTwoSampleTHeterscedastic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TTestTest object = new org.apache.commons.math3.stat.inference.TTestTest();
               object.setUp();
               object.testTwoSampleTHeterscedastic();
        }
    }

    @Test(timeout=600000)
    public void testTwoSampleTHomoscedastic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TTestTest object = new org.apache.commons.math3.stat.inference.TTestTest();
               object.setUp();
               object.testTwoSampleTHomoscedastic();
        }
    }

    @Test(timeout=600000)
    public void testPaired() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.TTestTest object = new org.apache.commons.math3.stat.inference.TTestTest();
               object.setUp();
               object.testPaired();
        }
    }

}