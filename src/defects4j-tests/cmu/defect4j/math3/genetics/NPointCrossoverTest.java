package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NPointCrossoverTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testNumberIsTooLargeException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.genetics.NPointCrossoverTest object = new org.apache.commons.math3.genetics.NPointCrossoverTest();
               object.testNumberIsTooLargeException();
        }
    }

    @Test(timeout=60000)
    public void testCrossover() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.NPointCrossoverTest object = new org.apache.commons.math3.genetics.NPointCrossoverTest();
               object.testCrossover();
        }
    }

    @Test(timeout=60000)
    public void testCrossoverDimensionMismatchException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.genetics.NPointCrossoverTest object = new org.apache.commons.math3.genetics.NPointCrossoverTest();
               object.testCrossoverDimensionMismatchException();
        }
    }

    @Test(timeout=60000)
    public void testCrossoverInvalidFixedLengthChromosomeFirst() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.NPointCrossoverTest object = new org.apache.commons.math3.genetics.NPointCrossoverTest();
               object.testCrossoverInvalidFixedLengthChromosomeFirst();
        }
    }

    @Test(timeout=60000)
    public void testCrossoverInvalidFixedLengthChromosomeSecond() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.NPointCrossoverTest object = new org.apache.commons.math3.genetics.NPointCrossoverTest();
               object.testCrossoverInvalidFixedLengthChromosomeSecond();
        }
    }

}