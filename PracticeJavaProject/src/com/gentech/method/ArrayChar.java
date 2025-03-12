package com.gentech.method;

class Top
{
	void Perform()
	{
		char x[]= {'A','B','C','D','E','F'};
		
		char y[]= new char[x.length]; 
		char k=0;
		for(int i=x.length-1;i>=0;i--)
		{
			y[k]=x[i];
			k++;
		}
		for(int j=y.length/2;j<y.length;j++)
		{
			System.out.println(y[j]);
		}
	}
}

public class ArrayChar {

	public static void main(String[] args) {
		
		Top obj= new Top();
		obj.Perform();

	}

}
