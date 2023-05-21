package working_data_types_string_apis.operators_math_apis.operations_order;

public class OperationsOrder {
    public static void main(String[] args) {

        /*----- post-unary operator first then pre-unary operator second ------ */
        int x = 3;
        int y = 4;

        int z = x++ + y + --y + x; // x++ first then x then --y then y ; then we evaluate the + operator in the final expression

        /*
         * Post -> pre -> other unary operators ( +expr (default) -expr !expr ) -> multiplicative ( * / % ) -> additive  ( + - )
         */

        x = 3;
        y = 4;
        z = --x + -x + +y--; // 4

        /*----- relational ( comparison operators ) -> equality operators ( == != ) -> single logical operators ( & ^ | )
           -> logical operators ( && || ) ------ */
        x = 3;
        y = 4;
        boolean zbool = y + x * x > y & y != ++x; // false

        boolean e = true;
        boolean f = false;
        zbool = e && f ^ e || f | e; // true


        /*----------- ternary -> assignment operators ------------*/
        x = 3;
        y = 6;
        z = 2;
        z *= y / x - y - x > y ? 4 : 2; // 4


        /* ----------- parentheses : take precedence after the pre-unary operator
         in case we have multiple parentheses, we solve the most internal ones first -------------------*/
        x = 3;
        y = 6;
        z = --x * (x + y + 8); // 32

        x = 3;
        y = 4;
        z = (--x * x + (y + x) - y--); // 6

    }
}
