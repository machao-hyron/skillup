package excise4.decorator.cars;

import excise4.decorator.Machine;

public class AudiCar extends Machine{
	
	public AudiCar() {
		// TODO Auto-generated constructor stub
		describe = "奥迪车";
		price = 150000.0f;
	}
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return price;
	}


}
