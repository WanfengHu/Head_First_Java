# Notes for Chapter 7

* **superclass** --> **subclass** (subclass extends superclass); Methods can be overwritten while instance variables are not, because they don't define any special behaviors.   
  
* Instance variables can be *redifined*.

* The most specific version of the method is called for an object reference. i.e. The lowest method on the inheretance tree is called. 

* Four access levels (from most restrictive to least):  
private --> default --> protected --> public
    * `public` members are inherited
    * `private` members are not inherited

* Polymorphism:
    * The reference type can be a superclass of the actual pbject type.
    ```
        Animal myDog = new Dog();
    ```
    * Can have polymorphic arguments and return type.

* Three things that can prevent a class from being subclassed:
    * access control: non-public (`public` not declared for the class). Can only be subclassed by classed in the same package.
    * `final`
    * the class has only `private` constructors. 

* Override:
    * Arguments must be the same, and the return types must be compatible.
    * The method can't be less accessible.

* Overload: (methods with the same name but different argument lists)
    * The return types can be different.
    * Can't change only the return type.
    * Can vary the access levels in any directions.

