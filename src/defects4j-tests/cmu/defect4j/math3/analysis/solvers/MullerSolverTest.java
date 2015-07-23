package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MullerSolverTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSinFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.MullerSolverTest object = new org.apache.commons.math3.analysis.solvers.MullerSolverTest();
               object.testSinFunction();
        }
    }

    @Test(timeout=1800000)
    public void testQuinticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.MullerSolverTest object = new org.apache.commons.math3.analysis.solvers.MullerSolverTest();
               object.testQuinticFunction();
        }
    }

    @Test(timeout=1800000)
    public void testExpm1Function() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.MullerSolverTest object = new org.apache.commons.math3.analysis.solvers.MullerSolverTest();
               object.testExpm1Function();
        }
    }

    @Test(timeout=1800000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.MullerSolverTest object = new org.apache.commons.math3.analysis.solvers.MullerSolverTest();
               object.testParameters();
        }
    }

}