package primitive_data_types_variables.char_primitive;

public class PrimitiveChar {

    public static void main(String[] args) {


        /*---------- define a character -------------*/
        char aLetter = 'A';
        char aUnicode = '\u0041';

        char sheenInArabic = '\u0634';
        System.out.println("Sheen in arabic : " + sheenInArabic);

        /*---------- characters are stored as integrals -------------*/
        System.out.println(aLetter == 65 && aUnicode == 65);

        /*---------- if you used double quotes on characters they become strings -------------*/
        char aString = "a";

    }
}
