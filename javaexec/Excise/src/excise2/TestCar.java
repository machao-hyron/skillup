package excise2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setSeated(true);
		car1.setStatus(Car.ON);
		car1.setColor("yellow");
		car1.speedOn(50);
		System.out.println(car1);
		car1.speedOn(-30);
		System.out.println(car1);
		car1.speedOn(20);
		System.out.println(car1);
		
		Car car2 = new Car();
		car2.setSeated(true);
		car2.setStatus(Car.START);
		car2.setColor("blue");
		car2.speedOn(50);
		System.out.println(car2);
		car2.speedOn(-30);
		System.out.println(car2);
		car2.speedOn(20);
		System.out.println(car2);
		
		
		Car car3 = new Car();
		car3.speedOn(50);
		System.out.println(car3);
		car3.speedOn(-30);
		System.out.println(car3);
		car3.speedOn(20);
		System.out.println(car3);
	}

}
