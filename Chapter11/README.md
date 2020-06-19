# Notes for Chapter 11

*  `throw/throws`: A method is risky, can throw exception.

* An exception is an object of type `Exception`, which extends `Throwable` class.

* An exception must be declared in a code that could throw an exception.

```java
    // Risky, exception-throwing code
    public void takeRisk() throws BadException {
        if (abandonAllHope) {
            throw new BadException();
        }
    }

    // Code that calls the risky method
    public void crossFingers() {
        try {
            anObject.takeRisk();
        } catch (BadException ex) {
            System.out.println("Aaargh!")
            ex.printStackTrace();
        }    
    } 
```

* The compiler checks for everything except RuntimeExceptions.
    * An exception with `throw` must be declares.
    * When a risky method is called, you must acknowledge the exception possibility. (e.g. `try/catch`)

* A RuntimeException does not have to be declared or wrapped in a try/catch.

* `finally`: code that must run regardless of an exception.  
If the try or catch block has a `return` statement, `finally` will still run. First finally, then back to return.

* A method can throw multiple exceptions. All of them must be declared or the common superclass.

* All checked exceptions thrown by the called method must be handled. Multiple catch blocks must be ordered from smallest to biggest.

* You can duck an exception by declaring it.

* `main()` should not duck an exception or JVM shuts down.

* A `try` with only a `finally` must still declare the exception.