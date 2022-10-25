package com.assignment1;

public class FirstQuestion {
	public static void main(String[] args)
	{
	int n=7,i,j;
	for(i=0;i<n;i++)
	{
		//for I
		for(j=0;j<n;j++)
		{
			   if(i==0||i==(n-1)||j==(n-1)/2)
			    System.out.print("*");
			   else
				System.out.print(" ");
		}
		System.out.print(" ");
		//for N
		for(j=0;j<n;j++)
		{
			if(j==0||j==(n-1)||i==j)
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
		//for E
		for(j=0;j<n;j++)
		{
			if(j==0||i==0||i==(n-1)||i==(n-1)/2)
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
		//for U
		for(j=0;j<n;j++)
		{
			if(j==0||j==(n-1)||i==(n-1))
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
		//for R
		for(j=0;j<n;j++)
		{
			if((j==0&&i!=0)||(j==(n-1)&&i!=0 &&i!=(n-1)/2)||(i==0 && j<(n-1) && j!=0)||((i==(n-1)/2)&&j!=(n-1)))
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
		//for O
		for(j=0;j<n;j++)
		{
			if(j==0||j==(n-1)||i==(n-1)||i==0)
			   System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.print(" ");
        //for N
		for(j=0;j<n;j++)
		{
			if(j==0||j==(n-1)||i==j)
			   System.out.print("*");
			else
				System.out.print(" ");
		}


		System.out.println();
		
	}
	}

}
