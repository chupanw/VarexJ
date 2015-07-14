package cmu.defect4j.math3.stat.clustering;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EuclideanDoublePointTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest object = new org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest();
               object.testDistance();
        }
    }

    @Test(timeout=600000)
    public void testCentroid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest object = new org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest();
               object.testCentroid();
        }
    }

    @Test(timeout=600000)
    public void testArrayIsReference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest object = new org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest();
               object.testArrayIsReference();
        }
    }

    @Test(timeout=600000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest object = new org.apache.commons.math3.stat.clustering.EuclideanDoublePointTest();
               object.testSerial();
        }
    }

}