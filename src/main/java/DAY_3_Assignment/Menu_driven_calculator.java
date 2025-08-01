package DAY_3_Assignment;

import java.util.Scanner;

public class Menu_driven_calculator {
    public static void main(String[] args) {
//        •	Use a while loop to keep showing a menu:
//•	      1. Add
//        2. Subtract
//        3. Multiply
//        4. Divide
//        5. Exit
//•	Let the user pick an option using a number
//•	Use a switch to perform the operation
//•	Loop continues until user chooses 5

        Scanner S = new Scanner(System.in);
         int choice ;
        double num1;
        double num2;
        double result;

        while(true){
            System.out.println("below are the options");

            System.out.println("1 = Addition");
            System.out.println("2 = Subtract ");
            System.out.println("3 =  Multiply");
            System.out.println("4 = Divide");
            System.out.println("5 = Exit");

            System.out.println("enter the choice do u want in above menu");
            choice = S.nextInt();


            if (choice==5){
                System.out.println("invaild option");
                break; }




            System.out.println("Enter the first number");
            num1 =S.nextInt();

            System.out.println("Enter the second number");
            num2 =S.nextInt();



            switch (choice){

                case 1:
                    result= num1+num2;
                    System.out.println("addition= "+result);
                    break;
                case 2:
                    result= num1-num2;
                    System.out.println( " Subtract ="  + result);
                    break;
                case 3:
                    result= num1*num2;
                    System.out.println("multiplication= "+result);
                    break;
                case 4:
                    result= num1/num2;
                    System.out.println("division= "+result);
                    break;
                default:
                    System.out.println("invaid choice cheak the menu once");

            }
            break;





        }
        S.close();



    }
}
