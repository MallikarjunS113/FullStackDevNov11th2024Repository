package com.gentech.method;

class SecondHalf
{
	void add2matrix()
	{
		int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int y[][]= {{0,1,2},{3,4,5},{6,7,8}};
		
		
		int result[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			
			for(int j=0;j<x[i].length;j++)
			{
				result[i][j]=x[i][j]+y[i][j];
			}
					
		}
		for(int j=0;j<result.length;j++)
		{
			for(int m=0;m<result[j].length;m++)
			{
				System.out.print(result[j][m]+"   ");
			}
			System.out.println();
			
		}
		int sum=0;
		for(int e=0;e<result[1].length;e++)
		{
			sum+=result[1][e];
		}
		System.out.println("2ND ROW SUM : "+sum);
	}

}

public class Add2MatrixRead2Half {

	public static void main(String[] args) {
		
		SecondHalf obj=new SecondHalf();
		
		obj.add2matrix();

	}

}
