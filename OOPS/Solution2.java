import java.util.*;

class Vehicle{
    public void drive(){
        System.out.println("Reparing vehicle.");
    }

}

class Car extends Vehicle{
    @Override
    public void drive(){
        System.out.println("Repairing car");
    }
}

public class Main{
    public static void main(String []args){
        Vehicle veh = new Vehicle();
        Car car = new Car();
        veh.drive();
        car.drive();
    }
}