package itemDetails;

import tax.FinalCost;
import tax.TaxCalculation;

/*
 *Class: Item
 * 
 *Author: @NamrataGaur
 * 
 * Creation Date:03/06/2019
 * 
 * Description: The class stores the details of each item.
 * 
 * */

public class Item {
	private String name;
	private int quantity;
	private double price;
	
	public TaxCalculation taxcal = new TaxCalculation(this);
	public FinalCost finalcost = new FinalCost(this);
	
	public ItemType type = new ItemType();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return this.getName()+" (Price: "+this.getPrice()+", Quantity: "+this.getQuantity()+", Type: "+type.getType()+", Tax: "+taxcal.getTax()+", Final Cost: "+finalcost.getFinalCost()+")";
	}
}
