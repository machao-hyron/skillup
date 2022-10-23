package test.test4;

public class Car {
    final int LOCK = 0;             //关闭全部电源
    final int ON = 1;               //打开全部电源
    final int START = 2;            //启动发动机
    private int speed = 0;                  //速度
    private boolean isSeated = false;       //车里是否有人
    private int status = LOCK;                 //车的状态
    private String color = "black";         //车的颜色


    public Car() {

    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getisSeated() {
        return isSeated;
    }

    public void setisSeated(boolean isSeated) {
        this.isSeated = isSeated;
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


    public int speedOn(Car car,int i ){
        if (this.speed >= 0){
            if (this.isSeated == true && this.status == ON){
                this.speed = this.speed + i;
            }else if (this.isSeated == true && this.status == START){
                this.speed = this.speed + i;
            }
        }else {
            this.speed = 0;
        }
        return  this.speed;
    }

    public String toString() {
        if (this.speed != 0){
            if (this.speed > 0){
                return ("速度："+this.speed+"，是否有人："+this.isSeated+"，状态："+this.status+"，颜色："+this.color);
            }else {
                return ("倒车请注意！"+"速度："+this.speed+"，是否有人："+this.isSeated+"，状态："+this.status+"，颜色："+this.color);
            }
        }else {

            return ("car is stopping");
        }
    }
}
