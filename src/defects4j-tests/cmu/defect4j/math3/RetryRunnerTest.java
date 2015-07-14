package cmu.defect4j.math3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RetryRunnerTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testRetryFailSometimes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.RetryRunnerTest object = new org.apache.commons.math3.RetryRunnerTest();
               object.testRetryFailSometimes();
        }
    }

    @Test(timeout=600000)
    public void testRetryFailAlways() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalStateException", config)) {
               org.apache.commons.math3.RetryRunnerTest object = new org.apache.commons.math3.RetryRunnerTest();
               object.testRetryFailAlways();
        }
    }

}