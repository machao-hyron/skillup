package javatest.TestFour;


public class TestCar extends Car {
    public static void main(String[] args) {
        Car car1 = new Car(true, ON, "yellow");
        Car car2 = new Car(true, START, "blue");
        Car car3 = new Car();
        car1.speedOn(car1, 50);
        car2.speedOn(car2, 30);
        car3.speedOn(car3, 20);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);


    }


}