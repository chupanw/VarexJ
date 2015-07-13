package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SparseFieldVectorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testPredicates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldVectorTest object = new org.apache.commons.math3.linear.SparseFieldVectorTest();
               object.testPredicates();
        }
    }

    @Test(timeout=60000)
    public void testMisc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldVectorTest object = new org.apache.commons.math3.linear.SparseFieldVectorTest();
               object.testMisc();
        }
    }

    @Test(timeout=60000)
    public void testMapFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldVectorTest object = new org.apache.commons.math3.linear.SparseFieldVectorTest();
               object.testMapFunctions();
        }
    }

    @Test(timeout=60000)
    public void testBasicFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldVectorTest object = new org.apache.commons.math3.linear.SparseFieldVectorTest();
               object.testBasicFunctions();
        }
    }

    @Test(timeout=60000)
    public void testOuterProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldVectorTest object = new org.apache.commons.math3.linear.SparseFieldVectorTest();
               object.testOuterProduct();
        }
    }

}