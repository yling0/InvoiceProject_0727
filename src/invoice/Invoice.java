package invoice;

import java.util.ArrayList;

import java.util.Scanner;

//This is the parent class. 
public class Invoice {
		

	public static void main(String[] args) {
		
		int trate; 
		String answer; 
		double tAmount; 
		double totalAmount=0; 
		double ftAmount;
		
		// TODO Auto-generated method stub
		//Create Arraylist to store Product information 
		ArrayList<Product> array = new ArrayList<Product>();
		
		
			System.out.println("Enter the tax rate");
			Scanner taxr1 = new Scanner (System.in);
			trate = taxr1.nextInt();
			
		do {
			Product a = new Product();
			
			System.out.println("Enter the product price");
			Scanner price1 = new Scanner (System.in);
			
			double price = price1.nextDouble();
			a.setPrice(price);
			
		
		
			System.out.println("Enter the product description");
			Scanner descr1 = new Scanner (System.in);
			
			String descr = descr1.nextLine();
			a.setDescr(descr);
			
			
			System.out.println("Add another Product? y/n");
			Scanner answer1 = new Scanner (System.in);
			answer = answer1.nextLine();
			
			array.add(a);
		
			
			} while (answer.equalsIgnoreCase("y"));
		
		
		System.out.println("Invoice: ");
		
		for (Product item:array){
			totalAmount += item.getPrice();
			System.out.println(item.getDescr() + "   " + item.getPrice());
		}
		
		
		tAmount = totalAmount * trate/100;
		ftAmount = totalAmount + tAmount;
		
		System.out.println("Tax Rate: "+ trate+"%");
		System.out.println("Tax Charged: "+ tAmount);
		System.out.println("Total Amount Due: "+ ftAmount);
				
		

		}
	

	private static void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
		
	}

		
	
}
