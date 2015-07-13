package cmu.defect4j.math3.optimization.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CurveFitterTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testMath303() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.CurveFitterTest object = new org.apache.commons.math3.optimization.fitting.CurveFitterTest();
               object.testMath303();
        }
    }

    @Test(timeout=60000)
    public void testMath304() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.CurveFitterTest object = new org.apache.commons.math3.optimization.fitting.CurveFitterTest();
               object.testMath304();
        }
    }

    @Test(timeout=60000)
    public void testMath372() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.fitting.CurveFitterTest object = new org.apache.commons.math3.optimization.fitting.CurveFitterTest();
               object.testMath372();
        }
    }

}