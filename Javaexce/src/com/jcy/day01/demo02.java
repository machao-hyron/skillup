package com.jcy.day01;

public class demo02 {

    public static void main(String[] args) {
        Car car01 = new Car();
        car01.setSeated(true);
        car01.setStatus(car01.ON);
        car01.setColor("yellow");
        car01.speedOn(50);
        Car car02 = new Car();
        car02.setSeated(true);
        car02.setStatus(car02.START);
        car02.setColor("blue");
        car02.speedOn(-30);
        Car car03 = new Car();
        car03.speedOn(20);

        System.out.println("car01:" + car01.toString());
        System.out.println("car02:" + car02.toString());
        System.out.println("car03:" + car03.toString());
    }
}
