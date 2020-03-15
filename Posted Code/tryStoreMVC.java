
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;



public class tryStoreMVC{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Store myStore = new Store ("Sears");
		StoreView myStoreView = new StoreView();
		
		StoreController myStoreController = new StoreController(myStore, myStoreView);
		Customer aCustomer;
		
		//sets controller as an observer for store
		myStore.addObserver(myStoreController);
		
		System.out.println("Enter customer names for store " + myStore.getName());

		while (input.hasNextLine()) {
			aCustomer = new Customer(input.nextLine());
			myStoreController.addCustomer(aCustomer);
		}
	}
	

}
