package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnivariateSolverUtilsTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testSolveNull() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveNull();
        }
    }

    @Test(timeout=600000)
    public void testSolveBadEndpoints() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveBadEndpoints();
        }
    }

    @Test(timeout=600000)
    public void testSolveBadAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveBadAccuracy();
        }
    }

    @Test(timeout=600000)
    public void testSolveSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveSin();
        }
    }

    @Test(timeout=600000)
    public void testSolveAccuracyNull() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveAccuracyNull();
        }
    }

    @Test(timeout=600000)
    public void testSolveAccuracySin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveAccuracySin();
        }
    }

    @Test(timeout=600000)
    public void testSolveNoRoot() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testSolveNoRoot();
        }
    }

    @Test(timeout=600000)
    public void testBracketSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testBracketSin();
        }
    }

    @Test(timeout=600000)
    public void testBracketEndpointRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testBracketEndpointRoot();
        }
    }

    @Test(timeout=600000)
    public void testNullFunction() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testNullFunction();
        }
    }

    @Test(timeout=600000)
    public void testBadInitial() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testBadInitial();
        }
    }

    @Test(timeout=600000)
    public void testBadMaximumIterations() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testBadMaximumIterations();
        }
    }

    @Test(timeout=600000)
    public void testMisc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testMisc();
        }
    }

    @Test(timeout=600000)
    public void testBadEndpoints() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest object = new org.apache.commons.math3.analysis.solvers.UnivariateSolverUtilsTest();
               object.testBadEndpoints();
        }
    }

}