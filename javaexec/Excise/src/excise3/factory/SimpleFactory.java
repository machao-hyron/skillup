package excise3.factory;

import excise3.factory.cars.AudiCar;
import excise3.factory.cars.BenzCar;
import excise3.factory.cars.BmwCar;
import excise3.factory.cars.Car;



public class SimpleFactory {
		public Car createCar(String name){
			Car car = null;
			if ("奥迪".equals(name)) {
				car = new AudiCar("奥迪");
				System.out.println("工厂创建奥迪车");
			}else if("奔驰".equals(name)) {
				car = new BenzCar("奔驰");
				System.out.println("工厂创建奔驰车");
			}else if ("宝马".equals(name)) {
				car = new BmwCar("宝马");
				System.out.println("工厂创建宝马车");
			}else {
				System.out.println("没有这辆车");
			}
			 return car;
		}
}
