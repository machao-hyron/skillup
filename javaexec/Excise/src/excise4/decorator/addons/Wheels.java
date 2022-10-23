package excise4.decorator.addons;

import excise4.decorator.Machine;

public class Wheels extends Addon{
	public Wheels(Machine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
		price = 4000f;
		describe = "合金轮毂";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return price + super.getMachine().price();
	}
	
	@Override
	public String getDescribe(){
		return describe + "价格"+price+"元+" + super.getMachine().getDescribe();
	};
}
