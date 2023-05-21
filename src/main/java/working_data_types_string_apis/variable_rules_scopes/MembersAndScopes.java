package working_data_types_string_apis.variable_rules_scopes;

public class MembersAndScopes {

    public char f = 'A'; // the same module
    protected boolean l = true; // same package or in subtypes
    long j = 12; // default: package-private
    /* ------ members = fields + methods except block initializers and constructors ---------- */
    private int i = 10;  // private : class only

    public static void main(String[] args) {

        /*------ shadowing ---------- */
        int i = 12;
        System.out.println(i); // the local variable is displayed
    }

}
