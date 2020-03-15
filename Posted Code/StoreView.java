

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;

public class StoreView{
	
	String name;
	ArrayList<Customer> customerList;
	Iterator<Customer> iter;
	JFrame frame = new JFrame("My Drawing");
   
	
	public void printStoreDetails(Store store){
		
	    this.name = store.getName();
		System.out.println("\nStore: ");
		System.out.println("Name: " + store.getName());

		// Displaying the customer list
	    // Create an iterator for the list using iterator() method 
        
		customerList = store.getCustomers();
		iter = customerList.iterator();
  
        // Displaying the values after iterating through the list 
		
        System.out.println("\nThe Customer names are:");
        while (iter.hasNext()) { 
            System.out.println(iter.next().getName() + " "); 
        } 
        System.out.println("---------------------------------\n");
        
        Canvas canvas = new Drawing(customerList);
       
        //canvas.setVisible(true);
        canvas.setSize(400, 400);
        frame.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        canvas.repaint();
        
	}
	
	public class Drawing extends Canvas {
		
		ArrayList <Customer> customers;
		Drawing(ArrayList <Customer> customers){
			this.customers = customers;
		}
	    //called whenever canvas is drawn
		@Override
		public void paint(Graphics g){
			//System.out.print("in paint");
			super.paint(g);
			int y = 120;
			g.setColor(Color.black);
			g.fillRect(0, 0, 400, 400);
			
			g.setColor(Color.green);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
			g.drawString("Store:", 150, 50);
			g.drawString("Name: " + name, 150, 70);
			g.drawString("The customer names are: ", 100, 90);
			
			for(int i = 0; i < customers.size(); i++) { 
	            g.drawString("*  " + customers.get(i).getName() + " ", 150, y);
	            y += 20;
	        }
			
		}
	}
	
	


}

