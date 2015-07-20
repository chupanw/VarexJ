package cmu.defect4j.math3.optimization.univariate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BracketFinderTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testCubicMin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.BracketFinderTest object = new org.apache.commons.math3.optimization.univariate.BracketFinderTest();
               object.testCubicMin();
        }
    }

    @Test(timeout=1800000)
    public void testMinimumIsOnIntervalBoundary() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.BracketFinderTest object = new org.apache.commons.math3.optimization.univariate.BracketFinderTest();
               object.testMinimumIsOnIntervalBoundary();
        }
    }

    @Test(timeout=1800000)
    public void testCubicMax() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.BracketFinderTest object = new org.apache.commons.math3.optimization.univariate.BracketFinderTest();
               object.testCubicMax();
        }
    }

    @Test(timeout=1800000)
    public void testIntervalBoundsOrdering() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.univariate.BracketFinderTest object = new org.apache.commons.math3.optimization.univariate.BracketFinderTest();
               object.testIntervalBoundsOrdering();
        }
    }

}