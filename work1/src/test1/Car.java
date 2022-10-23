package test1;

public class Car {
    public int LOCK=0;
    public int ON=1;
    public int START=2;

    private int speed;
    private boolean isSeated;
    private int Status;
    private String color;

    public Car() {
        this.speed = 0;
        this.isSeated = false;
        this.Status = LOCK;
        this.color = "black";
    }

    public void setSeated(boolean seated) {
        isSeated = seated;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public boolean isSeated() {
        return isSeated;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStatus() {
        return Status;
    }

    public String getColor() {
        return color;
    }

    public void speedOn(int x){
        if (isSeated()==true && getStatus() == START){
            if (x<0 && this.speed<-x){
                setSpeed(this.speed);
            }else {
                setSpeed(this.speed);
            }
        }else {
            setSpeed(this.speed+x);
        }
    }

    @Override
    public String toString(){
        if (getSpeed() == 0){
            return "car is stopping  "+"\t"+(isSeated()==true? "  yes,people in":"no,people out")+"\t"+(getSpeed()==0?"  not working":"  working  ")+"\t"+getColor();
        }else {
            return "speed:"+speed+"\t"+"color:"+color;
        }
    }

}
