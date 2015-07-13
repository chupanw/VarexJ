package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MidpointIntegratorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testDecreasingSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest();
               object.testDecreasingSteps();
        }
    }

    @Test(timeout=60000)
    public void testSmallStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest();
               object.testSmallStep();
        }
    }

    @Test(timeout=60000)
    public void testBigStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest();
               object.testBigStep();
        }
    }

    @Test(timeout=60000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=60000)
    public void testStepSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest();
               object.testStepSize();
        }
    }

    @Test(timeout=60000)
    public void testDimensionCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.MidpointIntegratorTest();
               object.testDimensionCheck();
        }
    }

}