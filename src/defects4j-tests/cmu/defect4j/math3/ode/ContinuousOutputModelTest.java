package cmu.defect4j.math3.ode;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ContinuousOutputModelTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testBoundaries() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.ContinuousOutputModelTest object = new org.apache.commons.math3.ode.ContinuousOutputModelTest();
               object.setUp();
               object.testBoundaries();
        }
    }

    @Test(timeout=1800000)
    public void testRandomAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.ContinuousOutputModelTest object = new org.apache.commons.math3.ode.ContinuousOutputModelTest();
               object.setUp();
               object.testRandomAccess();
        }
    }

    @Test(timeout=1800000)
    public void testModelsMerging() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.ContinuousOutputModelTest object = new org.apache.commons.math3.ode.ContinuousOutputModelTest();
               object.setUp();
               object.testModelsMerging();
        }
    }

    @Test(timeout=1800000)
    public void testErrorConditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.ContinuousOutputModelTest object = new org.apache.commons.math3.ode.ContinuousOutputModelTest();
               object.setUp();
               object.testErrorConditions();
        }
    }

}