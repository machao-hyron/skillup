package excise3;

import excise3.factory.CarSellStore;
import excise3.factory.SimpleFactory;

public class TestExcise3 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		StaticInnerClassSingleton s1 = StaticInnerClassSingleton.getStaticInnerClassSingleton();
//		StaticInnerClassSingleton s2 = StaticInnerClassSingleton.getStaticInnerClassSingleton();
//		System.out.println("第一个实例"+s1.hashCode());
//		System.out.println("第二个实例"+s2.hashCode());
		new CarSellStore(new SimpleFactory()).buyCar();
	}

}
