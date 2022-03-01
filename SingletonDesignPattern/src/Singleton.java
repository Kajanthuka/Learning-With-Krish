
//Classical Java implementation

public class Singleton {
	
	private static Singleton obj;
	private Singleton() {}
	
	public static synchronized Singleton getInstance() {
		
		if(obj == null)
			obj =  new Singleton();
		return obj;
	}

}
