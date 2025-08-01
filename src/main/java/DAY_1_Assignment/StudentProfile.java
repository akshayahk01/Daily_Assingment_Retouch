package DAY_1_Assignment;

public class StudentProfile {

    String Name= "Akshay hk";
    byte age = 24;
    double Wight =60.5;
    String Grade= "A";
    boolean Has_cleared_fee = true;
    int score= 89;
    byte Level=1;
    long Registernumber=22344566787L;

    char Gender='m';
    // we can create one function to display all the ditails we can reuse it
    public void display() {
        System.out.println("Name: " + Name);
        System.out.println("reg no: " + Registernumber);

        System.out.println("Age: " + age);
        System.out.println("Weight: " + Wight + "kg");
        System.out.println("Grade: " + Grade);
        System.out.println("Has Cleared Fee: " + Has_cleared_fee);
        System.out.println("Score: " + score);
        System.out.println("Level: " + Level);
        System.out.println("Gender: " + Gender);
    }


    public static void main(String[] args) {
        StudentProfile S = new StudentProfile();
//      S.display();

        System.out.println(" student profile shown below :-");
        System.out.println("student name: "+S.Name);
        System.out.println("Regno: "+S.Registernumber);
        System.out.println("student age:   "   +S.age);
        System.out.println("student Wight: "   +S.Wight);
        System.out.println("student grade: "+S.Grade);
        System.out.println("student Score: "   +S.score);
        System.out.println("student has cleared a fee: "+S.Has_cleared_fee);
        System.out.println("student level: "+S.Level);
        System.out.println("student Gender: "+S.Gender);


        System.out.println("thank you");


    }


}
