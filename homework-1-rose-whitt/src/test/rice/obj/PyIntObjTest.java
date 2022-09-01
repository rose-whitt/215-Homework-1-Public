package test.rice.obj;

import main.rice.obj.APyObj;
import main.rice.obj.PyIntObj;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class PyIntObjTest {
    private static PyIntObj int6 = new PyIntObj(6);
    private static PyIntObj int6Dup = new PyIntObj(6);
    private static PyIntObj intNeg6 = new PyIntObj(-6);
    private static PyIntObj int0 = new PyIntObj(0);
    private static PyIntObj int0Dup = new PyIntObj(0);
    private static PyIntObj intNeg724 = new PyIntObj(-724);
    private static PyIntObj intNeg724Dup = new PyIntObj(-724);
    private static PyIntObj int1123 = new PyIntObj(1123);
    private static PyIntObj int1123Dup = new PyIntObj(1123);

    // false tests
    @Test
    void hashCodeFalse() {
        assertFalse(intNeg724.hashCode() == int1123.hashCode());
    }

    @Test
    void equalsNegPosFalse() {
        assertFalse(int6.equals(intNeg6));
    }

    @Test
    void toStringFalse() {
        assertFalse(int0.toString().equals(int1123));
    }

    // length test
    @Test
    void toStringLength() {
        assertTrue(int0.toString().length() == 1);
    }

    // all 1123 tests
    @Test
    void getValue1123() {
        assertEquals(1123, int1123.getValue());
    }

    @Test
    void toStringN1123() {
        assertEquals("1123", int1123.toString());
    }

    @Test
    void equals1123() {
        assertTrue(int1123.equals(int1123Dup));
    }

    @Test
    void hashCode1123() {
        assertTrue(int1123.hashCode() == int1123Dup.hashCode());
    }

    // all -724 tests
    @Test
    void getValueNeg724() {
        assertEquals(-724, intNeg724.getValue());
    }

    @Test
    void toStringNeg724() {
        assertEquals("-724", intNeg724.toString());
    }

    @Test
    void equalsNeg724() {
        assertTrue(intNeg724.equals(intNeg724Dup));
    }

    @Test
    void hashCodeNeg724() {
        assertTrue(intNeg724.hashCode() == intNeg724Dup.hashCode());
    }


    // all zero tests
    @Test
    void getValue0() {
        assertEquals(0, int0.getValue());
    }

    @Test
    void toString0() {
        assertEquals("0", int0.toString());
    }

    @Test
    void equals0() {
        assertTrue(int0.equals(int0Dup));
    }

    @Test
    void hashCode0() {
        assertTrue(int0.hashCode() == int0Dup.hashCode());
    }

    // 6 tests
    @Test
    void getValue6() {
        assertEquals(6, int6.getValue());
    }

    @Test
    void toString6() {
        assertEquals("6", int6.toString());
    }

    @Test
    void equals6() {
        assertTrue(int6.equals(int6Dup));
    }

    @Test
    void hashCode6() {
        assertTrue(int6.hashCode() == int6Dup.hashCode());
    }

    // ******** PUBLISHED TEST CASES (all passed) ********


    /**
     * A PyIntObj representing the Python integer value 1.
     */
    private static PyIntObj posInt = new PyIntObj(1);

    /**
     * A PyIntObjs representing the Python integer value -1.
     */
    private static PyIntObj negInt = new PyIntObj(-1);

    /**
     * Two distinct PyIntObjs representing the Python integer value 123456789.
     */
    private static PyIntObj largeInt = new PyIntObj(123456789);
    private static PyIntObj largeInt2 = new PyIntObj(123456789);

    /**
     * A random integer (between 0 and Integer.MAX_VALUE), and a PyIntObj representing
     * that value.
     */
    private static int randVal = new Random().nextInt(Integer.MAX_VALUE);
    private static PyIntObj randInt = new PyIntObj(randVal);

    /**
     * Tests that getValue() returns the expected result for a PyIntObj constructed with a
     * positive integer value.
     */
    @Test
    @Tag("0.25")
    @Order(0)
    void testGetValuePositive() {
        assertEquals(1, posInt.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyIntObj constructed with a
     * negative integer value.
     */
    @Test
    @Tag("0.25")
    @Order(1)
    void testGetValueNegative() {
        assertEquals(-1, negInt.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyIntObj constructed with a
     * random integer value.
     */
    @Test
    @Tag("0.25")
    @Order(2)
    void testGetValueRandom() {
        assertEquals(randVal, randInt.getValue());
    }

    /**
     * Tests that toString() returns the expected result for a PyIntObj constructed with a
     * positive integer value.
     */
    @Test
    @Tag("0.25")
    @Order(3)
    void testToStringPositive() {
        assertEquals("1", posInt.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyIntObj constructed with a
     * negative integer value.
     */
    @Test
    @Tag("0.25")
    @Order(4)
    void testToStringNegative() {
        assertEquals("-1", negInt.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyIntObj constructed with a
     * large positive integer value.
     */
    @Test
    @Tag("0.25")
    @Order(5)
    void testToStringLarge() {
        assertEquals("123456789", largeInt.toString());
    }

    /**
     * Tests that two distinct PyIntObjs constructed with the same integer value are
     * considered equivalent by equals().
     */
    @Test
    @Tag("1.0")
    @Order(6)
    void testEqualsSimple() {
        assertEquals(largeInt, largeInt2);
    }

    /**
     * Tests that two distinct PyIntObjs constructed with different values are not
     * considered equivalent by equals().
     */
    @Test
    @Tag("0.5")
    @Order(7)
    void testNotEqual() {
        assertNotEquals(posInt, largeInt);
    }

    /**
     * Tests that a PyIntObj is not considered to be equivalent to a non-APyObj.
     */
    @Test
    @Tag("1.0")
    @Order(8)
    void testNotEqualNonAPyObj() {
        assertNotEquals(posInt, 1);
    }

    /**
     * Tests that two distinct PyIntObjs constructed with the same integer value return
     * the same value for hashCode().
     */
    @Test
    @Tag("1.0")
    @Order(9)
    void testHashCodeSimple() {
        assertEquals(largeInt.hashCode(), largeInt2.hashCode());
    }

    /**
     * Tests that two distinct PyIntObjs constructed with the different values return
     * different values for hashCode().
     */
    @Test
    @Tag("1.0")
    @Order(10)
    void testHashCodeNotEqual() {
        assertNotEquals(posInt.hashCode(), largeInt.hashCode());
    }
}
