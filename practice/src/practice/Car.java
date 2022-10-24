package practice;

public class Car {
	/* 关闭全部电源 */
	public static final int LOCK = 0;
	/* 打开全部电源 */
	public static final int ON = 1;
	/* 启动发动机 */ 
	public static final int START = 2;

	/* 车的速度 */
	private int speed;
	/* 车内是否有人 ，默认false无人*/
	private boolean isSeated = false;
	/* 车的状态，默认LOCK */
	private int status = LOCK;
	/* 车的颜色，默认black */
	String color = "black";

	public String toString() {
		if (this.speed > 0) {
			return this.speed + this.color;
		}else {
			String msg = "car is stopping";
			
			//判断车里是否有人，并返回msg
			if (this.isSeated == true) {
				msg = msg.concat("， 车内有人");
			}else {
				msg = msg.concat("， 车内没人");
			}

			//判断车的启动状态并返回信息
			switch (this.status) {
			case LOCK:
				msg = msg.concat("， 车内电源全部关闭状态");
				break;
			case ON:
				msg = msg.concat("， 车内电源全部开启状态");
				break;
			case START:
				msg = msg.concat("， 车内发动机为启动状态");
				break;
			default:
				break;
			}

			//车的颜色
			msg = msg.concat(this.color);
			
			return msg;
		}
	}

	/**
	 * 在满足车内有人，且车的状态为start时，改变车速
	 * @param speedAdd
	 */
	public void speedOn(int speedAdd) {
		//满足条件
		if (this.getIsSeated() == true && this.getStatus() == 2) {
			this.speed = this.speed + speedAdd;
			//车速不为负数，若为负，设为0
			if (this.speed < 0) {
				this.speed = 0;
			}
		//不满足条件，不作任何处理
		}else {
			
		}
	}

	/**
	 * 默认车的无参构造函数
	 */
	public Car() {
		
	}

	/**
	 * 获取车速
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * 设置车速
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * 获取车内是否有人
	 * @return
	 */
	public boolean getIsSeated() {
		return isSeated;
	}
	/**
	 * 设置车内是否有人
	 * @param isSeated
	 */
	public void setIsSeated(boolean isSeated) {
		this.isSeated = isSeated;
	}
	/**
	 * 获取车的状态
	 * @return
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * 设置车的状态
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * 获取车的颜色
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 设置车的颜色
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	

}
