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
