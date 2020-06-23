# Notes for Chapter 16 

* Some of the key collection classes:
    * **ArrayList** 
    * **TreeSet**: keeps the elements sorted and prevents duplicates.
    * **HashMap**: Store and access elements as name/value pairs
    * **LinkedList**: Better performance when inserting and deleting elements from the middle of the collection.
    * **HashSet**: Prevents duplicates, and given an element, can find that element in the collection quickly.
    * **LinkedHashMap**: Like a reguler HashMap, except it can remember the order in which elements were inserted, or the order in which elements were last accessed.

* `Collections.sort()`: sort a List.

* `<>`: generics

* Generics means more type-safety.

* Virtually the only type of classed that really need to be generic are collection classes.

* In generics, "extends" means "extends or implements"/"is-a".

* Invoking `sort(List o)`: the elements in the list must implement `Comparable` interface (`compareTo()` method will be called.)

* Invoking `sort(List o, Comparator c)`: Comparator's `compare()` will be called, the elements do not need to implement Comparable.

* Three main interfaces in Collection API:
    * **List**: when sequence matters
    * **Set**: when uniqueness matters
    * **Map**: when finding something by key matters. A key can be any object. Does't extend from java.util.Collection, but still considered to be part of the "collections framework".

* Reference equality: two references that refer to the same object on the heap are equal.

* Object equality: two references, two objects, but the objects are considered meaningfully equivalent. Override `hashCode()` and `equals()` methods.

* **HashSet**: if `hashCode()` are the same, check `equals()`

* **TreeSet** elements **must** be comparable or use the TreeSet's overloaded constructor that takes a Comparator.

* If you declare a method to take `ArrayList<Animal>` it can take **ONLY** an `ArrayList<Animal>`, not `ArrayList<Dog>` or `ArrayList<Cat>`.

* Array types are checked again at runtime, but collection type checks happen only when you compile.

* Generic wildcards `<?>`: a method argument can accept an ArrayList of any subtype of the type parameter. Again, 'extends' means extends or implements.
```java
    public void takeAnimals(ArrayList<? extends Animal> animals) {
        for (Animal a: animals) {
            a.eat();
        }
    }

    // OR
    public <T extends Animal> void takeAnimals(ArrayList<T> animals)
```

* When wildcard `<?>` is used, the compiler won't let you do anything that adds to the list.
