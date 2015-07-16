package cmu.defect4j.math3.optim.nonlinear.scalar;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateFunctionMappingAdapterTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testStartSimplexInsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest();
               object.testStartSimplexInsideRange();
        }
    }

    @Test(timeout=1800000)
    public void testOptimumOutsideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest();
               object.testOptimumOutsideRange();
        }
    }

    @Test(timeout=1800000)
    public void testUnbounded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest();
               object.testUnbounded();
        }
    }

    @Test(timeout=1800000)
    public void testHalfBounded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest object = new org.apache.commons.math3.optim.nonlinear.scalar.MultivariateFunctionMappingAdapterTest();
               object.testHalfBounded();
        }
    }

}