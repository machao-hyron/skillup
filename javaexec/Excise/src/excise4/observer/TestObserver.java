package excise4.observer;

import excise4.observer.buyers.ChinaBuyer;
import excise4.observer.buyers.EnglishBuyer;

public class TestObserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarStore store = new CarStore();// 实例化一个汽车销售店
		
		Observer aUser = new ChinaBuyer("张三");// 实例化一个中国买家张三
		aUser.askPriceFromStore(store);
		Observer bUser = new ChinaBuyer("李四");// 实例化一个中国买家李四
		bUser.askPriceFromStore(store);
		Observer cUser = new EnglishBuyer("peter"); // 实例化一个英国买家peter
		cUser.askPriceFromStore(store);
		store.setPrice(100000);// 汽车销售店的价格改变
		System.out.println("======张三离开=====");
		aUser.leaveStore();// 张三不再关注汽车价格
		System.out.println("=======降价======");
		store.setPrice(2000);
	}

}
