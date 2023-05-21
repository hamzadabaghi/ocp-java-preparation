package working_data_types_string_apis.primitive_wrappers.unboxing_autoboxing;

public class UnboxingAutoboxing {

    public static void main(String[] args) {

        /* -------- autoboxing : primitive to wrapper  ----------- */

        Integer integer = 234; // autoboxing



        /* -------- unboxing  : wrapper to primitive ----------- */
        int intPrimitive = integer; // unboxing


        // wrapper classes are final and immutable

        Short shortWrapper = new Short((short) 14);

        // casting with boxing is not supported

        // byte byteValue = (byte) shortWrapper; // doesn't work
        // Byte byteWrapper = (Byte) shortWrapper; // doesn't work


        /* ---------- widening is supported ---------- */
        intPrimitive = shortWrapper; // 14

    }
}
