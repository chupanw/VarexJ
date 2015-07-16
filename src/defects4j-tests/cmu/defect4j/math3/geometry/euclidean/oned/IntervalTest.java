package cmu.defect4j.math3.geometry.euclidean.oned;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class IntervalTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.oned.IntervalTest object = new org.apache.commons.math3.geometry.euclidean.oned.IntervalTest();
               object.testTolerance();
        }
    }

    @Test(timeout=1800000)
    public void testSinglePoint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.oned.IntervalTest object = new org.apache.commons.math3.geometry.euclidean.oned.IntervalTest();
               object.testSinglePoint();
        }
    }

    @Test(timeout=1800000)
    public void testInterval() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.oned.IntervalTest object = new org.apache.commons.math3.geometry.euclidean.oned.IntervalTest();
               object.testInterval();
        }
    }

    @Test(timeout=1800000)
    public void testInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.oned.IntervalTest object = new org.apache.commons.math3.geometry.euclidean.oned.IntervalTest();
               object.testInfinite();
        }
    }

}