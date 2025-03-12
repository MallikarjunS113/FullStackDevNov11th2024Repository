package com.gentech.method;

class Cube
{
	void perform()
	{
		int cube=0;
		byte b[]= {1,2,3,4,5};
		for(int i=1;i<=b.length;i++)
		{
			cube=i*i*i;
			System.out.println(cube);
		}
	}

}

public class CubeGiven {

	public static void main(String[] args) {
		
		Cube obj=new Cube();
		obj.perform();
	}

}
