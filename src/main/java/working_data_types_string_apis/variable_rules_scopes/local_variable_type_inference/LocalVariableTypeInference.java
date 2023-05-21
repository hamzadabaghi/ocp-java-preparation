package working_data_types_string_apis.variable_rules_scopes.local_variable_type_inference;

public class LocalVariableTypeInference {

    {
        var i = 2; // valid
    }

    // static var someValue = 3; // compile error
    public static void main(String[] args) {

        /*------ the var keyword -------*/

        int x = 1;
        var z = 3.14f; // z is a float type


        /* ------ var with null ----------*/
        var variable = (String) null;

    }
}
