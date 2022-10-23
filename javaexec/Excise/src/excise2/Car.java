package excise2;

public class Car {
	public static final int LOCK = 0;
	public static final int ON = 1;
	public static final int START = 2;
	
	private int speed = 0;
	private boolean isSeated = false;
	private int status = LOCK;
	private String color = "black";
	
	public Car(){
		
	}
	public void speedOn(int speedChange){
		if(status == START  && isSeated ){
			if (speed +speedChange>=0) {
				speed+=speedChange;
			}
		}
		
	}

	@Override
	public String toString(){
		if (speed>0) {
			return "速度:"+speed+"颜色:"+color;
		}else if (speed==0) {
			return "car is stopping..."+ (isSeated?"车里有人":"车里没人")+"车子状态："+status+"颜色"+color;
		}
		return color;
		
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isSeated() {
		return isSeated;
	}

	public void setSeated(boolean isSeated) {
		this.isSeated = isSeated;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
