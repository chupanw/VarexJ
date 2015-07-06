package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TransformerMapTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testPutTransformer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testPutTransformer();
        }
    }

    @Test(timeout=60000)
    public void testContainsClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testContainsClass();
        }
    }

    @Test(timeout=60000)
    public void testContainsTransformer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testContainsTransformer();
        }
    }

    @Test(timeout=60000)
    public void testRemoveTransformer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testRemoveTransformer();
        }
    }

    @Test(timeout=60000)
    public void testClasses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testClasses();
        }
    }

    @Test(timeout=60000)
    public void testTransformers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testTransformers();
        }
    }

    @Test(timeout=60000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testSerial();
        }
    }

    @Test(timeout=60000)
    public void testClear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.TransformerMapTest object = new org.apache.commons.math3.util.TransformerMapTest();
               object.testClear();
        }
    }

}