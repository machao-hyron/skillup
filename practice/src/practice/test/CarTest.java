package practice.test;

import practice.Car;

public class CarTest {

	/**
	 * test方法
	 */
	public void carTest_1() {
		//创建三个Car对象
		Car car_1 = new Car();
		Car car_2 = new Car();
		Car car_3 = new Car();		

		//设置为有人
		car_1.setIsSeated(true);
		//状态为ON
		car_1.setStatus(car_1.ON);
		//颜色为yellow
		car_1.setColor("yellow");

		//设置为有人
		car_2.setIsSeated(true);
		//状态为ON
		car_2.setStatus(car_1.START);
		//颜色
		car_2.setColor("blue");

		car_3.speedOn(50);
		car_3.speedOn(-30);
		car_3.speedOn(20);
		car_3.toString();
	}
}
