package cmu.defect4j.math.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SparseRealVectorTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math49b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testSerial();
        }
    }

    @Test(timeout=1800000)
    public void testMisc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testMisc();
        }
    }

    @Test(timeout=1800000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testConstructors();
        }
    }

    @Test(timeout=1800000)
    public void testPredicates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testPredicates();
        }
    }

    @Test(timeout=1800000)
    public void testDataInOut() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testDataInOut();
        }
    }

    @Test(timeout=1800000)
    public void testMapFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testMapFunctions();
        }
    }

    @Test(timeout=1800000)
    public void testBasicFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testBasicFunctions();
        }
    }

    @Test(timeout=1800000)
    public void testOuterProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testOuterProduct();
        }
    }

    @Test(timeout=1800000)
    public void testConcurrentModification() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.linear.SparseRealVectorTest object = new org.apache.commons.math.linear.SparseRealVectorTest();
               object.testConcurrentModification();
        }
    }

}