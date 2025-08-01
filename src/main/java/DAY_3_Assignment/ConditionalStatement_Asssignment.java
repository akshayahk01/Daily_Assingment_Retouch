package DAY_3_Assignment;





public class ConditionalStatement_Asssignment {

    public static void main(String[] args) {
        //•	Task1:
//        •	Write a Java program that takes a score variable (e.g., 48).
//        •	If the score is 50 or more, print "Passed"
//        •	Otherwise, print "Failed"

        int marks= 48;

        if (marks <= 50){
            System.out.println("the student is passed");
        }
        else {
            System.out.println("the student is failed best of luck");
        }

//        •	Declare int score = 73;
//•	Write a Java program to assign a grade based on the following criteria:
//•	- A if score ≥ 90
//•	- B if 75 ≤ score < 90
//•	- C if 60 ≤ score < 75
//•	- D if score < 60
//•	Print the grade using: System.out.println("Grade: " + grade);
             int score =91;
        if (score >=90){
            System.out.println("A");

        } else if (  score >=75 && score < 90) {
            System.out.println("B");

        } else if (score >=60 && score <75) {
            System.out.println("C");

        } else if (score<60) {
            System.out.println("D");

        }

        /*   task 3 on Loops*/



    }
}
