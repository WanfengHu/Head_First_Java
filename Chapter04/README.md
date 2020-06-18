# Notes for Chapter 4

* Java is pass-by-value --> pass-by-copy.

* Can return anything that can be implicitly promoted to the declared type or explicitly cast to a smaller type.

* Mark instance variables `private` and mark getters and setters `public`.

* Encapsulation: can change later without breaking anybody else's code.

* Default value for instance variables:  
    | type | default value |
    | :----: | :----: |
    | integers | 0 |
    | floating points | 0.0 |
    | booleans | false |
    | references | null |

* Local variables must be initialized before use.

* To compare two primitives, use `==`. (extra zeros on the left end don't matter)
```
    int a = 3;
    byte b = 3;
    a == b // true
```

* To see if two references are the same, use `==`.

* To see if two different objects are equal, use `equals()`, e.g. `"Fred"(String)`