package main.rice.obj;

public class PyCharObj extends APyObj {
    private Character charVal;

    public PyCharObj(Character charParam) {
        this.charVal = charParam;
    }

    /**
     * @return the underlying (Java) representation of this Python object
     */
    @Override
    public Character getValue() {
        return this.charVal;
    }

    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return "'" + this.getValue().toString() + "'";
    }

    /**
     * Compares this to the input object by value.
     *
     * @param obj the object to compare against
     * @return true if this is equivalent by value to obj; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof APyObj) && (this.toString().equals(obj.toString()));
    }

    /**
     * Computes a hash code based on this object's value, such that two objects that are
     * considered equal by .equals() will also have the same hash code.
     *
     * @return the hash code for this object
     */
    @Override
    public int hashCode() {
        return this.charVal.hashCode();
    }
}
