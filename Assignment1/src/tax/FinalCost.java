package tax;

import itemDetails.Item;

/*
 *Class: FinalCost
 * 
 *Author: @NamrataGaur
 * 
 * Creation Date:03/06/2019
 * 
 * Description: This class calculates the final cost of the given item after applying tax on the item.
 * 
 * */


public class FinalCost {
	
	private double finalCost;
	public Item item;
	
	public FinalCost(Item item) {
		this.item = item;
	}
	
	public double getFinalCost() {
		//finalCost = (item.getPrice()+item.taxcal.getTax())*item.getQuantity();
		return finalCost;
	}
	public void setFinalCost() {
		finalCost = (item.getPrice()+item.taxcal.getTax())*item.getQuantity();
	}
}
