package cmu.defect4j.math3.analysis.function;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SqrtTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testComparison() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SqrtTest object = new org.apache.commons.math3.analysis.function.SqrtTest();
               object.testComparison();
        }
    }

    @Test(timeout=600000)
    public void testDerivativeComparison() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SqrtTest object = new org.apache.commons.math3.analysis.function.SqrtTest();
               object.testDerivativeComparison();
        }
    }

    @Test(timeout=600000)
    public void testDerivativesHighOrder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.function.SqrtTest object = new org.apache.commons.math3.analysis.function.SqrtTest();
               object.testDerivativesHighOrder();
        }
    }

}