package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PairTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PairTest object = new org.apache.commons.math3.util.PairTest();
               object.testHashCode();
        }
    }

    @Test(timeout=600000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PairTest object = new org.apache.commons.math3.util.PairTest();
               object.testEquals();
        }
    }

    @Test(timeout=600000)
    public void testAccessor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PairTest object = new org.apache.commons.math3.util.PairTest();
               object.testAccessor();
        }
    }

    @Test(timeout=600000)
    public void testAccessor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.PairTest object = new org.apache.commons.math3.util.PairTest();
               object.testAccessor2();
        }
    }

}