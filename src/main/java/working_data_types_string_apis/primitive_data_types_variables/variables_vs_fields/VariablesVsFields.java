package working_data_types_string_apis.primitive_data_types_variables.variables_vs_fields;

import java.util.Random;

public class VariablesVsFields {

    static boolean myClassField;

    /* -------- 3 declare a class field ( default : false ) -------- */
    /* -------- 2 declare an instance field -------- */
    long myInstanceField = 12;

    public static void main(String[] args) {

        /* --------
            1 declare variables : try to remove the value ( you cannot use a variable if it is not initialized )
         -------- */

        long myVariable = 12;
        System.out.println(myVariable);

        /* -------- 2 declare fields : you cannot use instance fields in a static context -------- */
        // System.out.println(myInstanceField);

        /* -------- 3 declare a class field -------- */
        System.out.println(myClassField);


        /* --------
            4 partial initialization won't compile ( non deterministic condition ) ( try to remove else )
         -------- */
        boolean flag = (new Random()).nextBoolean();
        long mySecondVariable;
        if (flag) {
            mySecondVariable = 13;
        } else {
            mySecondVariable = 14;
        }
        System.out.println(mySecondVariable);

        /* --------
            5 partial initialization other example ( try to remove the default block)
         -------- */

        long myThirdVariable;
        switch ((new Random()).nextInt(5 - 1) + 1) {
            case 1:
                myThirdVariable = 13;
                break;
            default:
                myThirdVariable = 14;
        }
        System.out.println(myThirdVariable);
    }
}
