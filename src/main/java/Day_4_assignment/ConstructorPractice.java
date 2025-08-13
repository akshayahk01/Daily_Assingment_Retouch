package Day_4_assignment;

public class ConstructorPractice {

    String name;
    int age;
    double gpa;

    public ConstructorPractice(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    void display(){
        System.out.println(this.name + " ;" + this .age + " :");
    }






    public static void main(String[] args) {
        ConstructorPractice c1 = new ConstructorPractice("akshay",24,3.4);
        c1.display();
    }
}
