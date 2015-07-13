package cmu.defect4j.math3.analysis.polynomials;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolynomialFunctionNewtonFormTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testQuinticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest();
               object.testQuinticFunction();
        }
    }

    @Test(timeout=60000)
    public void testQuadraticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest();
               object.testQuadraticFunction();
        }
    }

    @Test(timeout=60000)
    public void testLinearFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest();
               object.testLinearFunction();
        }
    }

    @Test(timeout=60000)
    public void testDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest();
               object.testDerivative();
        }
    }

    @Test(timeout=60000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonFormTest();
               object.testParameters();
        }
    }

}