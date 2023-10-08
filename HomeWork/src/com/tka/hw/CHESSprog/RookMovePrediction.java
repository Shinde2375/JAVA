package com.tka.hw.CHESSprog;

import java.util.ArrayList;
import java.util.List;    
public class RookMovePrediction {
public static final int Board_Size = 8;
public static final int[][]RookMoves = {{1,0},{-1,0},{0,1},{0,-1}};

 static List<int[]>PossibleRookMove(int currow,int curcol)
{
	List<int[]>PossibleMove = new ArrayList<>();
	
	for(int[]move : RookMoves)
	{
		int nextrow = currow+move[0];
		int nextcol = curcol+move[1];
		while(nextrow>=1 && nextrow <= Board_Size && nextcol >= 1 && nextcol<= Board_Size)
		{
			PossibleMove.add(new int[]{nextrow,nextcol});
			nextrow += move[0];
			nextcol += move[1];	
	}
	}
	return PossibleMove;
}

public static void main(String[] args) {
	int currow = 3;
	int curcol =3;
	int count=0;
	List<int[]>PossibleMove = PossibleRookMove(currow,curcol);
	
	for(int[]move : PossibleMove)
		
	{
		System.out.println(++count+"="+"{"+move[0]+","+move[1]+"}");	
	}
}
}