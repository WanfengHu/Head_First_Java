# Notes for Chapter 14 

## Object Serialization

* Saving objects:
    * If the saved data will be used only by the Java program that generated it: Use **serialization**.
    * Will be used by other programs: Write a plain text file.
    * ...

* Writing a serialized object to a file:
    1. Make a `FileOutputStream`
    2. Make an `ObjectOutputStream`
    3. Write the object
    4. Close the ObjectOutputStream

* Java I/O API
    * Connection streams: connections to destinations and sources (files, network sockets, console, ...)
    * Chain streams

* Implemet `Serializable` to enable serialization of a class.

* Serialization is all or nothing. The entire object graph must be serializable and seriablized correctly.

* Mark an instance variable as `transient` if it can't/shouldn't be saved.

* Things like network connections, threads, and file objects can't be saved. They depend on a particular runtime.

* **Deserialization**
    1. Make a `FileOutputStream`
    2. Make an `ObjectOutputStream`
    3. Read the object
    4. Cast the objects
    5. Close the ObjectOutputStream

* Static variabls are not saved. When an object is deserialized, it will have whatever static variable its class currently has.

* Class Version matters!

* Changes to a class that can hurt deserialization:
    * Deleting an instance variable
    * Changing the type of an instance variable
    * Changing a non-transient to transient
    * Moving a class up or down the inheritance hierarchy
    * Changing a class from Serializable to not Serializable
    * Changing an instance variable to static

## File I/O

* Write a String: `FileWriter`

* `java.io.File` represents a file on disk (pathname).

* Buffer
    * Only when the buffer is full, the contents will actually be written to a file.
    * More efficient.

* `flush()`: sends the data in the buffer right away.