/* niki.ai Semester Long Internship Assignment 
	Recently Manu visited the byteland. He was amazed with lots of different varieties of bytes he
encountered there. Seeing this, he thought of a problem: Given an integer n, find out total possible
bit string (either 0 or 1) of length n which don't have two contiguous zeroes in them.
	For example -
	1) n =1 -> no of strings = 2
	2) n =2 -> no of strings = 3
	3) n =3 -> no of strings = 5
	4) n =4 -> no of strings = 8
	... and so on
	The pattern follows a recursive series f(n) = f(n-1)+f(n-2)
*/

import java.util.*;
import java.lang.*;

class TestProgram
{
	public static void main(String[] args)
	{
		long m = 1000000007;
		Scanner scan = new Scanner(System.in);
		int testcases = scan.nextInt();
		for(int tc=0;tc<testcases;tc++)
		{
			long n = scan.nextLong();
			long noofstr = getBitStrings(n);
			System.out.println(noofstr%m);
		}
	}
	public static long getBitStrings(long n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 2;
		else if(n==2)
			return 3;
		else
			return getBitStrings(n-1)+getBitStrings(n-2);
	}
}
