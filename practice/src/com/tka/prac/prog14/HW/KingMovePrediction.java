package com.tka.prac.prog14.HW;


import java.util.*;

public class KingMovePrediction {
		public static final int Board_Size =8;
		public static final int[][]KingMoves = {{0,-1},{1,-1},{1,0},{1,1},{-1,1},{0,1},{0,-1},{-1,-1} };

		public static List<int[]>KingPossiblemove(int currow,int curcol)
		{
		List<int[]>possiblemove = new ArrayList<>();
			
			for(int[]moves : KingMoves)
			{
				int nextrow = currow + moves[0];
				int nextcol = curcol + moves[1];
				
				if(nextrow>=1 && nextrow<=Board_Size && nextcol>0 && nextcol<=Board_Size)
				{
					possiblemove.add(new int[] {nextrow,nextcol});	
				}
			}
			return possiblemove;
		}
		
		public static void main(String[] args) {
			int currow =3;
			int curcol =3;
			int count =0;
			
			List<int[]>possiblemove = KingPossiblemove(currow,curcol);
			
			for(int[]moves : possiblemove)
			{
				System.out.println(++count +": "+"("+moves[0]+","+moves[1]+")");
			}
		}
	}


