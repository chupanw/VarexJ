package cmu.defect4j.math3.optimization;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateDifferentiableVectorMultiStartOptimizerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testTrivial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest();
               object.testTrivial();
        }
    }

    @Test(timeout=600000)
    public void testNoOptimum() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest$TestException", config)) {
               org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.MultivariateDifferentiableVectorMultiStartOptimizerTest();
               object.testNoOptimum();
        }
    }

}