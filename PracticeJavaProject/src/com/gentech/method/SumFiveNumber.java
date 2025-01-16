package com.gentech.method;



class OneDA
{
	void perform()
	{
		byte b[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<b.length;i++)
		{
			sum+=b[i];
			
		}
		System.out.println(sum);
	}

}

public class SumFiveNumber {

	public static void main(String[] args) {
		
		OneDA obj=new OneDA();
		obj.perform();
	}

}

