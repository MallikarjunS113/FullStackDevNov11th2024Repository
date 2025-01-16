package com.gentech.method;

class Concat
{
	void ConcatHalf()
	{
		String x[]= {"Shrishail","Jo","Janaka","Teacher","Arjun","Panda"};
		String count="";
		for(int i=x.length/2;i<x.length;i++)
		{
			count+=x[i];
		}
		System.out.println(count);
	}

}

public class StringArrayConcat {

	public static void main(String[] args) {
		
		Concat o1=new Concat();
		o1.ConcatHalf();

	}

}
