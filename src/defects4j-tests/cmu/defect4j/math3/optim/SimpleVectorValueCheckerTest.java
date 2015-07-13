package cmu.defect4j.math3.optim;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimpleVectorValueCheckerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testIterationCheckPrecondition() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.optim.SimpleVectorValueCheckerTest object = new org.apache.commons.math3.optim.SimpleVectorValueCheckerTest();
               object.testIterationCheckPrecondition();
        }
    }

    @Test(timeout=60000)
    public void testIterationCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.SimpleVectorValueCheckerTest object = new org.apache.commons.math3.optim.SimpleVectorValueCheckerTest();
               object.testIterationCheck();
        }
    }

    @Test(timeout=60000)
    public void testIterationCheckDisabled() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.SimpleVectorValueCheckerTest object = new org.apache.commons.math3.optim.SimpleVectorValueCheckerTest();
               object.testIterationCheckDisabled();
        }
    }

}