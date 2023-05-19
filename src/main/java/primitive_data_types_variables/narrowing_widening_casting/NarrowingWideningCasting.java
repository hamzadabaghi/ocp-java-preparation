package primitive_data_types_variables.narrowing_widening_casting;

public class NarrowingWideningCasting {
    public static void main(String[] args) {

        /* ---------- widening ----------- */
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;


        float floatValue = 10.2F;
        double doubleValue = floatValue;

        /* ---------- casting and narrowing ----------- */

        int a = 12;
        byte b = (byte) a;
        System.out.println(b);

    }
}
