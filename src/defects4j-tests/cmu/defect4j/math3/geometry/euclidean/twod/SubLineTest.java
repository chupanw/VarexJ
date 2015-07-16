package cmu.defect4j.math3.geometry.euclidean.twod;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SubLineTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testNoSegments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testNoSegments();
        }
    }

    @Test(timeout=1800000)
    public void testSeveralSegments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testSeveralSegments();
        }
    }

    @Test(timeout=1800000)
    public void testEndPoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testEndPoints();
        }
    }

    @Test(timeout=1800000)
    public void testNoEndPoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testNoEndPoints();
        }
    }

    @Test(timeout=1800000)
    public void testHalfInfiniteNeg() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testHalfInfiniteNeg();
        }
    }

    @Test(timeout=1800000)
    public void testHalfInfinitePos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testHalfInfinitePos();
        }
    }

    @Test(timeout=1800000)
    public void testIntersectionInsideInside() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testIntersectionInsideInside();
        }
    }

    @Test(timeout=1800000)
    public void testIntersectionInsideBoundary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testIntersectionInsideBoundary();
        }
    }

    @Test(timeout=1800000)
    public void testIntersectionInsideOutside() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testIntersectionInsideOutside();
        }
    }

    @Test(timeout=1800000)
    public void testIntersectionBoundaryBoundary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testIntersectionBoundaryBoundary();
        }
    }

    @Test(timeout=1800000)
    public void testIntersectionBoundaryOutside() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testIntersectionBoundaryOutside();
        }
    }

    @Test(timeout=1800000)
    public void testIntersectionOutsideOutside() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.SubLineTest object = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();
               object.testIntersectionOutsideOutside();
        }
    }

}