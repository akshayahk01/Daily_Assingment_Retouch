package Day_4_assignment;

import java.util.Scanner;

public class UserInput_assignment {
    public static void main(String[] args) {
//        Build a simple console-based ATM system with the following features:
//🧾 Functional Requirements:
//        1.	Ask for a 4-digit PIN (e.g., 1234)
//        2.	If PIN is correct, show this menu:
//        1. Check Balance
//        2. Deposit Money
//        3. Withdraw Money
//        4. Exit
//        3.	Perform the chosen operation and repeat the menu until user exits.
//        4.	Validate insufficient funds on withdrawal.





        int atmpin = 2233;
        int pin  , choice ;
         double balance = 10000.00 ;
         double withdraw;

        Scanner S = new Scanner(System.in);

        System.out.println("Please Enter you Atm pin");
         pin = S.nextInt();


         if (pin == atmpin){

             while (true){
                 System.out.println("Below are the menu ");
                 System.out.println(" ");

                 System.out.println("1. Check Balance");
                 System.out.println("2. Deposit Money");
                 System.out.println("3. Withdraw Money");
                 System.out.println("4. Exit");

                 System.out.println(" enter the choice u want");
                  choice = S.nextInt();

                  if (choice==4){
                      System.out.println("thank you visit again");
                      break;
                  }

                  switch (choice){
                      case 1:
                          if (pin== atmpin){
                              System.out.println("your balance is " + balance);
                              break;

                          }
                      case 2:
                          System.out.println("enter the amount u want to deposit");
                          double deposit= S.nextDouble();
                          if ( deposit > 0){
                              balance+= deposit;
                              System.out.println("Succesfully deposited you amount :" + deposit);
                              System.out.println("your balance: " + balance);
                          }else {
                              System.out.println("invaild amount");
                          };
                          break;

                      case 3:
                          System.out.println("Enter the money you want withdraw");
                          withdraw = S.nextDouble();
                          if (withdraw <  0  ){

                              System.out.println("enter valid amount");;
                          } else if (withdraw > balance) {
                              System.out.println("insufficient fund");

                          } else {
                              balance -= withdraw;
                              System.out.println("You  successfully withdrawn: " + withdraw);
                              System.out.println("your balance: " + balance);
                          }
                          break;
                      default:
                          System.out.println("invalid option choice");


                         

                  }
//                  break;




             }
         }






    }
}
