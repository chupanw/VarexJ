package cmu.defect4j.math3.stat;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CertifiedDataTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testSummaryStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.CertifiedDataTest object = new org.apache.commons.math3.stat.CertifiedDataTest();
               object.testSummaryStatistics();
        }
    }

    @Test(timeout=600000)
    public void testDescriptiveStatistics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.CertifiedDataTest object = new org.apache.commons.math3.stat.CertifiedDataTest();
               object.testDescriptiveStatistics();
        }
    }

}