package excise3.factory;

import java.util.Scanner;

import excise3.factory.cars.Car;


public class CarSellStore {
	
	private SimpleFactory carFactory;
	private Car myCar ;
	public CarSellStore(SimpleFactory simpleFactory){
		this.carFactory = simpleFactory;
	}
	
	public void buyCar(){
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while (!"exit".equals(input)){
			System.out.println("请输入想要买的车：");
			input = scanner.nextLine();
			myCar = carFactory.createCar(input);
			if (myCar == null) {
				System.out.println("请重新输入");
				continue;
			}
			myCar.drive();
		}
	}
	
	
	
}
