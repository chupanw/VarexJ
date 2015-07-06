package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HighamHall54IntegratorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testMinStep() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testMinStep();
        }
    }

    @Test(timeout=60000)
    public void testIncreasingTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testIncreasingTolerance();
        }
    }

    @Test(timeout=60000)
    public void testEvents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testEvents();
        }
    }

    @Test(timeout=60000)
    public void testWrongDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testWrongDerivative();
        }
    }

    @Test(timeout=60000)
    public void testEventsErrors() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest$LocalException", config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testEventsErrors();
        }
    }

    @Test(timeout=60000)
    public void testEventsNoConvergence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testEventsNoConvergence();
        }
    }

    @Test(timeout=60000)
    public void testSanityChecks() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testSanityChecks();
        }
    }

    @Test(timeout=60000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=60000)
    public void testKepler() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.HighamHall54IntegratorTest();
               object.testKepler();
        }
    }

}