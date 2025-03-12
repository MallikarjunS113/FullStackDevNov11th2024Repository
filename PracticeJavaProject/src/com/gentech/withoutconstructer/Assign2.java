package com.gentech.withoutconstructer;

class Purchase
{
	String shopName;
	String itemName;
	int noOfItems;
	double price;
	String shoplocation;	
	
}

class Sales
{
	int NoOfCustomer;
	double totalsell;
	int remainingStock;
	double daySellingPrice;
	String location;
	
}

class Inventary
{
	double currentAsset;
	double assetValue;
	int verityOfGoods;
	int purchases;
	String venderLocation;

}

public class Assign2 {

	public static void main(String[] args) {
		
		Purchase obj5=new Purchase();
		obj5.shopName="Zoodio";
		obj5.itemName="Pants";
		obj5.noOfItems=2;
		obj5.price=2000;
		obj5.shoplocation="belagavi";
		System.out.println("shopName:"+obj5.shopName);
		System.out.println("itemName:"+obj5.itemName);
		System.out.println("noOfItems:"+obj5.noOfItems);
		System.out.println("price:"+obj5.price);
		System.out.println("shoplocation:"+obj5.shoplocation);
		System.out.println("---------------------------------");
		
		Sales obj1=new Sales();
		obj1.NoOfCustomer=25;
		obj1.totalsell=2544;
		obj1.remainingStock=10000;
		obj1.daySellingPrice=25000;
		obj1.location="Dharwad";
		System.out.println("NoOfCustomer:"+obj1.NoOfCustomer);
		System.out.println("totalsell:"+obj1.totalsell);
		System.out.println("remainingStock:"+obj1.remainingStock);
		System.out.println("daySellingPrice:"+obj1.daySellingPrice);
		System.out.println("location:"+obj1.location);
		System.out.println("---------------------------------");
		
		
		Inventary obj2=new Inventary();
		obj2.currentAsset=12500;
		obj2.assetValue=300000;
		obj2.verityOfGoods=10;
		obj2.purchases=25000;
		obj2.venderLocation="Bengaluru";
		System.out.println("currentAsset:"+obj2.currentAsset);
		System.out.println("assetValue:"+obj2.assetValue);
		System.out.println("verityOfGoods:"+obj2.verityOfGoods);
		System.out.println("purchases:"+obj2.purchases);
		System.out.println("venderLocation:"+obj2.venderLocation);
		System.out.println("---------------------------------");
		
	}

}
