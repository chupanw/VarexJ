package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BrentSolverTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSinZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BrentSolverTest();
               object.testSinZero();
        }
    }

    @Test(timeout=60000)
    public void testQuinticZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BrentSolverTest();
               object.testQuinticZero();
        }
    }

    @Test(timeout=60000)
    public void testRootEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BrentSolverTest();
               object.testRootEndpoints();
        }
    }

    @Test(timeout=60000)
    public void testBadEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BrentSolverTest();
               object.testBadEndpoints();
        }
    }

    @Test(timeout=60000)
    public void testMath832() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BrentSolverTest();
               object.testMath832();
        }
    }

    @Test(timeout=60000)
    public void testInitialGuess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BrentSolverTest();
               object.testInitialGuess();
        }
    }

}