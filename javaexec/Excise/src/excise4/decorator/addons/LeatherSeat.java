package excise4.decorator.addons;

import excise4.decorator.Machine;

public class LeatherSeat extends Addon{
	public LeatherSeat(Machine machine) {
		super(machine);
		// TODO Auto-generated constructor stub
		price = 2000f;
		describe = "皮革座椅";
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
