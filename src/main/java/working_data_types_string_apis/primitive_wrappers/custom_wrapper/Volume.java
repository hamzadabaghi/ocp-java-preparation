package working_data_types_string_apis.primitive_wrappers.custom_wrapper;

import java.io.Serializable;

public final class Volume implements Serializable { // all wrapper classes are final, add serializable

    private final static double MIN_LITERS = 0;
    private final static double MAX_LITERS = 20.0;
    // encapsulate a primitive value as final
    public final double liters;

    // add constructor
    Volume(double liters) {
        if (liters < MIN_LITERS || liters > MAX_LITERS) throw new NumberFormatException();
        this.liters = liters;
    }


    //  add getters only to make the volume immutable

    public double getVolume() {
        return liters;
    }

    // we can add helper methods

    public double inMilliliters() {
        return this.liters * 1000;
    }

    // add equals and tostring methods


    @Override
    public String toString() {
        return Double.toString(liters) + "ltrs";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) return false;
        Volume other = (Volume) obj;
        return other.getVolume() == this.liters;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
