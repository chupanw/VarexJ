package cmu.defect4j.jfree.chart.renderer.category.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class StatisticalBarRendererTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testPublicCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullInfo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testDrawWithNullInfo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMeanVertical() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testDrawWithNullMeanVertical");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMeanHorizontal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testDrawWithNullMeanHorizontal");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullDeviationVertical() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testDrawWithNullDeviationVertical");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullDeviationHorizontal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.StatisticalBarRendererTests("testDrawWithNullDeviationHorizontal");
			testcase.run();
		}
	}

}