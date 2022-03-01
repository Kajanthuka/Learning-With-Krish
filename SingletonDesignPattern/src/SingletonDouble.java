
public class SingletonDouble {
	
	private static volatile SingletonDouble obj = null;
	
	private SingletonDouble() {}
	
	public static SingletonDouble getInstance() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null)
					obj = new SingletonDouble();
				
			}
		}
		return obj;
	}

}
