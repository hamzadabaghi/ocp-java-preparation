package operators_math_apis.logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {

        int x = 7;
        boolean z = false;

        /* ---------- the bitwise & operator ---------- */

        boolean a = false & true; // false;


        /* ---------- the bitwise | operator ---------- */

        boolean b = true & false; // true;
        boolean y = (x <= 7) | (z = true); // z = true, y = true


        /* ---------- the && and ||  operators ---------- */

        y = (x <= 7) || (z = false); // y = true, z = true;



        /* ------------- the exclusive or operator ----------- */

        y = (x <= 7) ^ (z = false); // y = true, z = false;

        /* --------------- not operator -------------------- */

        y = !y; // false
    }
}
