package cmu.defect4j.math3.ode;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FirstOrderConverterTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testDoubleDimension() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testDoubleDimension();
        }
    }

    @Test(timeout=1800000)
    public void testDecreasingSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testDecreasingSteps();
        }
    }

    @Test(timeout=1800000)
    public void testSmallStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testSmallStep();
        }
    }

    @Test(timeout=1800000)
    public void testBigStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testBigStep();
        }
    }

}