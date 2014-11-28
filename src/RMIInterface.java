/**
 * Created by eikood on 21.11.14.
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {

    public void helloWorld(int i) throws RemoteException;

}