package Day_4_assignment;

public class Objects_in_array {

    String name;
    int id;
    String colour;
    int model;
    Objects_in_array(String name, int id, String colour,int model){
        this.name= name;
        this.id= id;
        this.colour = colour;
        this.model= model;
    }

    public  void drive(){
        System.out.print("you are driving "+ this.name +" " +this.id  +"  "+this.colour+  " " +this.model);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", colour='" + colour + '\'' +
                ", model=" + model +
                '}';
    }

    public static void main(String[] args) {
        Objects_in_array car1= new Objects_in_array("tayota",2234,"black",2024);
        Objects_in_array car2= new Objects_in_array("tayota",2234,"black",2024);
        Objects_in_array car3= new Objects_in_array("tayota",2234,"black",2024);
        Objects_in_array car4= new Objects_in_array("tayota",2234,"black",2024);

        Objects_in_array [] Cars= {car1,car2,car3,car4};
        for (Objects_in_array car : Cars){

//            car.drive();
            System.out.println(car);
        }

    }
}
