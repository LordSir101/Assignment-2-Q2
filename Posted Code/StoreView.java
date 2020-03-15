

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class StoreView{
	
	
	public void printStoreDetails(Store store){
		ArrayList<Customer> customerList;
		
		System.out.println("\nStore: ");
		System.out.println("Name: " + store.getName());

		// Displaying the customer list
	    // Create an iterator for the list using iterator() method 
        
		customerList = store.getCustomers();
		Iterator<Customer> iter = customerList.iterator();
  
        // Displaying the values after iterating through the list 
		
        System.out.println("\nThe Customer names are:");
        while (iter.hasNext()) { 
            System.out.println(iter.next().getName() + " "); 
        } 
        System.out.println("---------------------------------\n");
	}


}

