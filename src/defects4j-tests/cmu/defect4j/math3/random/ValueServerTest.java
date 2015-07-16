package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ValueServerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testNextDigest() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testNextDigest();
        }
    }

    @Test(timeout=1800000)
    public void testFixedSeed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testFixedSeed();
        }
    }

    @Test(timeout=1800000)
    public void testNextDigestFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testNextDigestFail();
        }
    }

    @Test(timeout=1800000)
    public void testEmptyReplayFile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testEmptyReplayFile();
        }
    }

    @Test(timeout=1800000)
    public void testEmptyDigestFile() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testEmptyDigestFile();
        }
    }

    @Test(timeout=1800000)
    public void testReplay() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testReplay();
        }
    }

    @Test(timeout=1800000)
    public void testModes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testModes();
        }
    }

    @Test(timeout=1800000)
    public void testFill() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testFill();
        }
    }

    @Test(timeout=1800000)
    public void testProperties() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.ValueServerTest object = new org.apache.commons.math3.random.ValueServerTest();
               object.setUp();
               object.testProperties();
        }
    }

}