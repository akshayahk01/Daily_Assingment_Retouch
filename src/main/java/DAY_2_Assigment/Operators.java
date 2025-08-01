package DAY_2_Assigment;

public class Operators {



        public static void main(String[] args) {
            // Step 1:  variables
            int a = 20;
            int b = 10;


            int addition = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            int division = a / b;


            boolean Result = a > b;


            boolean and = (a > b) && (b > 0);

            // Step 3= results
            System.out.println("Addition:  " + addition);
            System.out.println("Subtraction:  " + subtraction);
            System.out.println("Multiplication:  " + multiplication);
            System.out.println("Division:  " + division);
            System.out.println("Is a greater than b?  " + Result);
            System.out.println("Is a > b and b > 0?  " + and);
        }
    }


