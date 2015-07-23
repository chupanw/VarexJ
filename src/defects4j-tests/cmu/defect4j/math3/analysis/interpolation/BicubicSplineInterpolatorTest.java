package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BicubicSplineInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testPlane() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest();
               object.testPlane();
        }
    }

    @Test(timeout=1800000)
    public void testParaboloid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest();
               object.testParaboloid();
        }
    }

    @Test(timeout=1800000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatorTest();
               object.testPreconditions();
        }
    }

}