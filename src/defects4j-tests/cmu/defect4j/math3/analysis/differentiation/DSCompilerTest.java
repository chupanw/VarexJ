package cmu.defect4j.math3.analysis.differentiation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DSCompilerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testSize();
        }
    }

    @Test(timeout=60000)
    public void testIndices() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testIndices();
        }
    }

    @Test(timeout=60000)
    public void testIncompatibleParams() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testIncompatibleParams();
        }
    }

    @Test(timeout=60000)
    public void testIncompatibleOrder() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testIncompatibleOrder();
        }
    }

    @Test(timeout=60000)
    public void testSymmetry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testSymmetry();
        }
    }

    @Test(timeout=60000)
    public void testMultiplicationRules() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testMultiplicationRules();
        }
    }

    @Test(timeout=60000)
    public void testCompositionRules() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.DSCompilerTest object = new org.apache.commons.math3.analysis.differentiation.DSCompilerTest();
               object.testCompositionRules();
        }
    }

}