package working_data_types_string_apis.operators_math_apis.math_apis;

public class MathApis {
    public static void main(String[] args) {

        /* ----------- random static method ------------ */

        double result = Math.random(); // returns a random value between 0 and 1

        /* ----------- round static method : round any decimal number to the nearest integral ------------ */

        float pi = 3.14f;
        int intX = Math.round(pi); // 3 ( round a float -> int; round a double -> long )


        /* ----------- pow static method : takes 2 double parameters and make the power operation ------------ */
        double num = 2;
        double exp = 3;

        result = Math.pow(num, exp); // 8.0

        /* ----------- max and min takes 2 parameters and returns the min / max ------------ */
        result = Math.max(2, 3); // 3

    }
}
