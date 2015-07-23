package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RectangularCholeskyDecompositionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testDecomposition3x3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest object = new org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest();
               object.testDecomposition3x3();
        }
    }

    @Test(timeout=1800000)
    public void testFullRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest object = new org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest();
               object.testFullRank();
        }
    }

    @Test(timeout=1800000)
    public void testMath789() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest object = new org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest();
               object.testMath789();
        }
    }

}