package test.rice.obj;

import main.rice.obj.APyObj;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import main.rice.obj.PyCharObj;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class PyCharObjTest {
    private static PyCharObj charA = new PyCharObj('a');
    private static PyCharObj charADup = new PyCharObj('a');
    private static PyCharObj charACapital = new PyCharObj('A');

    private static PyCharObj charExclam = new PyCharObj('!');
    private static PyCharObj charSpace = new PyCharObj(' ');
    private static PyCharObj charPlus = new PyCharObj('+');
    private static PyCharObj charPlusDup = new PyCharObj('+');
    private static PyCharObj char8 = new PyCharObj('8');

// CHAR LENGTH CAN ONLY BE ONE


    // a tests
    @Test
    void getValueA() {
        assertEquals('a', charA.getValue());

    }
    @Test
    void toStringA() {
        assertEquals("'a'", charA.toString());
    }

    @Test
    void equalsADup() {
        assertEquals(charA, charADup);
    }

    @Test
    void equalsACapitalA() {
        assertFalse(charA.equals(charACapital));
    }

    @Test
    void hashA() {
        assertEquals(charA.hashCode(), charADup.hashCode());
    }

    // ! tests
    @Test
    void getValueExclam() {
        assertEquals('!', charExclam.getValue());
    }

    @Test
    void toStringSpaceLength() {
        // 3 bc character length is one plus two single quotes
        assertTrue(charSpace.toString().length() == 3);
    }

    @Test
    void equalsPlus() {
        assertTrue(charPlus.equals(charPlusDup));
    }

    @Test
    void equalsPlusNumFalse() {
        assertFalse(charPlus.equals(char8));
    }

    @Test
    void equalHashCode() {
        assertEquals(charPlus.hashCode(), charPlus.hashCode());
    }

    @Test
    void equalHashCodeFalse() {
        assertFalse(charA.hashCode() == charExclam.hashCode());
    }


    // ******** PUBLISHED TEST CASES (all passed) ********

    /**
     * Two distinct PyCharObjs representing the Python value 'a'.
     */
    private static PyCharObj lower1 = new PyCharObj('a');
    private static PyCharObj lower2 = new PyCharObj('a');

    /**
     * A PyCharObj representing the Python value 'B'.
     */
    private static PyCharObj upper = new PyCharObj('B');

    /**
     * Two distinct PyCharObjs representing the Python value '1'.
     */
    private static PyCharObj num1 = new PyCharObj('1');
    private static PyCharObj num2 = new PyCharObj('1');

    /**
     * A random integer (between 0 and 256, and a PyCharObj representing the corresponding
     * character.
     */
    private static int randInt;
    private static PyCharObj randVal;

    /**
     * Ensures that randVal gets initialized to a non-alphanumeric character.
     */
    @BeforeAll
    static void setUp() {
        String alphanumeric =
                "abcdefghijklmnopqrstuvqxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        do {
            randInt = new Random().nextInt(256);
            randVal = new PyCharObj((char) randInt);
        } while (alphanumeric.indexOf(randInt) > -1);
    }

    /**
     * Tests that getValue() returns the expected result for a PyCharObj representing a
     * lowercase letter.
     */
    @Test
    @Tag("0.25")
    @Order(1)
    void testGetValueLower() {
        assertEquals('a', lower1.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyCharObj representing an
     * uppercase letter.
     */
    @Test
    @Tag("0.25")
    @Order(2)
    void testGetValueUpper() {
        assertEquals('B', upper.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyCharObj representing a
     * numeric character.
     */
    @Test
    @Tag("0.25")
    @Order(3)
    void testGetValueNumber() {
        assertEquals('1', num1.getValue());
    }

    /**
     * Tests that getValue() returns the expected result for a PyCharObj representing a
     * random character.
     */
    @Test
    @Tag("0.25")
    @Order(4)
    void testGetValueRandom() {
        assertEquals((char) randInt, randVal.getValue());
    }

    /**
     * Tests that toString() returns the expected result for a PyCharObj representing a
     * lowercase letter.
     */
    @Test
    @Tag("0.25")
    @Order(5)
    void testToStringLower() {
        assertEquals("'a'", lower1.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyCharObj representing an
     * uppercase letter.
     */
    @Test
    @Tag("0.25")
    @Order(6)
    void testToStringUpper() {
        assertEquals("'B'", upper.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyCharObj representing a
     * numeric character.
     */
    @Test
    @Tag("0.25")
    @Order(7)
    void testToStringNumber() {
        assertEquals("'1'", num1.toString());
    }

    /**
     * Tests that toString() returns the expected result for a PyCharObj representing a
     * random character.
     */
    @Test
    @Tag("0.25")
    @Order(8)
    void testToStringRandom() {
        assertEquals("'" + (char) randInt + "'", randVal.toString());
    }

    /**
     * Tests that two distinct PyCharObjs with the same value ('a') are considered
     * equivalent by equals().
     */
    @Test
    @Tag("1.0")
    @Order(9)
    void testEqualsSimple() {
        assertEquals(lower1, lower2);
    }

    /**
     * Tests that two distinct PyCharObjs with different values are not considered
     * equivalent by equals().
     */
    @Test
    @Tag("0.5")
    @Order(10)
    void testNotEqual() {
        assertNotEquals(lower1, upper);
    }

    /**
     * Tests that a PyCharObj is not considered to be equivalent to a non-APyObj.
     */
    @Test
    @Tag("1.0")
    @Order(11)
    void testNotEqualNonAPyObj() {
        assertNotEquals(lower1, 'a');
    }

    /**
     * Tests that two distinct PyCharObjs with the same value ('a') return the same value
     * for hashCode().
     */
    @Test
    @Tag("0.5")
    @Order(12)
    void testHashCodeTrue1() {
        assertEquals(lower1.hashCode(), lower2.hashCode());
    }

    /**
     * Tests that two distinct PyCharObjs with the same value ('1') return the same value
     * for hashCode().
     */
    @Test
    @Tag("0.5")
    @Order(13)
    void testHashCodeTrue2() {
        assertEquals(num1.hashCode(), num2.hashCode());
    }

    /**
     * Tests that two distinct PyCharObjs with different values return different values
     * for hashCode().
     */
    @Test
    @Tag("1.0")
    @Order(14)
    void testHashCodeFalse() {
        assertNotEquals(lower1.hashCode(), upper.hashCode());
    }

}
