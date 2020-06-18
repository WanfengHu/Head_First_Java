# Notes for Chapter 3

* Java cares about type (strongly-typed, type-safety)

* Java variables:
    * Primitive: integers, booleans, floats, char
    * Object references: pointer/address to an object (maps, trees, sets, arrays)

* Floating point numbers:  
`1.2f`, 'f' -> float (32 bits), otherwise double

* Small type variable can be assigned to a larger type variable, not vice versa

* Name: letter, underscore(`_`), dollar sign(`$`) or number.
    * It cannot be started with a number
    * It cannot be a Java reserved word

* Objects live in one place and one place only - the garbage collectible heap.

* A primitive variable -- bits representing the actual value.

* Object reference -- bits representing a way to get to the object.  
All references for a given JVM have the same size regardless of the objects they reference.

* `null` is a value.