# Notes for Chapter 8

* Abstract class:
    * Can't be instantiated (`new`)
    * Mark as `abstract`
    * Can be used as a polymorphic argument or return type, or to make a polymorphic array
    * Can have abstract and non-abstract methods

* Abstract method:
    * Has no body -- end the declaration with a semicolon
    * Must be overridden
    * Can't be in a non-abstract class

* Any class that doesn't explicitly extend another class, implicitly extends `Object`

* Java doesn't allow multiple inheritance

* Interface: 100% pure abstract class. 
    * To define: use `interface` instead of `class`
    * To implement: `implements`
    ```
        public class Dog extends Canine implements Pet {...}
    ```
    * A class can implement multiple interfaces
    * All interface methods are implicitly public and abstract

* To invoke the superclass version of a method, use `super`