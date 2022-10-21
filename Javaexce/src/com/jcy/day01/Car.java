package com.jcy.day01;

public class Car {

    final Integer LOCK = 0;

    final Integer ON = 1;

    final Integer START = 2;

    private int speed;

    private boolean isSeated;

    private int status;

    private String color;

    public Car() {
        this.speed = 0;
        this.isSeated = false;
        this.status = LOCK;
        this.color = "black";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSeated() {
        return isSeated;
    }

    public void setSeated(boolean seated) {
        isSeated = seated;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speedOn(int i){
        if (getStatus() == START && isSeated()){
            if (i < 0 && this.speed < -i){
                setSpeed(0);
            }else {
                this.speed += i;
                setSpeed(this.speed);
            }
        }else {
            setSpeed(this.speed);
        }
    }

    @Override
    public String toString() {

        if (getSpeed() != 0){
            return "速度=" + speed + ",颜色=" + color;
        }else {
            return "car is stopping" + (isSeated() ? ",车中有人" : ",车中无人") +
                    (getSpeed() == 0 ? ",车未启动" : ",车已启动") + ",车的颜色=" + getColor();
        }


    }
}
