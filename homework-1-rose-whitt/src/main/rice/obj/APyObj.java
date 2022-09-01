package main.rice.obj;

/**
 * An abstract class whose instances represent specific Python objects.
 */
public abstract class APyObj {

    public static void main(String args[]) {
//        System.out.println(Integer.valueOf(2));
//        System.out.println(Double.valueOf(2));
//        System.out.println(Integer.valueOf(2).equals(Double.valueOf(2)));
    }


    /**
     * @return the underlying (Java) representation of this Python object
     */
    public abstract Object getValue();

    /**
     * Builds and returns a string representation of this object that mirrors the Python
     * string representation.
     *
     * @return a string representation of this object
     */
    @Override
    public String toString() {
        return this.getValue().toString();
    }

    /**
     * Compares this to the input object by value.
     *
     * @param obj the object to compare against
     * @return true if this is equivalent by value to obj; false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // check that object is an instance of abstract superclass
        // and check that values equal each other
        return (obj instanceof APyObj) && (this.getValue().equals(((APyObj) obj).getValue()));
    }

    /**
     * Computes a hash code based on this object's value, such that two objects that are
     * considered equal by .equals() will also have the same hash code.
     *
     * @return the hash code for this object
     */
    @Override
    public abstract int hashCode();
}