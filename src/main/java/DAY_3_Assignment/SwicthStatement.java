package DAY_3_Assignment;

public class SwicthStatement {
    public static void main(String[] args) {

//        •	Declare an integer int num = 6;
//•	Use a switch statement with (num % 2) to determine:
//•	- If even → print "Even Number"
//•	- If odd → print "Odd Number"

        int num = 33;
        switch (num%2){
            case 0:
                System.out.println("th number is even");
                break;
            case 1:
                System.out.println("the number is odd ");
                break;
            default:
                System.out.println("invalid number");
        }

    }
}
