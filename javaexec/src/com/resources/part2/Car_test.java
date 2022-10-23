package com.resources.part2;


/*
 * 课后练习1-3
 */

public class Car_test {
	
	public static void main(String[] args) {
		//第一个车
		Car car_test1 = new Car();
		car_test1.setInSleated(true);//有人
		car_test1.setStatus(1);//状态为ON
		car_test1.setColor("yellow");//颜色为yellow
		
		
		//第二个车
		Car car_test2 = new Car();
		car_test2.setInSleated(true);//有人
		car_test2.setStatus(2);//状态为START
		car_test2.setColor("blue");//颜色为blue
		
		//第三个车
		Car car_test3 = new Car();
		car_test3.createCar();
		
		//设置速度
		car_test1.speedOn(50);
		car_test2.speedOn(-30);
		car_test3.speedOn(20);

		//显示对象状态
		System.out.println("---------The first car--------");
		System.out.println(car_test1.toString());
		System.out.println("---------The second car--------");
		System.out.println(car_test2.toString());
		System.out.println("---------The third car--------");
		System.out.println(car_test3.toString());
	}

}

class Car {
	//车的状态
	static final int LOCK = 0;
	static final int ON = 1;
	static final int START = 2;
	
	private int speed ; //车的速度
	private boolean inSleated ; //车里是否有人
	private int status ; //车的状态
	public String color ; //车的颜色
	
	public void createCar(){
		//创建一个默认的车
		this.speed=0;
		this.inSleated=false;
		this.status=LOCK;
		this.color="black";
	}

	public void speedOn(int s) {
		//修改车的速度
		int car_speed = this.speed;
		if((this.inSleated) && (this.status==START)){
			car_speed=car_speed+s;
		}
		if (car_speed<0) {
			this.speed=0;
		}else {
			this.speed=car_speed;
		}
	}
	
	public String toString() {
		//返回描述车的字符串
		String car_string;
		if (this.speed<=0) {
			car_string="Car is stopping!\n";
			if(this.inSleated) {
				car_string+="Some people in the car.\n";
			}else {
				car_string+="There was no one in the car.\n";
			}
			switch(this.status) {
			case LOCK:
				car_string+="The car's status is LOCK!\n";
				break;
			case ON:
				car_string+="The car's status is ON!\n";
				break;
			case START:
				car_string+="The car's status is START!\n";
				break;
			}
			car_string+="Car's color is "+this.color;
		}else {
			car_string="Car's speed is "+this.speed+"\n";
			car_string+="Car's color is "+this.color;
		}
		return car_string;
	}
	
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void setInSleated(boolean inSleated) {
		this.inSleated=inSleated;
	}
	
	public boolean getInSleated() {
		return this.inSleated;
	}
	
	public void setStatus(int status) {
		this.status=status;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String getColor() {
		return this.color;
	}

}
