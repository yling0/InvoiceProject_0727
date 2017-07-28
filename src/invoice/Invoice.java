package invoice;

import java.util.ArrayList;
import java.util.Scanner;

//This is the parent class. 
public class Invoice {
		

	public static void main(String[] args) {
		int trate; String answer; int tAmount; int totalAmount; int ftAmount;
		// TODO Auto-generated method stub
		//Create Arraylist to store Product information 
		ArrayList<Product> array = new ArrayList<Product>();
		
		
			System.out.println("Enter the tax rate");
			Scanner taxr1 = new Scanner (System.in);
			trate = taxr1.nextInt();
			
		do {Product a = new Product();
			print(""+a.price());
		
			Product b = new Product();
			print(b.descr());
			
			System.out.println("Add another Product? y/n");
			Scanner answer1 = new Scanner (System.in);
			answer = answer1.nextLine();
			
			array.add(a);			
			
		} while (answer.equalsIgnoreCase("y"));
		
		System.out.println("Invoice: ");
		
		for (Product item:array);{
			totalAmount += item.getPrice();
			System.out.println(item.getName() + "   " + item.getPrice());
			

		}
		
		tAmount = totalAmount * trate/100;
		ftAmount = totalAmount + tAmount;
		
		System.out.println("totalAmount");
		System.out.println("tax");
		System.out.println("Total");
				
		

		}

	
	

	private static void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
	}



	
	
		
	
}
