package cmu.defect4j.math3.optimization.univariate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnivariateMultiStartOptimizerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSinMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest();
               object.testSinMin();
        }
    }

    @Test(timeout=1800000)
    public void testQuinticMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest();
               object.testQuinticMin();
        }
    }

    @Test(timeout=1800000)
    public void testBadFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.univariate.UnivariateMultiStartOptimizerTest();
               object.testBadFunction();
        }
    }

}