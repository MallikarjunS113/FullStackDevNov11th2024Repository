package com.gentech.method;

class OneD
{
	void perform()
	{
		byte b[]= {1,2,3,4,5};
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}

public class OneDByteArray {

	public static void main(String[] args) {
		
		OneD obj=new OneD();
		obj.perform();
	}

}
