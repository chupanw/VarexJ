package cmu.defect4j.math3.ode.sampling;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NordsieckStepInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void derivativesConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.NordsieckStepInterpolatorTest object = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolatorTest();
               object.derivativesConsistency();
        }
    }

    @Test(timeout=1800000)
    public void serialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.NordsieckStepInterpolatorTest object = new org.apache.commons.math3.ode.sampling.NordsieckStepInterpolatorTest();
               object.serialization();
        }
    }

}