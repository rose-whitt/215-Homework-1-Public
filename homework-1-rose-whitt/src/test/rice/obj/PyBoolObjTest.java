package test.rice.obj;

import main.rice.obj.APyObj;
import main.rice.obj.PyBoolObj;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test cases for the PyBoolObj class.
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PyBoolObjTest {
//
//    private static APyObj true1 = new PyBoolObj(true);
//    private static APyObj true2 = new PyBoolObj(32423 == 32423);
//    private static APyObj false1 = new PyBoolObj(false);
//    private static APyObj false2 = new PyBoolObj(-432 == 5);
//
//    /**
//     * Tests that getValue() returns the expected result for a PyBoolObj representing
//     * True.
//     */
//    @Test
//    void testGetValueTrue() {
//        assertEquals(true, true1.getValue());
//    }
//
//    @Test
//    void testGetValueFalse() {
//        assertEquals(false, false2.getValue());
//    }
//
//    @Test
//    void testGetValueType() {
//        assertTrue(false2.getValue() instanceof Boolean);
//    }
//    /**
//     * Tests that toString() returns the expected result for a PyBoolObj representing
//     * True.
//     */
//    @Test
//    void testToStringTrue() {
//        assertEquals("True", true1.toString());
//    }
//
//    @Test
//    void testToStringFalse() {
//        assertEquals("False", false2.toString());
//    }
//
//    @Test
//    void testToStringTrueLength() {
//        assertTrue(true1.toString().length() == 4);
//    }
//
//    @Test
//    void testToStringFalseeLength() {
//        assertTrue(false2.toString().length() == 5);
//    }
//
//    /**
//     * Tests that two distinct PyBoolObjs with the same value (true) are considered
//     * equivalent by equals().
//     */
//    @Test
//    void testEqualsTrue() {
//        assertTrue(true1.equals(true2));
//    }
//
//    @Test
//    void testEqualsTrueFalse() {
//        assertTrue(false1.equals(false2));
//    }
//
//    @Test
//    void testEqualsFalse() {
//        assertFalse(true2.equals(false2));
//    }
//
//
//    /**
//     * Tests that two distinct PyBoolObjs with the same value (true) return the same value
//     * for hashCode().
//     */
//    @Test
//    void testHashCodeTrueValue() {
//        assertEquals(true1.hashCode(), true2.hashCode());
//    }
//
//    @Test
//    void testHashCodeTrueFalse() {
//        assertFalse(true1.hashCode() == false1.hashCode());
//    }
//
//    @Test
//    void testHashCodeFalseValue() {
//        assertEquals(false1.hashCode(), false2.hashCode());
//    }

    // ******** PUBLISHED TEST CASES (all passed) ********

    /**
     * Two distinct PyBoolObjs representing the Python value True.
     */
    private static PyBoolObj true1 = new PyBoolObj(true);
    private static PyBoolObj true2 = new PyBoolObj(true);

    /**
     * Two distinct PyBoolObjs representing the Python value False.
     */
    private static PyBoolObj false1 = new PyBoolObj(false);
    private static PyBoolObj false2 = new PyBoolObj(false);

    /**
     * Tests that getValue() returns the expected result for a PyBoolObj representing
     * True.
     */
    @Test
    @Tag("0.25")
    @Order(1)
    void testGetValueTrue() {
        assertEquals(true, true1.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyBoolObj representing
     * False.
     */
    @Test
    @Tag("0.25")
    @Order(2)
    void testGetValueFalse() {
        assertEquals(false, false1.getValue());
    }

    /**
     * Tests that toString() returns the expected result for a PyBoolObj representing
     * True.
     */
    @Test
    @Tag("1.0")
    @Order(3)
    void testToStringTrue() {
        assertEquals("True", true1.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyBoolObj representing
     * False.
     */
    @Test
    @Tag("1.0")
    @Order(4)
    void testToStringFalse() {
        assertEquals("False", false1.toString());
    }

    /**
     * Tests that two distinct PyBoolObjs with the same value (true) are considered
     * equivalent by equals().
     */
    @Test
    @Tag("0.5")
    @Order(5)
    void testEqualsTrue() {
        assertEquals(true1, true2);
    }

    /**
     * Tests that two distinct PyBoolObjs with the same value (false) are considered
     * equivalent by equals().
     */
    @Test
    @Tag("0.5")
    @Order(6)
    void testEqualsFalse() {
        assertEquals(false1, false2);
    }

    /**
     * Tests that a PyBoolObj is not considered to be equivalent to a non-APyObj.
     */
    @Test
    @Tag("1.0")
    @Order(7)
    void testNotEqualNonAPyObj() {
        assertNotEquals(true1, true);
    }

    /**
     * Tests that two PyBoolObjs with different values are not considered equivalent by
     * equals().
     */
    @Test
    @Tag("0.5")
    @Order(8)
    void testNotEqual() {
        assertNotEquals(true1, false1);
    }

    /**
     * Tests that two distinct PyBoolObjs with the same value (true) return the same value
     * for hashCode().
     */
    @Test
    @Tag("0.25")
    @Order(9)
    void testHashCodeTrue() {
        assertEquals(true1.hashCode(), true2.hashCode());
    }

    /**
     * Tests that two distinct PyBoolObjs with the same value (false) return the same
     * value for hashCode().
     */
    @Test
    @Tag("0.25")
    @Order(10)
    void testHashCodeFalse() {
        assertEquals(false1.hashCode(), false2.hashCode());
    }

    /**
     * Tests that two distinct PyBoolObjs with different values return different values
     * for hashCode().
     */
    @Test
    @Tag("1.0")
    @Order(11)
    void testHashCodeNotEqual() {
        assertNotEquals(true1.hashCode(), false1.hashCode());
    }
 }