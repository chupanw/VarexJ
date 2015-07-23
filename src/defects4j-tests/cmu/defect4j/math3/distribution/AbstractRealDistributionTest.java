package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AbstractRealDistributionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testContinuous() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.AbstractRealDistributionTest object = new org.apache.commons.math3.distribution.AbstractRealDistributionTest();
               object.testContinuous();
        }
    }

    @Test(timeout=1800000)
    public void testDiscontinuous() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.AbstractRealDistributionTest object = new org.apache.commons.math3.distribution.AbstractRealDistributionTest();
               object.testDiscontinuous();
        }
    }

}