# Notes for Chapter 18

## RMI

* Methods calls are always between two objects on the same heap (within the same JVM).

* RMI (Remote Method Invocation)

* Making the remote service:
    1. Make a Remote Interface
    2. Make a Remote Implementation
    3. Generate the stubs (client helper) and skeletons (service helper) using rmic on implementation class
    4. Start the RMI registry (rmiregistry)
    5. Start the remote service

* Make a Remote Interface `MyRemote.java`:
    1. Extend `java.rmi.Remote` (a marker interface)
    2. Declare that all methods throw a `RemoteException`
    3. Be sure arguments and return values are primitives or Serializable

* Make a Remote Implementation `MyRemoteImpl.java`:
    1. Implement the Remote interface
    2. Extend `UnicastRemoteObject`
    3. Write a no-arg constructor that declares a RemoteException
    4. Register the service with the RMI registry using the static `rebind()` method of the `java.rmi.Naming` class

* How does the client get the stub object
    1. Client does a lookup on the RMI registry
    2. RMI registry returns the stub object (must have the stub class on the client)
    3. Client invokes a method on the stub, as though the stub is the real service

* Be sure each machine has the class files it needs
    * Client: `Client.class`, `MyRemoteImpl_Stub.class`, `MyRemote.class`
    * Server: `MyRemoteImpl.class`, `MyRemoteImpl_Skel.class`, `MyRemoteImpl_Stub.class`, `MyRemote.class`

## Servlets

* Servlets are Java programs that run entirely on (and with) an HTTP web server.

* Step for making and running a servlet
    1. Find out where your servlets need to be placed
    2. Get the servlets.jar and add it to your classpath
    3. Write a servlet class by extending HttpServlet
    4. Write an HTML page that invokes your servlet
    5. Make your servlet and HTML page available to your server

* EJB (Enterprise JavaBeans): adds a bunch of services that you don't get with staright RMI, such as transactions, security, concurrency, database management and networking.

* An EJB server steps into the middle of an RMI call and layers in all of the services.

* Jini uses RMI, with a few key features including:
    * Adaptive discovery
    * Self-healing networks