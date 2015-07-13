package cmu.defect4j.math3.optimization.general;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MinpackTest extends TestJPF {

    private final String[] config = {"+interaction=interaction", "+search.class= .search.RandomSearch", "+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math7.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=60000)
    public void testMinpackLinearFullRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackLinearFullRank();
        }
    }

    @Test(timeout=60000)
    public void testMinpackLinearRank1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackLinearRank1();
        }
    }

    @Test(timeout=60000)
    public void testMinpackLinearRank1ZeroColsAndRows() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackLinearRank1ZeroColsAndRows();
        }
    }

    @Test(timeout=60000)
    public void testMinpackRosenbrok() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackRosenbrok();
        }
    }

    @Test(timeout=60000)
    public void testMinpackHelicalValley() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackHelicalValley();
        }
    }

    @Test(timeout=60000)
    public void testMinpackPowellSingular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackPowellSingular();
        }
    }

    @Test(timeout=60000)
    public void testMinpackFreudensteinRoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackFreudensteinRoth();
        }
    }

    @Test(timeout=60000)
    public void testMinpackBard() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackBard();
        }
    }

    @Test(timeout=60000)
    public void testMinpackKowalikOsborne() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackKowalikOsborne();
        }
    }

    @Test(timeout=60000)
    public void testMinpackMeyer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackMeyer();
        }
    }

    @Test(timeout=60000)
    public void testMinpackWatson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackWatson();
        }
    }

    @Test(timeout=60000)
    public void testMinpackBox3Dimensional() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackBox3Dimensional();
        }
    }

    @Test(timeout=60000)
    public void testMinpackJennrichSampson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackJennrichSampson();
        }
    }

    @Test(timeout=60000)
    public void testMinpackBrownDennis() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackBrownDennis();
        }
    }

    @Test(timeout=60000)
    public void testMinpackChebyquad() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackChebyquad();
        }
    }

    @Test(timeout=60000)
    public void testMinpackBrownAlmostLinear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackBrownAlmostLinear();
        }
    }

    @Test(timeout=60000)
    public void testMinpackOsborne1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackOsborne1();
        }
    }

    @Test(timeout=60000)
    public void testMinpackOsborne2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.general.MinpackTest object = new org.apache.commons.math3.optimization.general.MinpackTest();
               object.testMinpackOsborne2();
        }
    }

}