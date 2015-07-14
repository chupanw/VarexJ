package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StepFunctionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testPreconditions3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NoDataException", config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testPreconditions3();
        }
    }

    @Test(timeout=600000)
    public void testPreconditions4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NoDataException", config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testPreconditions4();
        }
    }

    @Test(timeout=600000)
    public void testPreconditions5() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testPreconditions5();
        }
    }

    @Test(timeout=600000)
    public void testPreconditions6() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NonMonotonicSequenceException", config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testPreconditions6();
        }
    }

    @Test(timeout=600000)
    public void testEndpointBehavior() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testEndpointBehavior();
        }
    }

    @Test(timeout=600000)
    public void testHeaviside() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testHeaviside();
        }
    }

    @Test(timeout=600000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testPreconditions1();
        }
    }

    @Test(timeout=600000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testPreconditions2();
        }
    }

    @Test(timeout=600000)
    public void testSomeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.StepFunctionTest object = new org.apache.commons.math3.analysis.function.StepFunctionTest();
               object.testSomeValues();
        }
    }

}