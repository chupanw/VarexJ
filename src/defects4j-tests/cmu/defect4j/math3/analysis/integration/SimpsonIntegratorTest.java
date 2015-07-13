package cmu.defect4j.math3.analysis.integration;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimpsonIntegratorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSinFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest object = new org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest();
               object.testSinFunction();
        }
    }

    @Test(timeout=60000)
    public void testQuinticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest object = new org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest();
               object.testQuinticFunction();
        }
    }

    @Test(timeout=60000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest object = new org.apache.commons.math3.analysis.integration.SimpsonIntegratorTest();
               object.testParameters();
        }
    }

}