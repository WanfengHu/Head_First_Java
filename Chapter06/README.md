# Notes for Chapter 6

* An ArrayList holds objects and not primitives, the compiler will automatically "wrap" a primitive into an object, and place that object in the ArrayList. ("unwrap" when taking out)

* Import full name of a class except those in `java.lang`.

* Non Short Circuit Operators (`&`, `|`):  
When used in boolean expressions, they act like `&&` and `||`, but they force the JVM to always check both side of the expression.

* In Java, `import` doesn't make the class bigger. 