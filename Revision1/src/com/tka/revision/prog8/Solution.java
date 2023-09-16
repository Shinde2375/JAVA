package com.tka.revision.prog8;

public class Solution {

//	public boolean isPalindrom(int x)
//	{
//		int temp =x;
//		int rev = 0;
//		while(temp!=0)
//		{
//			int reminder = temp%10;
//			rev = rev*10+reminder;
//			temp = temp/10;
//		}
//			if(x == rev)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//	}
	
	
	    public int reverse(int x) {
	        int temp = x;
	        int  rev=0;

	        while(temp!=0)
	        {
	            int reminder = temp %10;
	          
	            rev = rev*10+reminder;
	            temp = temp/10;
	        }
	       
	        return rev;
	        
	    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverse(1534236469));  // we get Wrong O/P in this test case
	}
}