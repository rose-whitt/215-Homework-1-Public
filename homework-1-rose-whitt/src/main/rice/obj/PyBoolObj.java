package main.rice.obj;

public class PyBoolObj extends APyObj {
    private Boolean boolVal;

    public PyBoolObj(Boolean boolParam) {
        this.boolVal = boolParam;
    }

    /**
     *
     * @return the underlying (Java) representation of this Python object
     */
    @Override
    public Boolean getValue() {
        return this.boolVal;
    }

    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        if (this.getValue()) {
            return "True";
        } else {
            return "False";
        }
    }

    /**
     * Computes a hash code based on this object's value, such that two objects that are
     * considered equal by .equals() will also have the same hash code.
     *
     * @return the hash code for this object
     */
    @Override
    public int hashCode() {
        return this.boolVal.hashCode();
    }
}
