package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MixedListUnivariateImplTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest();
               object.testStats();
        }
    }

    @Test(timeout=1800000)
    public void testSkewAndKurtosis() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest();
               object.testSkewAndKurtosis();
        }
    }

    @Test(timeout=1800000)
    public void testProductAndGeometricMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest();
               object.testProductAndGeometricMean();
        }
    }

    @Test(timeout=1800000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.MixedListUnivariateImplTest();
               object.testN0andN1Conditions();
        }
    }

}