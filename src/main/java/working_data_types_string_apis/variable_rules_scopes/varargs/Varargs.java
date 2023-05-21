package working_data_types_string_apis.variable_rules_scopes.varargs;

public class Varargs {

    public static void main(String[] args) {

        /*---------- varargs ---------*/
        someMethod("hamza", 1, 2, 3);
    }

    static void someMethod(String name, int... params) {
        System.out.println(params.length);
    }
}
