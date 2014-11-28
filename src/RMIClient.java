import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
/**
 * Created by eikood on 21.11.14.
 */
public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
     //   System.setProperty("java.security.policy", "client.policy");
     //   if(System.getSecurityManager() == null) System.setSecurityManager(new RMISecurityManager());
        try {
            RMIInterface serverObject = (RMIInterface) Naming.lookup("//localhost/RMITest");
            serverObject.helloWorld(10);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}