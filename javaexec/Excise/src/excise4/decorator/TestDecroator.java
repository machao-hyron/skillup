package excise4.decorator;

import com.sun.glass.events.WheelEvent;

import excise4.decorator.addons.CarCover;
import excise4.decorator.addons.LeatherSeat;
import excise4.decorator.addons.Wheels;
import excise4.decorator.cars.AudiCar;

public class TestDecroator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine car = new AudiCar();// 实例化一辆奥迪车
		
		Machine carCover = new CarCover(car);// 为汽车贴膜
		
		System.out.println(carCover.getDescribe());
		System.out.println("总价："+carCover.price());// 贴膜后的价格
		
		Machine seat = new LeatherSeat(carCover);// 为汽车添加真皮座椅
		
		System.out.println(seat.getDescribe());
		System.out.println("总价："+seat.price());// 添加真皮后的价格
		
		Machine seat2 = new LeatherSeat(seat);// 为汽车添加第二张真皮座椅
		
		System.out.println(seat2.getDescribe());
		System.out.println("总价："+seat2.price());// 添加第二张真皮座椅后的价格
		
        Machine wheel = new Wheels(seat2);// 为汽车添加合金轮毂
		
		System.out.println(wheel.getDescribe());
		System.out.println("总价："+wheel.price());// 添加合金轮毂后的价格
	}

}
