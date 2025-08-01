package DAY_3_Assignment;

public class Loops_Assignment {
    public static void main(String[] args) {
        int i =1;
        while(i <=5){
            System.out.println("while loop =" + i);
            i++;
        }
        System.out.println("--below are the for loop--");
        /*  for loops*/
        for(int j = 1; j<=5; j++){
            System.out.println(  "for loop ="+ j);
        }

//        do while loop

        int d =1 ;
        do {
            System.out.println("do while loop =" +d);
            d++;
        }
        while (d <=5);

//        •	Write a for loop that prints all numbers between 1 and 20 that are divisible by 3.
//•	Expected output: 3 6 9 12 15 18

        for (int a=3; a<=19; a=a+3){
        System.out.println("Number b/w 3 to 18 /by 3= "+a);}



    }


}
