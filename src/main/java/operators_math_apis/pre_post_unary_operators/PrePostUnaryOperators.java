package operators_math_apis.pre_post_unary_operators;

public class PrePostUnaryOperators {
    public static void main(String[] args) {

        /* --------------- pre-unary operator --------------- */

        int x = 1;

        ++x;

        double y = 3.14;
        --y;

        System.out.println(x); // 2
        System.out.println(y); // 2.14


        int z = ++x + x + --x; // ++x is evaluated first ( evaluation of expression from left to right )
        System.out.println(z); // 8


        /* --------------- post-unary operator  --------------- */

        x = 1;
        z = x++ + x + x++; // 1 + 2 + 2 = 5

        /* x++ is evaluated after the + between ( x++ and x )
        to the new value : 1 + in between (x= x+1 ; 2 ) + 2 ( the new value) .....  */


    }
}
