package javatest.TestFour;

import lombok.Data;

import static java.lang.Math.abs;

@Data
public class Car {
    static int LOCK = 0;
    static int ON = 1;
    static int START = 2;
    private int speed = 0;
    private boolean isSread = false;
    private int status = LOCK;
    private String color = "black";

    public Car() {
    }

    public Car(boolean isSread, int status, String color) {
        this.isSread = isSread;
        this.status = status;
        this.color = color;
    }

    public int speedOn(Car car, int i) {
        if (isSread && status == START) {

            if (speed >= 0) {
                if (i > 0) {
                    speed = speed + i;
                } else if (i < 0 && abs(i) < speed) {
                    speed = speed + i;
                } else {
                    speed = 0;
                    System.out.println("速度已经为0，不能在减少");
                }
            }
        }
        return speed;
    }

    @Override
    public String toString() {
        if (speed > 0) {
            return "Car{" +
                    "speed=" + speed +
                    ", isSread=" + isSread +
                    ", status=" + status +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "car is stopping";
        }
    }
}
