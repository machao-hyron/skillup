package excise4.decorator.addons;

import excise4.decorator.Machine;

public abstract class Addon extends Machine {
	private Machine machine;
	
	public Addon(Machine machine) {
		// TODO Auto-generated constructor stub
		this.machine = machine;
	}
	public Machine getMachine(){
		return this.machine;
	}
}
