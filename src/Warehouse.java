import java.rmi.*;
import java.util.*;

public interface Warehouse {
	double getPrice(String description) throws RemoteException;
}
