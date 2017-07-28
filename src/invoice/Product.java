package invoice;

import java.util.Scanner;

public class Product {
	double price;
	String descr;
	
	public double price(){
		System.out.println("Enter the product price");
		Scanner price1 = new Scanner (System.in);
		return price = price1.nextInt();
	}
	
	public String descr(){
		System.out.println("Enter the product description");
		Scanner descr1 = new Scanner (System.in);
		return descr = descr1.nextLine();
	}
	
}
