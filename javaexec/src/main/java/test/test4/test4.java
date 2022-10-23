package test.test4;

import test.Number;

public class test4 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.setSpeed(0);car1.setisSeated(true);car1.setStatus(car1.ON);car1.setColor("yellow");
        car2.setSpeed(20);car2.setisSeated(true);car2.setStatus(car2.START);car2.setColor("blue");
        car1.speedOn(car1,50);
        car2.speedOn(car2,-30);
        car3.speedOn(car3,20);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }

}
