package tax;

import itemDetails.Item;

/*
 *Class: TaxCalculation
 * 
 *Author: @NamrataGaur
 * 
 * Creation Date:03/06/2019
 * 
 * Description: This class calculates the tax for a given item.
 * 
 * */


public class TaxCalculation {
	
	public Item item;
	private double tax;
	
	public TaxCalculation(Item item){
		this.item = item;
	}
	
	public double rawTax() {
		return 0.125*item.getPrice();
	}
	
	public double manufacturedTax() {
		double rwtax = rawTax();
		return rwtax + 0.02*(item.getPrice()+rwtax);
	}
	
	public double importedTax() {
		double p = item.getPrice();
		double dutyTax = 0.1*p;
		double impPrice = p+dutyTax;
		if(impPrice <= 100) {
			dutyTax += 5;
		}
		else if(impPrice >100 && impPrice <= 200) {
			dutyTax += 10;
		}
		else {
			dutyTax += 0.05*impPrice;
		}
		return dutyTax;
	}
	
	public double getTax() {
		return tax;
	}
	
	public void setTax() {
		if(item.type.getType().equals("Raw")) {
			tax = rawTax();
		}
		else if(item.type.getType().equals("Manufactured")) {
			tax = manufacturedTax();
		} 
		else {
			tax = importedTax();
		}
	}
	
}
