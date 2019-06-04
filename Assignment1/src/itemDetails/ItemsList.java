package itemDetails;

import java.util.ArrayList;

/*
 *Class: ItemList
 * 
 *Author: @NamrataGaur
 * 
 * Creation Date:03/06/2019
 * 
 * Description: This class contains the list of all items.
 * 
 * */


public class ItemsList {
	
	private ArrayList<Item> items;
	
	public ItemsList() {
		items = new ArrayList<>();
	}
	
	//method for getting the list of items.
	public ArrayList<Item> getItems(){
		return items;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	//method for getting an item at an index in the given list.
	public Item getItem(int i) {
		return items.get(i);
	}
	
	//method for getting the size of the list.
	public int listSize() {
		return items.size(); 
	}
}
