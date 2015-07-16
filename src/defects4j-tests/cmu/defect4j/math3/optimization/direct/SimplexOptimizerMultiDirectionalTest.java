package cmu.defect4j.math3.optimization.direct;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimplexOptimizerMultiDirectionalTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testRosenbrock() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testRosenbrock();
        }
    }

    @Test(timeout=1800000)
    public void testMinimize1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testMinimize1();
        }
    }

    @Test(timeout=1800000)
    public void testMinimize2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testMinimize2();
        }
    }

    @Test(timeout=1800000)
    public void testMaximize1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testMaximize1();
        }
    }

    @Test(timeout=1800000)
    public void testMaximize2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testMaximize2();
        }
    }

    @Test(timeout=1800000)
    public void testPowell() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testPowell();
        }
    }

    @Test(timeout=1800000)
    public void testMath283() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest object = new org.apache.commons.math3.optimization.direct.SimplexOptimizerMultiDirectionalTest();
               object.testMath283();
        }
    }

}