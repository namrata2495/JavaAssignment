package itemDetails;

import tax.FinalCost;
import tax.TaxCalculation;
import junit.framework.TestCase;

public class ItemTest extends TestCase {

	public void testSetName() {
		Item i1 = new Item();
		i1.setName("Notebook");
		assertEquals("Notebook",i1.getName());
	}
	
	public void testSetQuantity() {
		Item i1 = new Item();
		i1.setQuantity(12);
		assertEquals(12,i1.getQuantity());
	}
	
	public void testSetPrice() {
		Item i1 = new Item();
		i1.setPrice(12.9);
		assertEquals(12.9,i1.getPrice());
	}
	
	public void testSetType() {
		ItemType it = new ItemType();
		it.setType("Manufactured");
		assertEquals("Manufactured",it.getType());
	}
	
	public void testTaxCalcualtion() {
		Item i1 = new Item();
		i1.setName("Mango");
		i1.setQuantity(11);
		i1.setPrice(221.67);
		i1.type.setType("Raw");
		TaxCalculation tc = new TaxCalculation(i1);
		assertEquals("Mango",tc.item.getName());
		assertEquals(11,tc.item.getQuantity());
		assertEquals(221.67,tc.item.getPrice());
		assertEquals("Raw",tc.item.type.getType());
	}
	
	public void testRawTax() {
		Item i1 = new Item();
		i1.setPrice(12.5);
		TaxCalculation tx = new TaxCalculation(i1);
		assertEquals(1.5625,tx.rawTax());
	}
	
	public void testManufacturedTax() {
		Item i1 = new Item();
		i1.setPrice(12.5);
		TaxCalculation tx = new TaxCalculation(i1);
		assertEquals(1.84375,tx.manufacturedTax());
	}
	
	public void testImportTax() {
		Item i1 = new Item();
		i1.setPrice(129.82);
		TaxCalculation tx = new TaxCalculation(i1);
		assertEquals(22.982,tx.importedTax());
	}
	
	public void testSetTax() {
		Item i1 = new Item();
		i1.setPrice(129.82);
		i1.type.setType("Import");
		TaxCalculation tx = new TaxCalculation(i1);
		tx.setTax();
		assertEquals(22.982,tx.getTax());
	}
	
	public void testFinalCost() {
		Item i1 = new Item();
		i1.setName("Mango");
		i1.setQuantity(11);
		i1.setPrice(221.67);
		i1.type.setType("Raw");
		FinalCost fc = new FinalCost(i1);
		assertEquals("Mango",fc.item.getName());
		assertEquals(11,fc.item.getQuantity());
		assertEquals(221.67,fc.item.getPrice());
		assertEquals("Raw",fc.item.type.getType());
	}
	
	public void testSetFinalCost() {
		Item i1 = new Item();
		i1.setName("Notebook");
		i1.setQuantity(4);
		i1.setPrice(100);
		i1.type.setType("Import");
		i1.taxcal.setTax();
		FinalCost fc = new FinalCost(i1);
		fc.setFinalCost();
		assertEquals(480.00,fc.getFinalCost());
	}
	
	public void testToString() {
		Item i1 = new Item();
		i1.setName("Mango");
		i1.setQuantity(11);
		i1.setPrice(221.67);
		i1.type.setType("Raw");
		i1.taxcal.setTax();
		i1.finalcost.setFinalCost();
		String testString = "Mango (Price: 221.67, Quantity: 11, Type: Raw, Tax: 27.70875, Final Cost: 2743.1662499999998)";
		assertEquals(testString,i1.toString());
	}
}
