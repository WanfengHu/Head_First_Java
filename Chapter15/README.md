# Notes for Chapter 15 

## Networking

* Client and server communicates over a Socket connection.

* To make a Socket connection, you need to know IP address and TCP port number.

* TCP port is a 16-bit number (0-65535), that identifies a specific program on the server.

* TCP port 0-1023 are reserved for well-known services.
    | Service | FTP | Telnet | SMTP | Time | HTTPS | POP3 | HTTP |
    | :---: | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
    | **Port** | 20 | 23 | 25 | 37 | 443 | 110 | 80 |

* Read data from a Socket: `BufferedReader`.

* Write data to a Socket: `PrintWriter`.

## Multithreading

* Every thread inn Java has its won call stack.

* To launch a new thread:
    * Make a `Runnable` object (the thread's job).
    * Make a `Thread` object and give it a Runnalbe.
    * Start the Thread. 

* Three states of a new thread: New --> Runnable --> Running

* Only JVM thread scheduler can choose the currently running thread. 

* Once the thread becomes runnable, it can move back and forth between runnable, running and an additional state: blocked (temporarily not runnable).

* A sleeping thread (`sleep`) will not become the currently-running thread. 

* Once a thread's run() method has completed, the thread can never be restarted.

* Threads can lead to concurrency issues. -- Two or more threads have access to a single object's data.

* `synchronized` keyword means a thread needs a key to access the synchronized code. Declared to a method.

* Every object has a lock. The locks are not per method, but per object.

* Synchronized methods can lead to deadlock.

* Thread deadlock happens when two threads are holding a key the other thread wants.

* Java has no mechanism to handle deadlock.

* Each loaded class has a lock.
---

* Singleton: can be created by private constructor + static getter method.
```java
    class Accum {
        private static Accum a = new Accum();

        private Accum() {}

        public static Accum getAccum() {
            return a;
        }
    }
```