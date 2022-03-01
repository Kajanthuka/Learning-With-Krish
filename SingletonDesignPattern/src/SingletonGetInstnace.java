
// Thread synchronized java implementation 

public class SingletonGetInstnace {
	
	private static SingletonGetInstnace obj;
	
	private SingletonGetInstnace() {}
	
	public static synchronized SingletonGetInstnace  getInstance() {
		if (obj == null)
			obj = new SingletonGetInstnace();
		return obj;
		
		
		
	}

}
