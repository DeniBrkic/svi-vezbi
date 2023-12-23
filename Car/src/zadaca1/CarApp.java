package zadaca1;
public class CarApp {
    public static void main(String[] args) {

        Car car1 = new Car();


        Car car2 = new Car("Toyota", "Camry", 2022);
      
        System.out.println("Car 1 details: " + car1);
        System.out.println("Car 2 details: " + car2);
    }
}