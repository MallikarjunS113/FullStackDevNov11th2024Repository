package com.gentech.method;


class IsPrime
{
	void checkPrime()
	{
		int num=100;
		for(int i=1;i<=num;i++)
		{
			int look=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					look+=1;
					break;
				}
			}
			if(look==0)
			{
				
				System.out.println(i+" is a prime number");
			}
		}
	}
}
public class Prime1To100 {

	public static void main(String[] args) {
		
		IsPrime obj=new IsPrime();
		obj.checkPrime();
	}

}
