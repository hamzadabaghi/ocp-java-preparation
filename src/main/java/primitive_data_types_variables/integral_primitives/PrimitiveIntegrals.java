package primitive_data_types_variables.integral_primitives;

public class PrimitiveIntegrals {
    public static void main(String[] args) {

        /*-------- byte : 1 byte --------*/
        byte maxValueByte = 127;
        byte minValueByte = -128;

        /*-------- short : 2 bytes --------*/
        short maxValueShort = 32_767;
        short minValueShort = -32_768;

        /*-------- int : 4 bytes --------*/
        int maxValueInt = Integer.MAX_VALUE;
        int minValueInt = Integer.MIN_VALUE;

        /*-------- long : 4 bytes --------*/
        long maxValueLong = Long.MAX_VALUE;
        long minValueLong = Long.MIN_VALUE;

        /*-------- primitive data types are circular --------*/
        System.out.println("start from the min value of int");
        System.out.println((maxValueInt + 1) == minValueInt);

        System.out.println("start from the max value of int");
        System.out.println((minValueInt - 1) == maxValueInt);

        /*
        for long variables, you should add L at the end, otherwise the compiler consider them as integers
        try to remove L
        */
        long longVariable = 9_223_372_036_854_775_807L;


    }
}
