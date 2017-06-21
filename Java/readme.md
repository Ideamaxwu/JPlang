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
