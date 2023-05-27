package working_data_types_string_apis.strings_dates_times.string_methods;

public class StringMethods {

    public static void main(String[] args) {

        /* ------- string equality ------- */
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2)); // true

        /* ------- string equality with case insensitive ------- */
        String str3 = "Hello";
        String str4 = "hello";
        System.out.println(str3.equalsIgnoreCase(str4)); // true

        /* ------- string length ------- */
        String str5 = "Hello";
        System.out.println(str5.length()); // 5

        /* ------- string uppercase and lowercase ------- */
        String str6 = "Hello";
        System.out.println(str6.toUpperCase()); // HELLO
        System.out.println(str6.toLowerCase()); // hello

        /* ------- string startsWith and endsWith ------- */
        String str7 = "Hello";
        System.out.println(str7.startsWith("He")); // true
        System.out.println(str7.endsWith("lo")); // true

        /* ------- string contains ------- */
        String str8 = "Hello";
        System.out.println(str8.contains("el")); // true

        /* ------- string trim ------- */
        String str9 = "   Hello   ";
        System.out.println(str9.trim()); // Hello


        /* ------- string strip ------- */
        String str10 = "\\u00A0   Hello   ";
        String stripped = str10.strip();
        System.out.println(stripped.length()); // Hello

        /* ------- string charAt ------- */
        String str11 = "Hello";
        System.out.println(str11.charAt(0)); // H

        /* ------- string indexOf ------- */
        String str12 = "Hello";
        System.out.println(str12.indexOf("l")); // 2

        /* ------- string substring ------- */
        String str13 = "Hello";
        System.out.println(str13.substring(2)); // llo
        System.out.println(str13.substring(2, 4)); // ll

        /* ------- string replace ------- */
        String str14 = "Hello";
        System.out.println(str14.replace("l", "L")); // HeLLo

        /* ------- string chaining ------- */
        String str15 = "Hello";
        System.out.println(str15.trim().replace("l", "L").toUpperCase()); // HELLO
    }


}
