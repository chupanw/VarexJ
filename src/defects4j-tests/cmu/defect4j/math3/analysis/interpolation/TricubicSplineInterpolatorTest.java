package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TricubicSplineInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testWave() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest();
               object.testWave();
        }
    }

    @Test(timeout=60000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=60000)
    public void testPlane() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.TricubicSplineInterpolatorTest();
               object.testPlane();
        }
    }

}