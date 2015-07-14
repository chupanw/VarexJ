package cmu.defect4j.math3.geometry.euclidean.twod;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LineTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testAbscissa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testAbscissa();
        }
    }

    @Test(timeout=600000)
    public void testPointAt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testPointAt();
        }
    }

    @Test(timeout=600000)
    public void testOriginOffset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testOriginOffset();
        }
    }

    @Test(timeout=600000)
    public void testParallel() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testParallel();
        }
    }

    @Test(timeout=600000)
    public void testTransform() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testTransform();
        }
    }

    @Test(timeout=600000)
    public void testContains() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testContains();
        }
    }

    @Test(timeout=600000)
    public void testIntersection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testIntersection();
        }
    }

    @Test(timeout=600000)
    public void testOffset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testOffset();
        }
    }

    @Test(timeout=600000)
    public void testDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testDistance();
        }
    }

}