package cmu.defect4j.math3.optimization.direct;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CMAESOptimizerTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math18b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=3600000)
    public void testInitOutofbounds1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testInitOutofbounds1();
        }
    }

    @Test(timeout=3600000)
    public void testInitOutofbounds2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testInitOutofbounds2();
        }
    }

    @Test(timeout=3600000)
    public void testBoundariesDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testBoundariesDimensionMismatch();
        }
    }

    @Test(timeout=3600000)
    public void testUnsupportedBoundaries1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testUnsupportedBoundaries1();
        }
    }

    @Test(timeout=3600000)
    public void testUnsupportedBoundaries2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testUnsupportedBoundaries2();
        }
    }

    @Test(timeout=3600000)
    public void testInputSigmaNegative() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testInputSigmaNegative();
        }
    }

    @Test(timeout=3600000)
    public void testInputSigmaOutOfRange() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testInputSigmaOutOfRange();
        }
    }

    @Test(timeout=3600000)
    public void testInputSigmaDimensionMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testInputSigmaDimensionMismatch();
        }
    }

    @Test(timeout=3600000)
    public void testRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testRosen();
        }
    }

    @Test(timeout=3600000)
    public void testMaximize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testMaximize();
        }
    }

    @Test(timeout=3600000)
    public void testEllipse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testEllipse();
        }
    }

    @Test(timeout=3600000)
    public void testElliRotated() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testElliRotated();
        }
    }

    @Test(timeout=3600000)
    public void testCigar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testCigar();
        }
    }

    @Test(timeout=3600000)
    public void testTwoAxes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testTwoAxes();
        }
    }

    @Test(timeout=3600000)
    public void testCigTab() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testCigTab();
        }
    }

    @Test(timeout=3600000)
    public void testSphere() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testSphere();
        }
    }

    @Test(timeout=3600000)
    public void testTablet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testTablet();
        }
    }

    @Test(timeout=3600000)
    public void testDiffPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testDiffPow();
        }
    }

    @Test(timeout=3600000)
    public void testSsDiffPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testSsDiffPow();
        }
    }

    @Test(timeout=3600000)
    public void testAckley() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testAckley();
        }
    }

    @Test(timeout=3600000)
    public void testRastrigin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testRastrigin();
        }
    }

    @Test(timeout=3600000)
    public void testConstrainedRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testConstrainedRosen();
        }
    }

    @Test(timeout=3600000)
    public void testDiagonalRosen() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testDiagonalRosen();
        }
    }

    @Test(timeout=3600000)
    public void testMath864() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testMath864();
        }
    }

    @Test(timeout=3600000)
    public void testBoundaryRangeTooLarge() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testBoundaryRangeTooLarge();
        }
    }

    @Test(timeout=3600000)
    public void testFitAccuracyDependsOnBoundary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.CMAESOptimizerTest object = new org.apache.commons.math3.optimization.direct.CMAESOptimizerTest();
               object.testFitAccuracyDependsOnBoundary();
        }
    }

}