package Day_4_assignment;

import java.util.Scanner;

public class ClassPractise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many items you want: ");
        int size = scan.nextInt();
        scan.nextLine(); // consume newline

        String[] fruits = new String[size];

        // Input fruits
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter fruit " + (i + 1) + ": ");
            fruits[i] = scan.nextLine();
        }

        // Output fruits
        System.out.println("\nThese are the items you chose:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }

        scan.close();
    }
}
