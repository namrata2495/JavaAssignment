package itemDetails;

/*
 *Class: ItemType
 * 
 *Author: @NamrataGaur
 * 
 * Creation Date:03/06/2019
 * 
 * Description: This class stores the type of item.
 * 
 * */


public class ItemType {
	
	private String type;
	
	public String getType() {
		return type;
	}
	
	public boolean setType(String type) {
		if(type.equalsIgnoreCase("Raw") || type.equalsIgnoreCase("manufactured") || type.equalsIgnoreCase("Import")) {
			this.type = type;
			return true;
		}
		else return false;
	}
}
