package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

import itemDetails.Item;
import itemDetails.ItemsList;

/*
 *Class: Main
 * 
 *Author: @NamrataGaur
 * 
 * Creation Date:03/06/2019
 * 
 * Description: This is the main class.
 * 
 * */

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Item item1 = new Item();
		ItemsList itemlist = new ItemsList();
		String a;
		
		String pattern1 = "^[A-Za-z]+[A-Za-z,\\s]*$";
		String pattern2 = "[0-9]{1,13}(\\.[0-9]*)?$";
		String pattern3 = "\\d+";
		String s1;
		String s2;
		String s3;
		String s4;
		
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		
		do {
			item1 = new Item();
			
			//Taking item name from user and validating it with the regex.
			
			int flag = 0;
			System.out.println("Enter the name:");
			do {
				s1 = inp.readLine();
			try{
				if(s1.matches(pattern1)) {
					item1.setName(s1);
					flag = 1;
			}
			else {
				throw new InputMismatchException();
				}
			}catch(InputMismatchException e) {
				System.out.println("Enter a valid name");
			}
			}while(flag == 0);
		
			flag = 0;
			
			//Taking item price from user and validating it with the regex.
			
			System.out.println("Enter the price:");
			do {
				s2 = inp.readLine();
			try{
				if(s2.matches(pattern2)) {
					item1.setPrice(Double.parseDouble(s2));
				flag = 1;
			}
			else {
				throw new InputMismatchException();
				}
			}catch(InputMismatchException e) {
				System.out.println("Enter a valid price");
			}
			}while(flag == 0);
			
			
			flag = 0;
			
			//Taking item quantity from user and validating it with the regex.
			
			System.out.println("Enter the quantity:");
			do {
				s3 = inp.readLine();
			try{
				if(s3.matches(pattern3)) {
					item1.setQuantity(Integer.parseInt(s3));
					flag = 1;
			}
			else {
				throw new InputMismatchException();
				}
			}catch(InputMismatchException e) {
				System.out.println("Enter a valid quantity");
			}
			}while(flag == 0);
			
			flag = 0;
			
			//Taking item type from user and validating it with the regex.
			
			System.out.println("Enter the type:");
			do {
				s4 = inp.readLine();
			try{
				if(item1.type.setType(s4)) {
					item1.type.setType(s4);
					flag = 1;
			}
			else {
				throw new InputMismatchException();
				}
			}catch(InputMismatchException e) {
				System.out.println("Enter a valid type from (Raw, Manufactured, Import)");
			}
			}while(flag == 0);
						
			//Adding item to the itemlist.
			
			itemlist.addItem(item1);
			item1 = null;
			
			System.out.println("Do you want to enter details of any other item (y/n):");
	        a = inp.readLine();

		}while(a.equals("y"));
		
		int n = itemlist.listSize();
		
		for(int i = 0; i < n; i++) {
			item1 = itemlist.getItem(i);  //getting item from the list.
			item1.taxcal.setTax();  //calculating tax of that item.
			item1.finalcost.setFinalCost();  //calculating final cost of the item.
			
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(itemlist.getItem(i).toString());
		}
	
	}
	

}
