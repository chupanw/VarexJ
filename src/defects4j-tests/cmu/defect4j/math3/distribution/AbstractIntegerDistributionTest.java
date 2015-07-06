package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AbstractIntegerDistributionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testCumulativeProbabilitiesSingleArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.AbstractIntegerDistributionTest object = new org.apache.commons.math3.distribution.AbstractIntegerDistributionTest();
               object.testCumulativeProbabilitiesSingleArguments();
        }
    }

    @Test(timeout=60000)
    public void testCumulativeProbabilitiesRangeArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.AbstractIntegerDistributionTest object = new org.apache.commons.math3.distribution.AbstractIntegerDistributionTest();
               object.testCumulativeProbabilitiesRangeArguments();
        }
    }

}