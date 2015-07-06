package cmu.defect4j.math3.ode.events;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EventFilterTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testHistoryIncreasingForward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testHistoryIncreasingForward();
        }
    }

    @Test(timeout=60000)
    public void testHistoryIncreasingBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testHistoryIncreasingBackward();
        }
    }

    @Test(timeout=60000)
    public void testHistoryDecreasingForward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testHistoryDecreasingForward();
        }
    }

    @Test(timeout=60000)
    public void testHistoryDecreasingBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testHistoryDecreasingBackward();
        }
    }

    @Test(timeout=60000)
    public void testIncreasingOnly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testIncreasingOnly();
        }
    }

    @Test(timeout=60000)
    public void testDecreasingOnly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testDecreasingOnly();
        }
    }

    @Test(timeout=60000)
    public void testTwoOppositeFilters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventFilterTest object = new org.apache.commons.math3.ode.events.EventFilterTest();
               object.testTwoOppositeFilters();
        }
    }

}