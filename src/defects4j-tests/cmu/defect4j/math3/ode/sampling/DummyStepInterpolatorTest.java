package cmu.defect4j.math3.ode.sampling;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DummyStepInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest object = new org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest();
               object.testSerialization();
        }
    }

    @Test(timeout=1800000)
    public void testNoReset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest object = new org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest();
               object.testNoReset();
        }
    }

    @Test(timeout=1800000)
    public void testFixedState() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest object = new org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest();
               object.testFixedState();
        }
    }

    @Test(timeout=1800000)
    public void testImpossibleSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest object = new org.apache.commons.math3.ode.sampling.DummyStepInterpolatorTest();
               object.testImpossibleSerialization();
        }
    }

}