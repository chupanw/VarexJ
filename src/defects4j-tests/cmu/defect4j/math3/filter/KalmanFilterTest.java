package cmu.defect4j.math3.filter;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class KalmanFilterTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.filter.KalmanFilterTest object = new org.apache.commons.math3.filter.KalmanFilterTest();
               object.testConstant();
        }
    }

    @Test(timeout=60000)
    public void testTransitionMeasurementMatrixMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.MatrixDimensionMismatchException", config)) {
               org.apache.commons.math3.filter.KalmanFilterTest object = new org.apache.commons.math3.filter.KalmanFilterTest();
               object.testTransitionMeasurementMatrixMismatch();
        }
    }

    @Test(timeout=60000)
    public void testTransitionControlMatrixMismatch() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.MatrixDimensionMismatchException", config)) {
               org.apache.commons.math3.filter.KalmanFilterTest object = new org.apache.commons.math3.filter.KalmanFilterTest();
               object.testTransitionControlMatrixMismatch();
        }
    }

    @Test(timeout=60000)
    public void testConstantAcceleration() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.filter.KalmanFilterTest object = new org.apache.commons.math3.filter.KalmanFilterTest();
               object.testConstantAcceleration();
        }
    }

}