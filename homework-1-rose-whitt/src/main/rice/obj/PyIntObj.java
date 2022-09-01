package main.rice.obj;

public class PyIntObj extends APyObj{
    private Integer intVal;

    public PyIntObj(Integer intParam) {
        this.intVal = intParam;
    }

    /**
     * @return the underlying (Java) representation of this Python object
     */
    @Override
    public Integer getValue() {
        return this.intVal;
    }


    /**
     * Computes a hash code based on this object's value, such that two objects that are
     * considered equal by .equals() will also have the same hash code.
     *
     * @return the hash code for this object
     */
    @Override
    public int hashCode() {
        return this.intVal.hashCode();
    }
}
