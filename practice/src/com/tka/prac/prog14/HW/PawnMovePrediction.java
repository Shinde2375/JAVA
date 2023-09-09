package com.tka.prac.prog14.HW;

import java.util.ArrayList;
import java.util.List;

public class PawnMovePrediction{
		
		public static final int Board_Size = 8;
		
		public static final int[][]PawnMoves = { {1,0},{1,-1},{1,1} };
		
		public static List<int[]>PawnPossiblemove(int currow,int curcol)
		{
			List<int[]>possiblemove = new ArrayList<>();
			
			for(int[]move : PawnMoves)
			{
				int nextrow = currow+move[0];
				int nextcol = curcol+move[1];
				
			if(nextrow>=1 && nextrow<Board_Size && nextcol>=0 && nextcol<Board_Size)
			{
				
				possiblemove.add(new int[] {nextrow,nextcol});
			}			
			}
			return possiblemove;
		}
		
		public static void main(String[] args) {
			int currow =2;
			int curcol =3;
			int count=0;
			List<int[]>possiblemove =PawnPossiblemove( currow, curcol);
			
			for(int[]move : possiblemove)
			{
				System.out.println(++count+ ": "+"("+move[0]+","+move[1]+")");
			}
			
		}
	}