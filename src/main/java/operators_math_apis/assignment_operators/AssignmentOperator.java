package operators_math_apis.assignment_operators;

public class AssignmentOperator {
    public static void main(String[] args) {

        /* ----------- assignment operator ---------- */

        int x = 5;
        int y = 6;
        int z = x + y; // 11

        /* ----------- assignment operator as an operation ---------- */

        z = 5 + (y = x + y); // y = 11 : z = 16


        /* ---------- compound assignment operator --------------- */

        x += 5; // 10;

        y *= 2; // 22;

        /* ---------- compound assignment operator automatically cast the types when there is a type promotion
        ( we don't need casting ) ----------- */

        byte a = 10;
        a += 12; // 22;

    }
}
