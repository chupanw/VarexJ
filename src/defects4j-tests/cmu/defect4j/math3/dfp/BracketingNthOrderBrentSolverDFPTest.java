package cmu.defect4j.math3.dfp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BracketingNthOrderBrentSolverDFPTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testInsufficientOrder3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest object = new org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest();
               object.setUp();
               object.testInsufficientOrder3();
        }
    }

    @Test(timeout=600000)
    public void testConvergenceOnFunctionAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest object = new org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest();
               object.setUp();
               object.testConvergenceOnFunctionAccuracy();
        }
    }

    @Test(timeout=600000)
    public void testConstructorOK() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest object = new org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest();
               object.setUp();
               object.testConstructorOK();
        }
    }

    @Test(timeout=600000)
    public void testNeta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest object = new org.apache.commons.math3.dfp.BracketingNthOrderBrentSolverDFPTest();
               object.setUp();
               object.testNeta();
        }
    }

}