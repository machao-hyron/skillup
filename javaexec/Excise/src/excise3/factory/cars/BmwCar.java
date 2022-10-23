package excise3.factory.cars;

public class BmwCar extends Car{
	private String name;
	public  BmwCar(String name) {
		this.name = name;
	}
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name+"正在行驶");
	}

}
