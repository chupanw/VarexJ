package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LineTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testRevert() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testRevert();
        }
    }

    @Test(timeout=1800000)
    public void testContains() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testContains();
        }
    }

    @Test(timeout=1800000)
    public void testSimilar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testSimilar();
        }
    }

    @Test(timeout=1800000)
    public void testPointDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testPointDistance();
        }
    }

    @Test(timeout=1800000)
    public void testLineDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testLineDistance();
        }
    }

    @Test(timeout=1800000)
    public void testClosest() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testClosest();
        }
    }

    @Test(timeout=1800000)
    public void testIntersection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.LineTest object = new org.apache.commons.math3.geometry.euclidean.threed.LineTest();
               object.testIntersection();
        }
    }

}