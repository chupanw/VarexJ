package cmu.defect4j.math3.ode;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class JacobianMatricesTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testLowAccuracyExternalDifferentiation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.JacobianMatricesTest object = new org.apache.commons.math3.ode.JacobianMatricesTest();
               object.testLowAccuracyExternalDifferentiation();
        }
    }

    @Test(timeout=600000)
    public void testHighAccuracyExternalDifferentiation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.JacobianMatricesTest object = new org.apache.commons.math3.ode.JacobianMatricesTest();
               object.testHighAccuracyExternalDifferentiation();
        }
    }

    @Test(timeout=600000)
    public void testInternalDifferentiation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.JacobianMatricesTest object = new org.apache.commons.math3.ode.JacobianMatricesTest();
               object.testInternalDifferentiation();
        }
    }

    @Test(timeout=600000)
    public void testAnalyticalDifferentiation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.JacobianMatricesTest object = new org.apache.commons.math3.ode.JacobianMatricesTest();
               object.testAnalyticalDifferentiation();
        }
    }

    @Test(timeout=600000)
    public void testFinalResult() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.JacobianMatricesTest object = new org.apache.commons.math3.ode.JacobianMatricesTest();
               object.testFinalResult();
        }
    }

    @Test(timeout=600000)
    public void testParameterizable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.JacobianMatricesTest object = new org.apache.commons.math3.ode.JacobianMatricesTest();
               object.testParameterizable();
        }
    }

}