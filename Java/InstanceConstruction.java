//Implicit (Generated) Constructor
class NoConstructor{

}

//Both constructor arguments should be provided
class ConstructorWithArguments{
	ConstructorWithArguments(final String arg1, final String arg2){
		System.out.println("ConstructorWithArguments: " + arg1 + ", " + arg2);
	}
}

//Initialization block might be treated as anonymous no-arg constructor and is always called before any constructor
class InitializationBlockAndConstructor{
	{
		System.out.println("InitializationBlockAndConstructor");
	}
	
	InitializationBlockAndConstructor(){
	
	}
}

public class InstanceConstruction{
	public static void main(String args[]){
		final NoConstructor noConstructor = new NoConstructor();
		final ConstructorWithArguments constructorWithArguments = new ConstructorWithArguments("Hello", "World!");
		final InitializationBlockAndConstructor initializationBlockAndConstructor = new InitializationBlockAndConstructor();
	}
}
