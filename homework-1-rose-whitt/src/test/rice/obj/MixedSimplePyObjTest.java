package test.rice.obj;

import main.rice.obj.APyObj;
import main.rice.obj.PyBoolObj;
import main.rice.obj.PyCharObj;
import main.rice.obj.PyIntObj;
import main.rice.obj.PyFloatObj;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MixedSimplePyObjTest {
    private static PyIntObj int7 = new PyIntObj(7);
    private static PyCharObj char7 = new PyCharObj('7');

    private static PyIntObj int7242002 = new PyIntObj(7242002);
    private static PyFloatObj float7242002 = new PyFloatObj(7242002.0);

    private static PyBoolObj boolTrue = new PyBoolObj(true);
    private static PyIntObj intTrue = new PyIntObj(1);

    // true and binary representation of true
    @Test
    void toStringEqualsBoolIntTrue() {
        assertFalse(boolTrue.toString().equals(intTrue.toString()));
    }

    @Test
    void hashCodeEqualsBoolIntTrue() {
        assertFalse(boolTrue.hashCode() == intTrue.hashCode());
    }

    // 7 and 7 int and char
    @Test
    void toStringEqualsIntChar7() {
        assertFalse(int7.toString().equals(char7.toString()));
    }

    @Test
    void getValueEqualsIntChar7() {
        assertFalse(int7.getValue().equals(char7.getValue()));
    }

    @Test

    // 7242002 int vs. float
    void equalsIntFloat7242002() {
        assertFalse(int7242002.equals(float7242002));
    }


    // ******** PUBLISHED TEST CASES (all passed) ********
    /**
     * A PyBoolObj, PyIntObj, and PyFloatObj that all have the "same" internal value (1).
     */
    private static PyFloatObj float1 = new PyFloatObj(1.0);
    private static PyIntObj int1 = new PyIntObj(1);
    private static PyBoolObj bool1 = new PyBoolObj(true);

    /**
     * Tests that a PyIntObj and PyBoolObj with the "same" internal value don't count as
     * being equal (according to the PyIntObj .equals() method).
     */
    @Test
    @Tag("0.5")
    @Order(1)
    void testIntNotEqualsBool() {
        assertNotEquals(int1, bool1);
    }

    /**
     * Tests that a PyIntObj and PyBoolObj with the "same" internal value don't count as
     * being equal (according to the PyBoolObj .equals() method).
     */
    @Test
    @Tag("0.5")
    @Order(2)
    void testBoolNotEqualsInt() {
        assertNotEquals(bool1, int1);
    }

    /**
     * Tests that a PyIntObj and PyFloatObj with the "same" internal value don't count as
     * being equal (according to the PyIntObj .equals() method).
     */
    @Test
    @Tag("1.25")
    @Order(3)
    void testIntNotEqualsFloat() {
        assertNotEquals(int1, float1);
    }

    /**
     * Tests that a PyIntObj and PyFloatObj with the "same" internal value don't count as
     * being equal (according to the PyFloatObj .equals() method).
     */
    @Test
    @Tag("1.25")
    @Order(4)
    void testFloatNotEqualsInt() {
        assertNotEquals(float1, int1);
    }

    /**
     * Tests that a PyFloatObj and PyBoolObj with the "same" internal value don't count as
     * being equal (according to the PyBoolObj .equals() method).
     */
    @Test
    @Tag("0.5")
    @Order(5)
    void testBoolNotEqualsFloat() {
        assertNotEquals(bool1, float1);
    }

    /**
     * Tests that a PyFloatObj and PyBoolObj with the "same" internal value don't count as
     * being equal (according to the PyFloatObj .equals() method).
     */
    @Test
    @Tag("0.5")
    @Order(6)
    void testFloatNotEqualsBool() {
        assertNotEquals(float1, bool1);
    }
}
