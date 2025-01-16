package com.gentech.method;



class Avera
{
	void perform()
	{
		
		int average=0;
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			average=((sum+i)/2);
			
		}
		System.out.println(average);
	}

}

public class Average10Value {

	public static void main(String[] args) {
		
		Avera obj=new Avera();
		obj.perform();
	}

}

