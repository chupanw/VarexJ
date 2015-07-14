package cmu.defect4j.math3.stat.inference;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MannWhitneyUTestTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testBigDataSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.MannWhitneyUTestTest object = new org.apache.commons.math3.stat.inference.MannWhitneyUTestTest();
               object.testBigDataSet();
        }
    }

    @Test(timeout=600000)
    public void testMannWhitneyUSimple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.MannWhitneyUTestTest object = new org.apache.commons.math3.stat.inference.MannWhitneyUTestTest();
               object.testMannWhitneyUSimple();
        }
    }

    @Test(timeout=600000)
    public void testMannWhitneyUInputValidation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.inference.MannWhitneyUTestTest object = new org.apache.commons.math3.stat.inference.MannWhitneyUTestTest();
               object.testMannWhitneyUInputValidation();
        }
    }

}