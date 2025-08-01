package DAY_2_Assigment;

public class Typecosting {
    public static void main(String[] args) {
        int a = 9;
        double b = 4.0;
        double x = 22.7;
        int y = 4;

        double sum = (double) a + b;

        double division = a / b;


        boolean isGreater = a > (int) b;


        boolean and = (a % 3 == 0) && (b > 2.5);


        System.out.println("Sum : " + sum);
        System.out.println("Division : " + division);
        System.out.println("Is a > (int)b? " + isGreater);
        System.out.println("Is a divisible by 3 and b > 2.5? " + and);
    }
    }

