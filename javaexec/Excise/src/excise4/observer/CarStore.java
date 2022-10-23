package excise4.observer;

import java.util.ArrayList;

public class CarStore {
	private float price;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	public void register(Observer observer){
		observers.add(observer);// 注册用户，将用户添加到列表，价格变化后通知列表中的用户
	}
	
	public void remove(Observer observer){
		observers.remove(observer);// 移除观察者
	}
	
	private void notifyAllUsers(){
		observers.stream().forEach((observer)->{
			observer.carPriceChanged();
		});
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		notifyAllUsers();
	}
	
	
}
