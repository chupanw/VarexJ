package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class IncrementorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testCanIncrement1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testCanIncrement1();
        }
    }

    @Test(timeout=60000)
    public void testCanIncrement2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testCanIncrement2();
        }
    }

    @Test(timeout=60000)
    public void testAccessor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testAccessor();
        }
    }

    @Test(timeout=60000)
    public void testBelowMaxCount() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testBelowMaxCount();
        }
    }

    @Test(timeout=60000)
    public void testAboveMaxCount() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MaxCountExceededException", config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testAboveMaxCount();
        }
    }

    @Test(timeout=60000)
    public void testAlternateException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.TooManyEvaluationsException", config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testAlternateException();
        }
    }

    @Test(timeout=60000)
    public void testReset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testReset();
        }
    }

    @Test(timeout=60000)
    public void testBulkIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testBulkIncrement();
        }
    }

    @Test(timeout=60000)
    public void testConstructor1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testConstructor1();
        }
    }

    @Test(timeout=60000)
    public void testConstructor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.IncrementorTest object = new org.apache.commons.math3.util.IncrementorTest();
               object.testConstructor2();
        }
    }

}