package working_data_types_string_apis.primitive_wrappers.wrapper_classes;

public class WrapperClasses {

    public static void main(String[] args) {

        /* --------------- 3 types of conversion methods between the primitive and its wrapper class--------------- */

        /* ----------  1. primitive to wrapper ---------- */

        Integer intWrapper = new Integer(7);

        // we can do some casting ( works only if the initial value is within range of the primitive )

        byte byteValue = intWrapper.byteValue(); // 7
        double doubleValue = intWrapper.doubleValue(); // 7.0

        Double dblWrapper = new Double(4.13);
        byteValue = dblWrapper.byteValue(); // 4 take only the integral part


        /* ----------  2. string to primitive ---------- */

        String value = "1234";
        int intValue = Integer.parseInt(value); // 1234
        float floatValue = Float.parseFloat(value); // 1234.0f


        // intValue = Integer.parseInt("hello world"); // NumberFormatException

        // booleans

        boolean val = Boolean.parseBoolean("true"); // true
        val = Boolean.parseBoolean("hamza"); // false



        /* ----------  3. string / primitive to wrapper ---------- */

        intWrapper = Integer.valueOf(19); // 19
        dblWrapper = Double.valueOf("19.0"); // 19.0

        // the valueOf cannot convert a string to a char wrapper, but supports converting a char to character wrapper

        Character character = Character.valueOf('C');
        System.out.println(character);

    }
}
