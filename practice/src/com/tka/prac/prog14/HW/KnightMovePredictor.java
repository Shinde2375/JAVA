package com.tka.prac.prog14.HW;

import java.util.ArrayList;
import java.util.List;

public class KnightMovePredictor
{
	public static final int Board_Size =8;
	
	public static final int[][]Knight_Move ={
			{-2,-1},{-2,1},{-1,-2},{1,-2},{-1,2},{1,2},{-1,2},{1,2} };
	
	public static List<int[]>PredictKnightMove(int currentrow,int currentcol)
	{
		List<int[]>possiblemove = new ArrayList<>();
		
		for(int[]move:Knight_Move)
		{
			int nextrow = currentrow + move[0];
			int nextcol = currentcol + move[1];
			
			if(nextrow>=0 && nextrow < Board_Size && nextcol>=0 && nextcol<Board_Size)
			{
				possiblemove.add(new int[]  {nextrow,nextcol});
			}
	}
		return possiblemove;
	}
	
	public static void main(String[] args) {
		
		int currentrow=3;
		int currentcol =3;
		
		List<int[]>possiblemove = PredictKnightMove(currentrow,currentcol);
		System.out.println("Possible move of the knight from position ("+currentrow+","+ currentcol+")");
		
		for(int[] move:possiblemove)
		{
			System.out.println("("+move[0]+","+move[1]+")");
		}
	}
}

