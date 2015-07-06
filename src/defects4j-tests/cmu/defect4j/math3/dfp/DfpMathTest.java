package cmu.defect4j.math3.dfp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DfpMathTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpMathTest object = new org.apache.commons.math3.dfp.DfpMathTest();
               object.setUp();
               object.testPow();
        }
    }

    @Test(timeout=60000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpMathTest object = new org.apache.commons.math3.dfp.DfpMathTest();
               object.setUp();
               object.testSin();
        }
    }

}