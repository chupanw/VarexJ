package cmu.defect4j.math3.optim;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PointVectorValuePairTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.PointVectorValuePairTest object = new org.apache.commons.math3.optim.PointVectorValuePairTest();
               object.testSerial();
        }
    }

}