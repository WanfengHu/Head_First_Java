package Chapter18;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote  {
    @Override
    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public MyRemoteImpl() throws RemoteException {}

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Naming.rebind("Remote_Hello", service);
        } catch (Exception ex) {ex.printStackTrace();}
    }
}