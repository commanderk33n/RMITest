import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by eikood on 25.11.14.
 */
public class RMIServer extends UnicastRemoteObject implements RMIInterface{
    public RMIServer() throws RemoteException {
        super();
    }

    public void helloWorld(int i) throws RemoteException{
        for(int j = 0; j < i;j++){
            System.out.println("hello world");
        }
    }

    public static void main(String[] args){
        try {


            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Naming.rebind("RMITest", new RMIServer());
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
    }


}
