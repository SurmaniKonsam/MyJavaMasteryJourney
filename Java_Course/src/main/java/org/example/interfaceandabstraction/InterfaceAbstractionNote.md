## Interface Vs Abstraction


### Java Abstraction — Master Notes
```textmate
An abstract class may contain:
-> Abstract methods (unimplemented method declarations).
-> Concrete methods (implemented methods).
-> Instance variables and constructors.
-> An abstract method must be within an abstract class, but an abstract class as 
discussed may or may not contain an abstract method.

-> An abstract child extending an abstract parent may leave inherited abstract methods unimplemented, provided the child also remains abstract.

-> A class can be concrete when all inherited abstract method contracts have been implemented.

-> Concrete methods implemented in an abstract parent or intermediate abstract child are inherited by subsequent child classes through inheritance.

-> An abstract class cannot be directly instantiated.

-> A concrete class can be instantiated using the new keyword.

-> A concrete subclass must ful-fill all inherited abstract method contracts, either through its own implementations or inherited concrete implementations.

```