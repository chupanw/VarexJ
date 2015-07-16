package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ListUnivariateImplTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest();
               object.testSerialization();
        }
    }

    @Test(timeout=1800000)
    public void testStats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest();
               object.testStats();
        }
    }

    @Test(timeout=1800000)
    public void testN0andN1Conditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest();
               object.testN0andN1Conditions();
        }
    }

    @Test(timeout=1800000)
    public void testSkewAndKurtosis() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest();
               object.testSkewAndKurtosis();
        }
    }

    @Test(timeout=1800000)
    public void testProductAndGeometricMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest object = new org.apache.commons.math3.stat.descriptive.ListUnivariateImplTest();
               object.testProductAndGeometricMean();
        }
    }

}