package working_data_types_string_apis.strings_dates_times.string_concatenation;

public class StringConcatenation {

    public static void main(String[] args) {

        /* ------- string concatenation ------- */
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + str2;

        String str4 = "HelloWorld";
        System.out.println(str3 == str4); // false ( the result of concatenation is not shared in the string literal pool )


        /* ------- string concatenation in an expression ------- */
        String str5 = 5 + 3 + "xyz" + 3 + 5;// 8xyz35
        System.out.println(str5); // everything that comes after a string literal is concatenated as a string if the order of operations is all the same


    }
}
