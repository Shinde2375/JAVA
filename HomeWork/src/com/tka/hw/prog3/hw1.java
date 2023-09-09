package com.tka.hw.prog3;						//DATE - 07-07-2023

public class hw1 {
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1 || j==5)
			
				System.out.print("#");
			else
				System.out.print("*");
			
		}
		System.out.println();
	}
	System.out.println("___________________________________________________");
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i<=2||j==5)
				System.out.print("#");
			else
				System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("___________________________________________________");

for(int i=1;i<=5;i++)
{for(int j=1;j<=5;j++)
{
	if(i<=3)
		System.out.print("#");
	else
		System.out.print("*");
}
System.out.println();
}
System.out.println("___________________________________________________");


for(int i=1;i<=5;i++)
{
	for(int j=1;j<=5;j++)
	{
		if(i>=2 && i<=4 && j<=3)
			System.out.print("#");
		else
		System.out.print("*");
	}
	System.out.println();
	
}
	System.out.println("___________________________________________________");
	
	
	
	for(int i1=1 ;i1<=5;i1++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i1>=4 && j<=2)
				System.out.print("#");
			else 
				System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("___________________________________________________");
	
	
	for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i<=2 && j>=3 || i<=5 && j>=4 )
				System.out.print(" ");
			else
			System.out.print("*");
			
		}
		System.out.println();
	}
	System.out.println("___________________________________________________");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			System.out.print(j);
		}System.out.println();	
	}
	System.out.println("___________________________________________________");
	
	for(int i=1;i<=5;i++)
	{
		for(int  j=1;j<=5;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	System.out.println("___________________________________________________");
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==1)
				System.out.print("1");
			else if(j>=3&& i==1 || i==2 && j>=4|| i==3 && j>=5)
				System.out.print(" ");
			else
				System.out.print("0");
		}
		System.out.println();
	}
	System.out.println("___________________________________________________");
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=5;j++)
		{if(j==1)
			System.out.print("1");
		else if(j>=3 && i>=4 || j>=4 && i>=3 || j>=5 && i>=2)
			System.out.print(" ");
		
		else
			System.out.print("0");
		}
		System.out.println();
	}
	System.out.println("___________________________________________________");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(j==1)
				System.out.print(" 11 ");
			else if(i>=2 && j==2)
				System.out.print(" 12 ");
			else if(i>=3 && j==3)
				 System.out.print(" 13 ");
			else if(i>=4 && j==4)
				 System.out.print(" 14 ");
			else if(i==5 && j==5)
				 System.out.print(" 15 ");
			
			else
				System.out.print("  ");
				
		}System.out.println();
	}	

}
}

