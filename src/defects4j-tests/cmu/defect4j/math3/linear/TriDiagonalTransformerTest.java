package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TriDiagonalTransformerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testQOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testQOrthogonal();
        }
    }

    @Test(timeout=600000)
    public void testNonSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testNonSquare();
        }
    }

    @Test(timeout=600000)
    public void testAEqualQTQt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testAEqualQTQt();
        }
    }

    @Test(timeout=600000)
    public void testNoAccessBelowDiagonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testNoAccessBelowDiagonal();
        }
    }

    @Test(timeout=600000)
    public void testQTOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testQTOrthogonal();
        }
    }

    @Test(timeout=600000)
    public void testTTriDiagonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testTTriDiagonal();
        }
    }

    @Test(timeout=600000)
    public void testMatricesValues5() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testMatricesValues5();
        }
    }

    @Test(timeout=600000)
    public void testMatricesValues3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.TriDiagonalTransformerTest object = new org.apache.commons.math3.linear.TriDiagonalTransformerTest();
               object.testMatricesValues3();
        }
    }

}