package practice.test;

import practice.Car;

public class CarTest {

	/**
	 * test����
	 */
	public void carTest_1() {
		//��������Car����
		Car car_1 = new Car();
		Car car_2 = new Car();
		Car car_3 = new Car();		

		//����Ϊ����
		car_1.setIsSeated(true);
		//״̬ΪON
		car_1.setStatus(car_1.ON);
		//��ɫΪyellow
		car_1.setColor("yellow");

		//����Ϊ����
		car_2.setIsSeated(true);
		//״̬ΪON
		car_2.setStatus(car_1.START);
		//��ɫ
		car_2.setColor("blue");

		car_3.speedOn(50);
		car_3.speedOn(-30);
		car_3.speedOn(20);
		car_3.toString();
	}
}
