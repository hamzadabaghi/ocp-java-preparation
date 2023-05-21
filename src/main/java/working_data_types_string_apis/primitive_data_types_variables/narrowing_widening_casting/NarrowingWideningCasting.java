package working_data_types_string_apis.primitive_data_types_variables.narrowing_widening_casting;

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

        /* ---------- Underscores and alternative number systems ----------*/

        /* ---------- Underscores ------------ */

        int c = 1_000_000;
        System.out.println(c);

        /* ---------- Alternative number systems , 100 represented in 4 systems ------------ */
        int w = 100; // decimal
        int x = 0144; // octal
        int y = 0x0064; // hexadecimal
        int z = 0b1100100; // binary

        if (w == x && x == y && y == z) {
            System.out.println("we are equals");
        }

        /* --------- underscores with the alternative number systems -------------- */
        int f = 0x00_64; // hexadecimal of 100 in decimal
        System.out.println(f);

        /* ---------- scientific notation ---------------*/
        double lightSpeed = 5.88e12;
        float diameterHydr = 5.0e-8f;
        System.out.println(diameterHydr);

    }
}
