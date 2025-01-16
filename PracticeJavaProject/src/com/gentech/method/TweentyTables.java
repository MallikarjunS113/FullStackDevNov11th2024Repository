package com.gentech.method;

class Tables
{
	void twenty()
	{
		for(int j=1;j<=10;j++)
		
		{
			for(int i=2;i<=20;i++)
			{
				System.out.print(i*j+" ");
				
			}
			System.out.println();
			
		}	
	}

}
public class TweentyTables {

	public static void main(String[] args) {
		
		Tables obj = new Tables();
		obj.twenty();

	}

}
