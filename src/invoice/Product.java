package invoice;

import java.util.Scanner;

public class Product {
	private double price;
	private String descr;
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getDescr() {
		return descr;
	}
	
/*	public void setPrice(double price){
		this.price=price;	
	}
	public double getprice(){
		//System.out.println("Enter the product price");
		//Scanner price1 = new Scanner (System.in);
		return price = price1.nextInt();
	}
	
	public void setdescr(String descr){
		this.descr=descr;	
	}
	public String getdescr(){
		System.out.println("Enter the product description");
		Scanner descr1 = new Scanner (System.in);
		return descr = descr1.nextLine();
	}*/
	
	
}
