package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnmodifiableArrayRealVectorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=60000)
    public void testIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testIterator();
        }
    }

    @Test(timeout=60000)
    public void testSparseIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testSparseIterator();
        }
    }

    @Test(timeout=60000)
    public void testSetEntry() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testSetEntry();
        }
    }

    @Test(timeout=60000)
    public void testAddToEntry() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testAddToEntry();
        }
    }

    @Test(timeout=60000)
    public void testGetSubVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testGetSubVector();
        }
    }

    @Test(timeout=60000)
    public void testAllButExcluded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testAllButExcluded();
        }
    }

    @Test(timeout=60000)
    public void testSetSubVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableArrayRealVectorTest();
               object.testSetSubVector();
        }
    }

}