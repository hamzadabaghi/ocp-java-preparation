package controlling_program_flow.switch_statement;

public class SwitchStatement {
    public static void main(String[] args) {

        /* ---- switch statement ---- */
        int switchValue = 2;
        switch (switchValue) {
            case 1:
                //System.out.println("Value was 1");
                break; // break statement is used to exit the switch statement
            case 2:
                //System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5: // multiple cases in one line
        }


        /* ---- the effect of break on switch flow ---- */
        String valueName = "one";
        switch (valueName) {
            case "one":
                //System.out.println("Value was 1"); // this line will be printed
            case "two":
                //System.out.println("Value was 2"); // this line will be printed
                break;
        }

        /* ---- switch statement with different order ( with break, the order it doesn't matter) ---- */
        String variable = "one";
        switch (variable) {
            default:
                System.out.println("Was not 1 or 2");
                break;
            case "two":
                System.out.println("Value was 2"); // this line will be printed
                break;
            case "one":
                System.out.println("Value was 1"); // this line will be printed


        }

        /* ---- switch statement with different order ( without break, the order it does matter) ---- */
        char operation = '+';
        int sum = 0;
        switch (operation) {
            case '+':
                sum += 1;
            default:
                System.out.println("sum = " + sum);
                break;
            case '*':
                sum *= 1;
            case '/':
                sum /= 1;
        }


    }
}
