package excise4.decorator;

public abstract class Machine {
	protected String describe = "";
	protected float price = 0.0f;
	public abstract float price();
	public String getDescribe(){
		return describe + "˜ÁŠi"+price+"Œ³";
	};
}
