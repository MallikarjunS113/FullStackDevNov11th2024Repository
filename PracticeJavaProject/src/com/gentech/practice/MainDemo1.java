package com.gentech.practice;

class Person
	{
		String fullname;
		int age;
		
		Person()
		{
			fullname = "santosh";
			age = 22;
			
			System.out.println("Full Name :" + fullname);
			System.out.println("Age :"+age);
			System.out.println("-------------------------");
		
		}
	
	}
class Birds
{
	int noOfWings;
	String featherColor;
	
	Birds()
	{
		noOfWings=2;
		featherColor="Green Color";
		System.out.println("No Of Wings: "+noOfWings);
		System.out.println("Feather Color" +featherColor);
		System.out.println("-------------------------");
	}
}


class DomesticAnimals
{
	String quantityofMilkProvides;
	String breedName;
	
	DomesticAnimals()
	{
		quantityofMilkProvides="2 liters";
		breedName="Jersey";
		System.out.println("Quantity of Milk Provides :"+quantityofMilkProvides);
		System.out.println("Breed Name :" +breedName);
		System.out.println("-------------------------");
	}
	
}

class Product
{
	String productName;
	double price;
	
	Product()
	{
		productName="Lenevo";
		price=32500.75;
		
		System.out.println("ProductName:"+productName);
		System.out.println("Price:"+price);
		System.out.println("-------------------------");
		
	}

}
public class MainDemo1 {

	public static void main(String args[]) 
			{
		
				Person santu = new Person();
		
				Birds sparrow = new Birds();
		
				DomesticAnimals cow = new DomesticAnimals();
		
				Product lenevo = new Product();
			}
	
}

