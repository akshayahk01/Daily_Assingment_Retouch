package Bit_Confusions;

public class Pattrens {

    public static int add(int... numbers){
        int sum=0;
        for (int number : numbers) {

            sum += number;


        }
        return sum;


    }
    public static void main(String[] args) {

        System.out.println(add(1,2,3,4,5));

//       for (int i = 1; i <=5;i++){
//
//           for (int j =1; j<=i;j++) {
//               System.out.print("* ");
//           }
//           System.out.println();
//           }

        for (int i=1; i<=5; i=i+1){

            for (int j = 1; j <=i; j++){
                System.out.print(1);
            }
            System.out.println();

        }
       }
    }

