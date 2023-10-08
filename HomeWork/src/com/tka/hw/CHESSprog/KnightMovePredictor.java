package com.tka.hw.CHESSprog;

import java.util.ArrayList;
import java.util.List;

public class KnightMovePredictor {
	public static final int Board_Size = 8;
	public static  final int[][] Knight_Moves ={{1,-2},{-1,-2},{-1,2},{1,2},{-2,-1},{-2,1},{2,-1},{2,1}};
	public static List<int[]>Knightpredictor(int currow,int curcol)
	{
		List<int[]>predictor = new ArrayList<>();
		
		for(int[] move : Knight_Moves)
		{
			int nextrow = currow+move[0];
			int nextcol = curcol+move[1];		
			if(nextrow>0 && nextrow<=Board_Size && nextcol >0 && nextcol<=Board_Size)
			{
				predictor.add(new int[] {nextrow,nextcol});
			}
		}
		return predictor;
	}
	public static void main(String[] args) {
		int currow =8;
		int curcol =7;
		int count =0;
		List<int[]>possiblemove=Knightpredictor(currow,curcol);
		System.out.println("Possible move of {"+currow+","+curcol+"}");
		for(int[]move : possiblemove)
		{
			System.out.println(++count+ "="+"{"+move[0]+","+move[1]+"}");
		}
	}
}