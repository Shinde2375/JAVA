package com.tka.revision.prog4;

public class Pattern2 {
	public static void main(String[] args) {
		int n=7432;
		while(n>0)
		{
			int r = n%10;
			n = n/10;
				switch(r)
				{
				case 1: System.out.println("ONE");
				break;
				case 2: System.out.println("TWO");
				break;
				case 3: System.out.println("THREE");
				break;
				case 4: System.out.println("FOUR");
				break;
				case 5: System.out.println("FIVE");
				break;
				case 6: System.out.println("SIX");
				break;
				case 7: System.out.println("SEVEN");
				break;
				case 8: System.out.println("EIGHT");
				break;
				case 9: System.out.println("NINE");
				break;
				default :System.out.println("Invalid no");
				}
		}
	}
}