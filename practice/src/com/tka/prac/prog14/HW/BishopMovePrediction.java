package com.tka.prac.prog14.HW;

import java.util.*;


public class BishopMovePrediction {
	public static final int Board_Size = 8;
	
	public static final int[][]BishopMove = {{-1,-1},{1,-1},{-1,1},{1,1}};
	
	public static List<int[]>Bishopmove(int currow,int curcol)
	{
		List<int[]>possiblemove = new ArrayList<>();
		
		for(int[]move:BishopMove)
		{
			int nextrow = currow+move[0];
			int nextcol = curcol+move[1];
			
			while(nextrow>=1 && nextrow<=Board_Size && nextcol>=1 && nextcol <= Board_Size)
			{
				possiblemove.add(new int[] {nextrow,nextcol});
				nextrow +=move[0];
				nextcol +=move[1];
			}
		}
		return possiblemove;
	}
	
	public static void main(String[] args) {
		int currow = 1;
		int curcol = 5;
		int count=0;
		
		List<int[]>possiblemove = 	Bishopmove(currow,curcol);
		
		for(int[]move:possiblemove)
		{
			System.out.println(++count+":"+"("+move[0]+","+move[1]+")");
		}
	}

}
