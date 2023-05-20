package operators_math_apis.ternary_operator_others;

public class TernaryOperatorAndOthers {


    public static void main(String[] args) {

        /* ------------ ternary operator -------------- */

        boolean a = (5 >= 6) ? true : false; // false


        /* ternary in control statements */
        if ((5 >= 6) ? true : false) {
            System.out.println("life is hard");

        } else {
            System.out.println("life is beautiful");
        }

        /* second level of ternary operator  */


        a = (5 >= 6) ? false : (4 >= 3) ? true : false; // true


    }
}
