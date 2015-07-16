package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SphericalCoordinatesTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testCoordinatesStoC() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest object = new org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest();
               object.testCoordinatesStoC();
        }
    }

    @Test(timeout=1800000)
    public void testCoordinatesCtoS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest object = new org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest();
               object.testCoordinatesCtoS();
        }
    }

    @Test(timeout=1800000)
    public void testGradient() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest object = new org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest();
               object.testGradient();
        }
    }

    @Test(timeout=1800000)
    public void testHessian() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest object = new org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest();
               object.testHessian();
        }
    }

    @Test(timeout=1800000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest object = new org.apache.commons.math3.geometry.euclidean.threed.SphericalCoordinatesTest();
               object.testSerialization();
        }
    }

}