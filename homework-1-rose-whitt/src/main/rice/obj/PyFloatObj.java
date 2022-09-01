package main.rice.obj;

public class PyFloatObj extends APyObj {
    private Double floatVal;

    public PyFloatObj(Double floatParam) {
        this.floatVal = floatParam;
    }

    /**
     * @return the underlying (Java) representation of this Python object
     */
    @Override
    public Double getValue() {
        return this.floatVal;
    }

    /**
     * Computes a hash code based on this object's value, such that two objects that are
     * considered equal by .equals() will also have the same hash code.
     *
     * @return the hash code for this object
     */
    @Override
    public int hashCode() {
        return this.floatVal.hashCode();
    }
}
