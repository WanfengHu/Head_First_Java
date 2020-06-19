# Notes for Chapter 10

* Math class doesn't have any instance variables.

* The constructor of Math class is private.

* `static` lets a method run without any instance of the class --> behavior not dependent on an instance variable.

* Static methods can't use non-static (instance) variables nor methods.

* Static variable
    * *Shared* by the class, i.e. one value per class not instance.
    * Initialized before any object of the class can be created.
    * Initialized before any static method of the class runs.

* Constants are marked `static final`, should be in all caps.
    * Initialized at the time of declaration or in a static initializer.
    ```java
        class Foo {
            public static final int x;
            static {
                x = 42;
            }
        }
    ```

* `final` means that once initialized, it can never change.
    * A final variable means its value can't be changed. Assigned at the time of declaration or in the constructor.
    * A final method means it can't be overridden.
    * A final class means it can't be extended.

* Math methods:
    random, abs, round, min, max, sqrt, tan, ceil, floor, asin ...

* Wrapper for primitive type: first letter capitalized (Byte, Short Boolean, Integer, ...)
    ```java
    Integer iWrap = new Integer(i) // wrap
    int unWrapped = iWrap.intValue(i) // unwrap
    ```

* Autoboxing feature (added to Java 5.0) does the conversion from primitive to wrapper object automatically.

* Number formatting: `String.format()`
    * Adding comma: `%,d`, `%,.2f` ...
    * `%[argument number][falgs][width][.precision]type`
        * argument number: decides which argument
        * flags: commas, negative number in (), left justified ...
        * width: minimum number of characters, padded with zeros if the number is less than width.

* Dates formatting
    * starts with "t" : `%tc`, `%tA`, ...
    * `<`: use the previous argument again.
    ```java
        Date today = new Date();
        String.format("%tA, %<tB %<td", today); // e.g. Sunday, November 28
    ```

* `java.util.Date` --> for getting a time stamp

* `java.util.Calendar` --> for date manipulation

* Static imports