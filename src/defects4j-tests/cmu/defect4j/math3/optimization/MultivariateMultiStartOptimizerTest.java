package cmu.defect4j.math3.optimization;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateMultiStartOptimizerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testRosenbrock() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.MultivariateMultiStartOptimizerTest object = new org.apache.commons.math3.optimization.MultivariateMultiStartOptimizerTest();
               object.testRosenbrock();
        }
    }

}