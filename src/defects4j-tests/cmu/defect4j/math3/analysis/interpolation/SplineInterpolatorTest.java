package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SplineInterpolatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testInterpolateLinearDegenerateTwoSegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest();
               object.testInterpolateLinearDegenerateTwoSegment();
        }
    }

    @Test(timeout=1000000)
    public void testInterpolateLinearDegenerateThreeSegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest();
               object.testInterpolateLinearDegenerateThreeSegment();
        }
    }

    @Test(timeout=1000000)
    public void testInterpolateLinear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest();
               object.testInterpolateLinear();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=1000000)
    public void testInterpolateSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.SplineInterpolatorTest();
               object.testInterpolateSin();
        }
    }

}