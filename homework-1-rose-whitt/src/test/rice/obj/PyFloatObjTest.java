package test.rice.obj;

import main.rice.obj.APyObj;
import main.rice.obj.PyFloatObj;
import main.rice.obj.PyIntObj;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class PyFloatObjTest {

    private static PyFloatObj float9 = new PyFloatObj(9.0);
    private static PyFloatObj float9Dub = new PyFloatObj(9.0);
    private static PyFloatObj float13 = new PyFloatObj(13.3);
    private static PyFloatObj floatNeg1 = new PyFloatObj(-1.0);
    private static PyFloatObj floatNegDecimal = new PyFloatObj(-3.07);
    private static PyFloatObj float00 = new PyFloatObj(0.0);
    private static PyFloatObj float00000 = new PyFloatObj(0.0000);

    private static PyFloatObj floatLargeDub = new PyFloatObj(3421.4538928);
    private static PyFloatObj floatLargeDubRound = new PyFloatObj(3421.453893);

    private static PyFloatObj floatLargestDub112319Dec7242002 = new PyFloatObj(112319.7242002);
    private static PyFloatObj floatLargestDub112319Dec7242002Plus = new PyFloatObj(112319.0 + 0.7242002);

    private static PyFloatObj floatSmallestDubNeg1970Dec52 = new PyFloatObj(-1970.52);
    private static PyFloatObj floatSmallestDubNeg1970Dec52Minus = new PyFloatObj(27.003 - 1997.523);


    // test all on -1970.52
    @Test
    void getValueSmallestDubNeg1970Dec52() {
        assertEquals(-1970.52, floatSmallestDubNeg1970Dec52.getValue());
    }

    @Test
    void toStringSmallestDubNeg1970Dec52() {
        assertEquals("-1970.52", floatSmallestDubNeg1970Dec52.toString());
    }

    @Test
    void equalsSmallestDubNeg1970Dec52() {
        assertTrue(floatSmallestDubNeg1970Dec52.equals(floatSmallestDubNeg1970Dec52Minus));
    }

    @Test
    void hashCodeSmallestDubNeg1970Dec52() {
        assertEquals(floatSmallestDubNeg1970Dec52.hashCode(), floatSmallestDubNeg1970Dec52Minus.hashCode());
    }

    // test all on 9
    @Test
    void getValue9() {
        assertEquals(9.0, float9.getValue());
    }
    @Test
    void toString9() {
        String actual = float9.toString();
        String expected = "9.0";
        assertEquals(expected, actual);
    }

    @Test
    void equals9() {
        Boolean actual = float9.equals(float9Dub);
        assertTrue(actual);
    }

    @Test
    void equals9AndDecimal() {
        Boolean actual = float13.equals(float9);
        assertFalse(actual);
    }

    @Test
    void equals9AndNeg() {
        Boolean actual = float9.equals(floatNeg1);
        assertFalse(actual);
    }

    @Test
    void hashCheck9() {
        assertEquals(float9.hashCode(), float9Dub.hashCode());
    }

    // test all on 112319.7242002 (largest value before scientific notation)
    @Test
    void getValue112319Dec7242002() {
        assertEquals(112319.7242002, floatLargestDub112319Dec7242002.getValue());
    }

    @Test
    void toString112319Dec7242002() {
        assertEquals("112319.7242002", floatLargestDub112319Dec7242002.toString());
    }

    @Test
    void equals112319Dec7242002() {
        assertTrue(floatLargestDub112319Dec7242002Plus.equals(floatLargestDub112319Dec7242002));
    }

    @Test
    void hashCode112319Dec7242002() {
        assertEquals(floatLargestDub112319Dec7242002Plus.hashCode(), floatLargestDub112319Dec7242002.hashCode());
    }

    @Test
    void equalsNegDec() {
        Boolean actual = floatNegDecimal.equals(floatNeg1);
        assertFalse(actual);
    }

    @Test
    void equalsFloat0() {
        assertEquals(float00, float00000);
    }

    // test that doesn't round
    @Test
    void equalsLargeRound() {
        assertFalse(floatLargeDub.equals(floatLargeDubRound));
    }


    // ******** PUBLISHED TEST CASES (all passed) ********


    /**
     * A PyFloatObj representing the Python float value 1.0.
     */
    private static PyFloatObj posFloat = new PyFloatObj(1.0);

    /**
     * Two distinct PyFloatObjs representing the Python float value -1.0.
     */
    private static PyFloatObj negFloat = new PyFloatObj(-1.0);
    private static PyFloatObj negFloat2 = new PyFloatObj(-1.0);

    /**
     * A PyFloatObj representing the Python float value 33333.33333.
     */
    private static PyFloatObj longFloat = new PyFloatObj(33333.33333);

    /**
     * A random floating point value and a PyFloatObj representing that value.
     */
    private static double randVal = new Random().nextDouble();
    private static PyFloatObj randFloat = new PyFloatObj(randVal);

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a positive floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(1)
    void testGetValuePositive() {
        assertEquals(1.0, posFloat.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a negative floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(2)
    void testGetValueNegative() {
        assertEquals(-1.0, negFloat.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a long (in terms of number of decimal places) floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(3)
    void testGetValueLong() {
        assertEquals(33333.33333, longFloat.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyFloatObj constructed with
     * a random floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(4)
    void testGetValueRandom() {
        assertEquals(randVal, randFloat.getValue());
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a positive floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(5)
    void testToStringPositive() {
        assertEquals("1.0", posFloat.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a negative floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(6)
    void testToStringNegative() {
        assertEquals("-1.0", negFloat.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a long (in terms of number of decimal places) floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(7)
    void testToStringLong() {
        assert ((Double.parseDouble(longFloat.toString()) - 33333.33333) < 0.01);
    }

    /**
     * Tests that toString() returns the expected result for a PyFloatObj constructed with
     * a random floating point value.
     */
    @Test
    @Tag("0.25")
    @Order(8)
    void testToStringRandom() {
        assertEquals(String.valueOf(randVal), randFloat.toString());
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with the same floating point value
     * are considered equivalent by equals().
     */
    @Test
    @Tag("1.0")
    @Order(9)
    void testEqualsSimple() {
        assertEquals(negFloat, negFloat2);
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with different values are not
     * considered equivalent by equals().
     */
    @Test
    @Tag("0.5")
    @Order(10)
    void testNotEqual() {
        assertNotEquals(longFloat, negFloat);
    }

    /**
     * Tests that a PyFloatObj is not considered to be equivalent to a non-APyObj.
     */
    @Test
    @Tag("1.0")
    @Order(11)
    void testNotEqualNonAPyObj() {
        assertNotEquals(posFloat, 1.0);
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with the same floating point value
     * return the same value for hashCode().
     */
    @Test
    @Tag("1.0")
    @Order(12)
    void testHashCodeSimple() {
        assertEquals(negFloat.hashCode(), negFloat2.hashCode());
    }

    /**
     * Tests that two distinct PyFloatObjs constructed with different values return
     * different values for hashCode().
     */
    @Test
    @Tag("1.0")
    @Order(13)
    void testHashCodeNotEqual() {
        assertNotEquals(longFloat.hashCode(), negFloat.hashCode());
    }
}
