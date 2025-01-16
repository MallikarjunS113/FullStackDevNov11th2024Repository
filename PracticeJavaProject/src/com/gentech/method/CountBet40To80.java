package com.gentech.method;

class Number
{
	void Between()
	{
		int count=0;
		for(int i=40;i<=80;i++)
		{
			if(i%3==0)
			{
				count++;
				
			}
		}
		System.out.println(count);
		
	}

}

public class CountBet40To80 {

	public static void main(String[] args) {
		
		Number obj=new Number();
		obj.Between();

	}

}
