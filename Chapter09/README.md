# Notes for Chapter 9

## Stack and Heap
* Java has two areas of memory (we care about):
    * Stack
    * Heap

* Instance variables
    * Declared inside a class but not inside a method.
    * Live on the heap, inside the object

* Local variables
    * Declared inside a method, including method parameters (primitive, object references).
    * Live on the stack, thus also called stack variables.

* Methods are stacked - stack frame

* Object always goes on the heap

---

## Constructor
* Runs when instantiate an object

* Invoke with `use` -- only way to do it from outside a constructor

* Must have the same name as the class and cannot have a return type
```
    public class Duck {
        public Duck() {...}
    }
```

* Not inherited

* Can be overloaded (different order/type of arguments)

* The compiler makes a no-arg constructor only if no constructor is provides

* Constructor for superclass -- `super(args)`
    * Supplied by compiler if not provided.
    * The superclass constructor must finish before its subclass constructor
    * `super(args)` must be the first statement in each constructor
        * Exception: `this()`. Call a constructor from another loaded constructor in the same class. Can only be used in a constructor and must be the first statement. 

* A constructor can have a call to `super()` **OR** `this()`, but never both.

---

## Object Lifespan
* Depends entirely on the life of references referring to it

* Local variable
    * A local variable is alive as long as its Stack frame is on the Stack (i.e. until the method completes)
    * Can be used only when it is in scope