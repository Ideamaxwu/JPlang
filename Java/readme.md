## How to create and destroy objects
  - Instance Construction
    - Implicit (Generated) Constructor
    - Initialization Blocks
      ```{ }```
    - Visibility/Accessbility
    - Garbage Collection
  - Static Initialization
  - Construction Patterns
    - Singleton
    - Utility/Helper Class
    - Factory
    - Dependency Injection
    
## Using methods common to all objects
  - equals, ==, hashCode, toString, clone
  
## How to design Classes and Interfaces
  - Interfaces
    - contract-driven development
    - every declaration in the interface is ```public``` (and can be only public)
    - every single method in the interface is implicitly declared as ```abstract```
    - e.g., ```public abstract void performAction(); public void performAction(); void performAction();```
    - constant field declarations are implicitly ```static``` and ```final``` additionally to being ```public```
    - e.g., ```String CONSTANT = "CONSTANT"; public static final String CONSTANT = "CONSTANT";```
  - Marker Interfaces
    - a special kind of interfaces which have no methods or other nested constructs defined
    - Cloneable, Serializable
  - Functional interfaces, default and static methods
    - functional interface is the interface with just a single abstract method declared in it
    - Runnable
  - Abstract classes
    - abstract classes cannot be instantiated but could be subclassed
  - Immutable classes
    - ```final```
  - Anonymous classes
    - ```new Thread(new Runnable(){ }).start();```
  - Multiple inheritance
    - Java does not support multiple inheritance but may implement multiple interfaces
  - Composition and Encapsulation
  - Final classes and methods
    - prevent the class to be subclassed by any other class
    
## How and when to use Generics
  - Generics and interfaces: ```public interface GenericInterfaceOneType<T>{void performAction(final T action);}```
  - Generics and classes
  - Generics and methods
  - Limitation of generics
    - 1) primitive types (e.g., ```int```, ```long```, ```byte```) are not allowed to be used in generics, and the respective class wrapper (e.g., ```Integer```, ```Long```, ```Byte```) has to be used instead; 
    - 2) another one, more obscure, is type erasure; 
    - 3) t is also not possible to create the array instances using generics;
    - 4) implicit boxing and unboxing for primitive types.
  - Generics, wildcards and bounded types
    - bounded types: ```public <T, J extends T> void action(final T initial, final J next){ }```
    - wildcards: ```public void store(final Collection<?> objects) { }```
  - Generics and type inference
  - Generics and annotations
    - ```public <@Actionable T> void performAction(final T action){ }```
  - Accessing generic type parameters
  - When to use generics
