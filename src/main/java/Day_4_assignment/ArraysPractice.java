package Day_4_assignment;

import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number u want");
        int size = scan.nextInt();
        scan.nextLine();


       int[] number =new  int[size];

        for (int i = 0; i < number.length; i++){
            System.out.println("enterr the number");
            number[i]=scan.nextInt();
        }
        for (int num : number){
            System.out.println(num);
        }


            // 2d Arrays practise to store matrix data



    }
}
