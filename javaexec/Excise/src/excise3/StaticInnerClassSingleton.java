package excise3;

public class StaticInnerClassSingleton {
	
	
	private StaticInnerClassSingleton(){}
	
	public static class InnerSingleton{
		private static StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getStaticInnerClassSingleton(){
		
		return InnerSingleton.singleton;
		
	}
}
