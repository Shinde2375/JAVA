package com.tka.prac.prog15;

public class Test {
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=3;i++)
		{
			 int k=1;
			
			for(int j=1;j<=11;j++)
			{
				if(j<=3)
				{
					System.out.print("@");
				}
				else if(j>=4 && j<=6)
				{
					System.out.print("#");
				}
				else if(j>=7 && j<=11)
				{
				
					System.out.print(k++);
				
				}
			}
			System.out.println();
		}
	}
}
