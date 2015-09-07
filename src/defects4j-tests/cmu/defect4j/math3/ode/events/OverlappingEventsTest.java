package cmu.defect4j.math3.ode.events;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class OverlappingEventsTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testOverlappingEvents0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.OverlappingEventsTest object = new org.apache.commons.math3.ode.events.OverlappingEventsTest();
               object.testOverlappingEvents0();
        }
    }

    @Test(timeout=1800000)
    public void testOverlappingEvents1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.OverlappingEventsTest object = new org.apache.commons.math3.ode.events.OverlappingEventsTest();
               object.testOverlappingEvents1();
        }
    }

}