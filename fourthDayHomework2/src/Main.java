import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		BaseCustomerManager customerManager=new  StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Beyza","ATAR",1998,"12345678912"));
	}

}
