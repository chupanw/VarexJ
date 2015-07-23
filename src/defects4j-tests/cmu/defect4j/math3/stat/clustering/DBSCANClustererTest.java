package cmu.defect4j.math3.stat.clustering;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DBSCANClustererTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7b.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testCluster() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testCluster();
        }
    }

    @Test(timeout=1800000)
    public void testSingleLink() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testSingleLink();
        }
    }

    @Test(timeout=1800000)
    public void testGetEps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testGetEps();
        }
    }

    @Test(timeout=1800000)
    public void testGetMinPts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testGetMinPts();
        }
    }

    @Test(timeout=1800000)
    public void testNegativeEps() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testNegativeEps();
        }
    }

    @Test(timeout=1800000)
    public void testNegativeMinPts() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testNegativeMinPts();
        }
    }

    @Test(timeout=1800000)
    public void testNullDataset() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.stat.clustering.DBSCANClustererTest object = new org.apache.commons.math3.stat.clustering.DBSCANClustererTest();
               object.testNullDataset();
        }
    }

}