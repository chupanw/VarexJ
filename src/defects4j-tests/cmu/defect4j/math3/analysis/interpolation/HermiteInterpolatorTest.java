package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HermiteInterpolatorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testZero();
        }
    }

    @Test(timeout=600000)
    public void testQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testQuadratic();
        }
    }

    @Test(timeout=600000)
    public void testMixedDerivatives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testMixedDerivatives();
        }
    }

    @Test(timeout=600000)
    public void testRandomPolynomialsValuesOnly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testRandomPolynomialsValuesOnly();
        }
    }

    @Test(timeout=600000)
    public void testRandomPolynomialsFirstDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testRandomPolynomialsFirstDerivative();
        }
    }

    @Test(timeout=600000)
    public void testSine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testSine();
        }
    }

    @Test(timeout=600000)
    public void testSquareRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testSquareRoot();
        }
    }

    @Test(timeout=600000)
    public void testWikipedia() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testWikipedia();
        }
    }

    @Test(timeout=600000)
    public void testOnePointParabola() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testOnePointParabola();
        }
    }

    @Test(timeout=600000)
    public void testDuplicatedAbscissa() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testDuplicatedAbscissa();
        }
    }

    @Test(timeout=600000)
    public void testEmptySample() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NoDataException", config)) {
               org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.HermiteInterpolatorTest();
               object.testEmptySample();
        }
    }

}