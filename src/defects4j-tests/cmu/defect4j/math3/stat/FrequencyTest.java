package cmu.defect4j.math3.stat;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FrequencyTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testCounts();
        }
    }

    @Test(timeout=60000)
    public void testPcts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testPcts();
        }
    }

    @Test(timeout=60000)
    public void testEmptyTable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testEmptyTable();
        }
    }

    @Test(timeout=60000)
    public void testIntegerValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testIntegerValues();
        }
    }

    @Test(timeout=60000)
    public void testGetUniqueCount() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testGetUniqueCount();
        }
    }

    @Test(timeout=60000)
    public void testIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testIncrement();
        }
    }

    @Test(timeout=60000)
    public void testMerge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testMerge();
        }
    }

    @Test(timeout=60000)
    public void testMergeCollection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testMergeCollection();
        }
    }

    @Test(timeout=60000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testAdd();
        }
    }

    @Test(timeout=60000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testToString();
        }
    }

    @Test(timeout=60000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testSerial();
        }
    }

}