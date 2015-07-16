package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BetaDistributionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testCumulative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BetaDistributionTest object = new org.apache.commons.math3.distribution.BetaDistributionTest();
               object.testCumulative();
        }
    }

    @Test(timeout=1800000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BetaDistributionTest object = new org.apache.commons.math3.distribution.BetaDistributionTest();
               object.testDensity();
        }
    }

    @Test(timeout=1800000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BetaDistributionTest object = new org.apache.commons.math3.distribution.BetaDistributionTest();
               object.testMoments();
        }
    }

}