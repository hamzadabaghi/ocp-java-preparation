package working_data_types_string_apis.primitive_data_types_variables.decimal_primitives;

public class PrimitiveDecimals {
    public static void main(String[] args) {

        /*-------- float : 4 bytes --------*/
        float piFloat = 3.14F;

        /*-------- double : 8 bytes --------*/
        double piDouble = 3.14;

        /*-------- both the float and double round the last digit after the decimal point --------*/

        /*-------- round the float : float (max 7 decimal digits) -------- */
        piFloat = 3.141592653F;

        /*-------- round the double : double (max 15 decimal digits) -------- */
        piDouble = 3.14159265358979323;


        /*-------- both can assigned values without decimal points, if the value is too big it will
                   end up presented with the scientific notation
        --------*/

        float longToFloat = 1111111112222222223L;
        double longToDouble = 1111111112222222223L;
        System.out.println(longToDouble);
    }
}
