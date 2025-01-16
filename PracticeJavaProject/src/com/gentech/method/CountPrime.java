package com.gentech.method;

class PrimeCtTwo
{
	void hundred()
	{
		
		int count=0;
		int num=200;
		
		for(int i=100;i<=num;i++)
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
				count++;
			}
		}
		System.out.println(count);
	}
}
public class CountPrime {

	public static void main(String[] args) {
		PrimeCtTwo obj=new PrimeCtTwo();
		obj.hundred();
	}

}
