package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldLUSolverTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSolveSingularityErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUSolverTest object = new org.apache.commons.math3.linear.FieldLUSolverTest();
               object.testSolveSingularityErrors();
        }
    }

    @Test(timeout=60000)
    public void testSolve() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUSolverTest object = new org.apache.commons.math3.linear.FieldLUSolverTest();
               object.testSolve();
        }
    }

    @Test(timeout=60000)
    public void testSolveDimensionErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUSolverTest object = new org.apache.commons.math3.linear.FieldLUSolverTest();
               object.testSolveDimensionErrors();
        }
    }

    @Test(timeout=60000)
    public void testDeterminant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUSolverTest object = new org.apache.commons.math3.linear.FieldLUSolverTest();
               object.testDeterminant();
        }
    }

    @Test(timeout=60000)
    public void testSingular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldLUSolverTest object = new org.apache.commons.math3.linear.FieldLUSolverTest();
               object.testSingular();
        }
    }

}