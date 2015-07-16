package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SynchronizedRandomGeneratorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMath899Sync() throws Throwable {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.SynchronizedRandomGeneratorTest object = new org.apache.commons.math3.random.SynchronizedRandomGeneratorTest();
               object.testMath899Sync();
        }
    }

    @Test(timeout=1800000)
    public void testAdapter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.SynchronizedRandomGeneratorTest object = new org.apache.commons.math3.random.SynchronizedRandomGeneratorTest();
               object.testAdapter();
        }
    }

}