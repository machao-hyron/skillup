package excise3.factory.cars;

public class AudiCar extends Car{
	private String name;

	public AudiCar(String name){
		this.name = name;
	}
	@Override
	 public void drive() {
		// TODO Auto-generated method stub
		System.out.println(name+"正在行驶");
	}


}
