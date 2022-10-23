package excise4.observer.buyers;

import com.sun.xml.internal.bind.v2.runtime.Name;

import excise4.observer.CarStore;
import excise4.observer.Observer;

public class ChinaBuyer extends Observer {

	private String name;
	public ChinaBuyer(String name) {
		this.name = name;
	}
	
	public void askPriceFromStore(CarStore store){
		// TODO Auto-generated constructor stub
		super.carStore = store;
		super.carStore.register(this);
	}
	
	public void leaveStore(){
		// TODO Auto-generated constructor stub
		if (carStore != null) {
			super.carStore.remove(this);
		}
	}
	@Override
	public void carPriceChanged() {
		// TODO Auto-generated method stub
		System.out.println("中国买家"+name+"说价格变为:"+ carStore.getPrice());
	}

}
