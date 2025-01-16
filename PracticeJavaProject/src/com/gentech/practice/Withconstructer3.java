package com.gentech.practice;

class Product1
{
	int productid;
	String productName;
	int productPrice;
	int noOfproducts;
	int purchasedproduct;
	
	Product1()
	{
		productid=1127;
		productName="JEANS SHIRT";
		productPrice=800;
		noOfproducts=120;
		purchasedproduct=22;
		 System.out.println("productid:"+productid);
		 System.out.println("productName:"+productName);
		 System.out.println("productPrice:"+productPrice);
		 System.out.println("noOfproducts:"+noOfproducts);
		 System.out.println("purchasedproduct:"+purchasedproduct);
		 System.out.println("--------------------------------");
		
	}
	
}

class Order
{
	String customerName;
	int orderid;
	String  ProductName;
	String customerLocation;
	long customerPincode;
	
	Order()
	{
		customerName="Mallikarjuna";
		orderid=112;
		ProductName="jeans shirt";
		customerLocation="belagavi";
		customerPincode=580001;
		System.out.println("customerName:"+customerName);
		System.out.println("orderid:"+orderid);
		System.out.println("ProductName:"+ProductName);
		System.out.println("customerLocation:"+customerLocation);
		System.out.println("customerPincode:"+customerPincode);
		System.out.println("--------------------------------");
	
	}
	
}

class Shipment
{
	int shipmentid;
	int orderid;
	String orderedLocation;
	String ShippingLocation;
	String ArraivingDate;
	
	Shipment()
	{
		shipmentid=1112;
		orderid=112;
		orderedLocation="Belagavi";
		ShippingLocation="Dharwad";
		ArraivingDate="12/12/2024";
		System.out.println("shipmentid:"+shipmentid);
		System.out.println("orderid:"+orderid);
		System.out.println("orderedLocation:"+orderedLocation);
		System.out.println("ShippingLocation:"+ShippingLocation);
		System.out.println("ArraivingDate:"+ArraivingDate);
		System.out.println("--------------------------------");
		
	}

}

public class Withconstructer3 {

	public static void main(String[] args) {
		
		Product1 Obj=new Product1();
		 
		Order Obj1=new Order();	
		 		
		Shipment Obj2=new Shipment();		
	}

}
