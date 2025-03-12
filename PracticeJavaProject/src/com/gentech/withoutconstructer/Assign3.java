package com.gentech.withoutconstructer;

class Product
{
	int productid;
	String productName;
	int productPrice;
	int noOfproducts;
	int purchasedproduct;
	
}

class Order
{
	String customerName;
	int orderid;
	String  ProductName;
	String customerLocation;
	long customerPincode;
	
}

class Shipment
{
	int shipmentid;
	int orderid;
	String orderedLocation;
	String ShippingLocation;
	String ArraivingDate;

}

public class Assign3 {

	public static void main(String[] args) {
		
	 Product Obj=new Product();
	 Obj.productid=1127;
	 Obj.productName="JEANS SHIRT";
	 Obj.productPrice=800;
	 Obj.noOfproducts=120;
	 Obj.purchasedproduct=22;
	 System.out.println("productid:"+Obj.productid);
	 System.out.println("productName:"+Obj.productName);
	 System.out.println("productPrice:"+Obj.productPrice);
	 System.out.println("noOfproducts:"+Obj.noOfproducts);
	 System.out.println("purchasedproduct:"+Obj.purchasedproduct);
	 System.out.println("--------------------------------");
			
	 Order Obj1=new Order();	
	 Obj1.customerName="Mallikarjuna";
	 Obj1.orderid=112;
	 Obj1.ProductName="jeans shirt";
	 Obj1.customerLocation="belagavi";
	 Obj1.customerPincode=580001;
	 System.out.println("customerName:"+Obj1.customerName);
	 System.out.println("orderid:"+Obj1.orderid);
	 System.out.println("ProductName:"+Obj1.ProductName);
	 System.out.println("customerLocation:"+Obj1.customerLocation);
	 System.out.println("customerPincode:"+Obj1.customerPincode);
	 System.out.println("--------------------------------");
				
	 Shipment Obj2=new Shipment();		
	 Obj2.shipmentid=1112;
	 Obj2.orderid=112;
	 Obj2.orderedLocation="Belagavi";
	 Obj2.ShippingLocation="Dharwad";
	 Obj2.ArraivingDate="12/12/2024";
	 System.out.println("shipmentid:"+Obj2.shipmentid);
	 System.out.println("orderid:"+Obj2.orderid);
	 System.out.println("orderedLocation:"+Obj2.orderedLocation);
	 System.out.println("ShippingLocation:"+Obj2.ShippingLocation);
	 System.out.println("ArraivingDate:"+Obj2.ArraivingDate);
	 System.out.println("--------------------------------");
					
		
	}

}
