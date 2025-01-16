package com.gentech.method;

class NameArray
{
	void give()
	{
		String s[]= {"Jothibaa","Pradeep","Ravi","mallappa"};
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		
	}
 
}

public class ReturnString {
	public static void main(String args[])
	{
		NameArray obj=new NameArray();
		obj.give();
		
	}

}
