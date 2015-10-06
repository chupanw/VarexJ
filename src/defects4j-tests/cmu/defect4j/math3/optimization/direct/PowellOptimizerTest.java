package cmu.defect4j.math3.optimization.direct;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PowellOptimizerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction","+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math23.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.PowellOptimizerTest object = new org.apache.commons.math3.optimization.direct.PowellOptimizerTest();
               object.testQuadratic();
        }
    }

    @Test(timeout=1800000)
    public void testSumSinc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.PowellOptimizerTest object = new org.apache.commons.math3.optimization.direct.PowellOptimizerTest();
               object.testSumSinc();
        }
    }

    @Test(timeout=1800000)
    public void testRelativeToleranceOnScaledValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.PowellOptimizerTest object = new org.apache.commons.math3.optimization.direct.PowellOptimizerTest();
               object.testRelativeToleranceOnScaledValues();
        }
    }

    @Test(timeout=1800000)
    public void testMaximizeQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.PowellOptimizerTest object = new org.apache.commons.math3.optimization.direct.PowellOptimizerTest();
               object.testMaximizeQuadratic();
        }
    }

}