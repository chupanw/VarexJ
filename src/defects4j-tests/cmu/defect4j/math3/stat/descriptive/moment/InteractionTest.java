package cmu.defect4j.math3.stat.descriptive.moment;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class InteractionTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=600000)
    public void testInteraction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.moment.InteractionTest object = new org.apache.commons.math3.stat.descriptive.moment.InteractionTest();
               object.testInteraction();
        }
    }

}