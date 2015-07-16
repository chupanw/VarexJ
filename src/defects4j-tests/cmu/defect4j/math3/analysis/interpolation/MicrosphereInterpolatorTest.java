package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MicrosphereInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testParaboloid2D() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatorTest();
               object.testParaboloid2D();
        }
    }

    @Test(timeout=1800000)
    public void testLinearFunction2D() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.MicrosphereInterpolatorTest();
               object.testLinearFunction2D();
        }
    }

}