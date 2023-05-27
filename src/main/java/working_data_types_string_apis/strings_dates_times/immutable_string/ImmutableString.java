package working_data_types_string_apis.strings_dates_times.immutable_string;

public class ImmutableString {
    public static void main(String[] args) {

        /* ------- declaring a string literal ------- */
        String str1 = "Hello";


        /* ------- string interning ------- */
        String str2 = "Hello";
        System.out.println(str1 == str2); // true

        String str3 = new String("Hello");
        System.out.println(str3 == str2); // false
    }
}
