package com.gentech.practice;

class Purchase
{
	String shopName;
	String itemName;
	int noOfItems;
	double price;
	String shoplocation;	
	
	Purchase()
	{
		shopName="Zoodio";
		itemName="Pants";
		noOfItems=2;
		price=2000;
		shoplocation="belagavi";
		System.out.println("shopName:"+shopName);
		System.out.println("itemName:"+itemName);
		System.out.println("noOfItems:"+noOfItems);
		System.out.println("price:"+price);
		System.out.println("shoplocation:"+shoplocation);
		System.out.println("---------------------------------");
		
	}
	
}

class Sales
{
	int NoOfCustomer;
	double totalsell;
	int remainingStock;
	double daySellingPrice;
	String location;
	
	Sales()
	{
		NoOfCustomer=25;
		totalsell=2544;
		remainingStock=10000;
		daySellingPrice=25000;
		location="Dharwad";
		System.out.println("NoOfCustomer:"+NoOfCustomer);
		System.out.println("totalsell:"+totalsell);
		System.out.println("remainingStock:"+remainingStock);
		System.out.println("daySellingPrice:"+daySellingPrice);
		System.out.println("location:"+location);
		System.out.println("---------------------------------");
		
	}
	
}

class Inventary
{
	double currentAsset;
	double assetValue;
	int verityOfGoods;
	int purchases;
	String venderLocation;
	
	Inventary()
	{
		currentAsset=12500;
		assetValue=300000;
		verityOfGoods=10;
		purchases=25000;
		venderLocation="Bengaluru";
		System.out.println("currentAsset:"+currentAsset);
		System.out.println("assetValue:"+assetValue);
		System.out.println("verityOfGoods:"+verityOfGoods);
		System.out.println("purchases:"+purchases);
		System.out.println("venderLocation:"+venderLocation);
		System.out.println("---------------------------------");
	
	}

}

public class Withconstucter2 {

	public static void main(String[] args) {
		
		Purchase obj5=new Purchase();
		
		Sales obj1=new Sales();
		
		Inventary obj2=new Inventary();	
	}

}

