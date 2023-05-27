package controlling_program_flow.conditional_logic;

public class ConditionalLogic {
    public static void main(String[] args) {

        /* --- if else with block statement --- */
        int x = 10;
        int y = 20;
        if (x > y) {
//            System.out.println("true");
//            System.out.println("x is greater than y");
        } else {
//            System.out.println("false");
//            System.out.println("x is less than or equal to y");
        }
        /* --- chaining if-else : only one test is getting executed --- */
        x = 30;
        y = 30;
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x <= y) {
            System.out.println("x is less than y");
        } else if (x <= y) {
            System.out.println("x is less than y wow");
        } else {
            System.out.println("x is equal to y");
        }


    }

}





