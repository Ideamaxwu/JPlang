class NaiveSingleton{
	private static NaiveSingleton instance;
	private NaiveSingleton(){
		System.out.println("NaiveSingleton");
	}
	public static NaiveSingleton getInstance(){
		if(instance == null){
			instance = new NaiveSingleton();
		}else{
			System.out.println("NaiveSingleton Exists");
		}
		return instance;
	} 
}

class EagerSingleton{
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){
		System.out.println("EagerSingleton");
	}
	public static EagerSingleton getInstance(){
		return instance;
	} 
}

class LazySingleton{
	private static LazySingleton instance;
	private LazySingleton(){
		System.out.println("LazySingleton");
	}
	public static synchronized LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}else{
			System.out.println("LazySingleton Exists");
		}
		return instance;
	} 
}

public class ConstructionPattern{
	public static void main(String args[]){
		NaiveSingleton naiveSingleton1 = NaiveSingleton.getInstance();
		NaiveSingleton naiveSingleton2 = NaiveSingleton.getInstance();
		
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
		
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
	}
}

//Utility/Helper Class

//Factory

//Dependency Injection
