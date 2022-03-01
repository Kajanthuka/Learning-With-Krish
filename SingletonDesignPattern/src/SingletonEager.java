//Static initializer 

public class SingletonEager {

	private static SingletonEager obj =new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstance() {
		return obj;
	}
}
