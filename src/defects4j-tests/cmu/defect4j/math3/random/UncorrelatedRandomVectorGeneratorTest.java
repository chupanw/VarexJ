package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UncorrelatedRandomVectorGeneratorTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMeanAndCorrelation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.UncorrelatedRandomVectorGeneratorTest object = new org.apache.commons.math3.random.UncorrelatedRandomVectorGeneratorTest();
               object.testMeanAndCorrelation();
        }
    }

}