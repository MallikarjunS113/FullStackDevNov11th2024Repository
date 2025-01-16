package com.gentech.method;

class OneDArray
{
	void substr2Matrix()
	{
		int x[]= {1,2,3,4,5,6};
		int y[]= {0,1,2,3,3,3};
		int sub=0;
		for(int i=0;i<x.length;i++)
		{
				sub=x[i]-y[i];
				System.out.print(sub);
		}
		System.out.println();
	}

}

public class ReadSecondHalf {

	public static void main(String[] args) {
		
		OneDArray obj=new OneDArray();
		obj.substr2Matrix();
	}

}
