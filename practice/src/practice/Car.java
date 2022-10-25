package practice;

public class Car {
	/* �ر�ȫ����Դ */
	public static final int LOCK = 0;
	/* ��ȫ����Դ */
	public static final int ON = 1;
	/* ���������� */ 
	public static final int START = 2;

	/* �����ٶ� */
	private int speed;
	/* �����Ƿ����� ��Ĭ��false����*/
	private boolean isSeated = false;
	/* ����״̬��Ĭ��LOCK */
	private int status = LOCK;
	/* ������ɫ��Ĭ��black */
	String color = "black";

	public String toString() {
		if (this.speed > 0) {
			return this.speed + this.color;
		}else {
			String msg = "car is stopping";
			
			//�жϳ����Ƿ����ˣ�������msg
			if (this.isSeated == true) {
				msg = msg.concat("�� ��������");
			}else {
				msg = msg.concat("�� ����û��");
			}

			//�жϳ�������״̬��������Ϣ
			switch (this.status) {
			case LOCK:
				msg = msg.concat("�� ���ڵ�Դȫ���ر�״̬");
				break;
			case ON:
				msg = msg.concat("�� ���ڵ�Դȫ������״̬");
				break;
			case START:
				msg = msg.concat("�� ���ڷ�����Ϊ����״̬");
				break;
			default:
				break;
			}

			//������ɫ
			msg = msg.concat(this.color);
			
			return msg;
		}
	}

	/**
	 * �����㳵�����ˣ��ҳ���״̬Ϊstartʱ���ı䳵��
	 * @param speedAdd
	 */
	public void speedOn(int speedAdd) {
		//��������
		if (this.getIsSeated() == true && this.getStatus() == 2) {
			this.speed = this.speed + speedAdd;
			//���ٲ�Ϊ��������Ϊ������Ϊ0
			if (this.speed < 0) {
				this.speed = 0;
			}
		//�����������������κδ���
		}else {
			
		}
	}

	/**
	 * Ĭ�ϳ����޲ι��캯��
	 */
	public Car() {
		
	}

	/**
	 * ��ȡ����
	 * @return
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * ���ó���
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * ��ȡ�����Ƿ�����
	 * @return
	 */
	public boolean getIsSeated() {
		return isSeated;
	}
	/**
	 * ���ó����Ƿ�����
	 * @param isSeated
	 */
	public void setIsSeated(boolean isSeated) {
		this.isSeated = isSeated;
	}
	/**
	 * ��ȡ����״̬
	 * @return
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * ���ó���״̬
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * ��ȡ������ɫ
	 * @return
	 */
	public String getColor() {
		return color;
	}
	/**
	 * ���ó�����ɫ
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	

}
