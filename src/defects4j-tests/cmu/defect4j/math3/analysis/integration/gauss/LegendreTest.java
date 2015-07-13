package cmu.defect4j.math3.analysis.integration.gauss;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LegendreTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.LegendreTest object = new org.apache.commons.math3.analysis.integration.gauss.LegendreTest();
               object.testCos();
        }
    }

    @Test(timeout=60000)
    public void testInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.integration.gauss.LegendreTest object = new org.apache.commons.math3.analysis.integration.gauss.LegendreTest();
               object.testInverse();
        }
    }

}