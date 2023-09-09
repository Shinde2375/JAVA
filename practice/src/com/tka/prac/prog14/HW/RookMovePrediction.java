package com.tka.prac.prog14.HW;

import java.util.*;
public class RookMovePrediction {

	public static final int Board_Size=8;


	public static final int[][]Rook_Move = {{0,-1},{0,1},{-1,0},{1,0}};

	public static List<int[]>RookPoosibleMove(int currow,int curcol)
	{
		List<int[]>possibleMove = new ArrayList<>();

		for(int[]move:Rook_Move)
		{
			int nextrow = currow+move[0];
			int nextcol = curcol+move[1];

			while(nextrow>=0 && nextrow<Board_Size && nextcol>=0 && nextcol<Board_Size)
			{
				possibleMove.add(new int[]{nextrow,nextcol});
				nextrow = nextrow+move[0];
				nextcol = nextcol+move[1];				
			}
		}
		return possibleMove;
	}

	public static void main(String[] args) {
		int currow =3;
		int curcol =3;
		int count=0;

		List<int[]>possiblemove = RookPoosibleMove(currow,curcol);
		System.out.println("Possible move of the Rook from the position:("+ currow+","+curcol+") are\n");
		for(int[]move:possiblemove)
		{
			System.out.println(++count +"=" + "("+move[0]+"'"+move[1]+")");
		

		}
		System.out.println("Total number of possible steps of the Rook are: "+count);
	}
}