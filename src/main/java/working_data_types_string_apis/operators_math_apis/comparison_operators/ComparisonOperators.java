package working_data_types_string_apis.operators_math_apis.comparison_operators;

public class ComparisonOperators {


    public static void main(String[] args) {

        /* ---------- comparison operators ------------ */

        /*
         * ==
         * !=
         * <
         * <=
         * >
         * >=
         * instanceof
         */

        boolean z = 5 == 6; // false


        /* -------------- comparison operators of numerical types ( integrals and decimals ) --------- */

        /*
         * <
         * <=
         * >
         * >=
         */

        int x = 10;
        // z = x > false; will not compile


        /* ----- comparison operators for comparing primitive numbers & boolean & object references ------*/
        /*
         * ==
         * !=
         */

        z = false == true; // false


        /* --------------- instanceof : compares one type to another ( true : of type / subtype ) , ( false : otherwise )
        --------------- */
        String c = "hamza";
        z = c instanceof String; // true

    }
}
