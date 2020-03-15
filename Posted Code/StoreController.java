import java.util.Observable;

public class StoreController  extends Observable{
	private Store model;
	private StoreView view;

	public StoreController(Store model, StoreView view){
		this.model = model;
		this.view = view;
	}

	public void addCustomer(Customer name){
		model.addCustomer(name);
		notifyObservers();
	}
}
