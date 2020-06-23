# Notes for Chapter 17

## JAR, package and deployment

* Deployment options
    * Local: deployed as an executable JAR (Java ARchive).
    * Combination of local and remote: Java Web Start
    * Remote: RMI, Servelets

* Seperate source code and class files.
    - Project directory
        - source
        - classes
    * use `javac -d` to compile.

* JAR file: all classes in one file.
    * JAR executable: end-user doesn't have to pull the class files out.
    * **manifest** file: holds information about the files in the JAR. Must tell the JVM which class has the main() method. `Main-Class: fully-qualified.classname`
    * Be sure to hit the return key, or it may not work.
    * Making an executable jar: `jar -cvmf manifest.txt app1.jar MyApp.class`
    * Running the JAR: `java -jar app1.jar` or double click.

* Packages prevent class name conflicts (fullly-qualified name).

* Preface the packages with a reserved domain name. `com.headfirstjava.projects.Chart`

* Package statement must be the first statement and there can be only one package statement per source code file.

* Run the code: the fully-qualified class name must be given.

* Making an executable JAR with packages: the package directorey structure must be inside the JAR. Don't include any other directories above the package.

* jar commands for listing and extracting:
    * List the contents of a JAR: `jar -tf app.jar`
    * Extract the contents of a JAR: `jar -xf app.jar`

* The end-user must have Java installed for a JAR to run.

## Java Web Start (JWS)

* An executable JAR that's distributed over the Web.

* How it works:
    1. The clients clicks on a Web page link to the JWS application (a `.jnlp` file).
    2. The Web server gets the request and sends back a `.jnlp` file that states the name of the application's executable JAR file.
    3. Java Web Start (a small 'helper app' on the client) is started up by the browser. The JWS helper app reads the `.jnlp` file and asks the server for the JAR file.
    4. The Web server 'serves' up the requested JAR file.
    5. JWS gets the JAR and starts the application. Next time, the user can launch this app from the JWS without being online.

* `.jnlp`: Java Network Launch Protocol. A XML documet.