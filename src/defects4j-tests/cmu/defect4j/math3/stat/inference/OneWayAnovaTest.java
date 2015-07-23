package cmu.defect4j.math3.stat.inference;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class OneWayAnovaTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testAnovaFValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.OneWayAnovaTest object = new org.apache.commons.math3.stat.inference.OneWayAnovaTest();
               object.testAnovaFValue();
        }
    }

    @Test(timeout=1800000)
    public void testAnovaPValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.OneWayAnovaTest object = new org.apache.commons.math3.stat.inference.OneWayAnovaTest();
               object.testAnovaPValue();
        }
    }

    @Test(timeout=1800000)
    public void testAnovaPValueSummaryStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.OneWayAnovaTest object = new org.apache.commons.math3.stat.inference.OneWayAnovaTest();
               object.testAnovaPValueSummaryStatistics();
        }
    }

    @Test(timeout=1800000)
    public void testAnovaTest() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.OneWayAnovaTest object = new org.apache.commons.math3.stat.inference.OneWayAnovaTest();
               object.testAnovaTest();
        }
    }

}