package com.gentech.method;

class Multiplication
{
	void multiple1darray()
	{
		int x[]= {1,2,3,4,5,6};
		int result=1;
		for(int i=0;i<x.length;i++)
		{
			result=result*x[i];
			System.out.println(result);
		}
	}
}

public class Multiplication1DArray {

	public static void main(String[] args) {
		
		Multiplication o1=new Multiplication();
		o1.multiple1darray();

	}

}
