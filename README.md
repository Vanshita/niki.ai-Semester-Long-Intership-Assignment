# niki.ai-Semester-Long-Intership-Assignment

The backend Assignment for niki.ai Internship is as follows :

Problem Statement:

Recently Manu visited the byteland. He was amazed with lots of different varieties of bytes he
encountered there. Seeing this, he thought of a problem: Given an integer n, find out total possible
bit string (either 0 or 1) of length n which don't have two contiguous zeroes in them. For example if n
= 3, then total possible bit strings are 5 {010, 011, 101, 110, 111}. Now Manu started solving
the problem but got busy with some important deployments. He asked you for the help. Please help
him figure out the solution.

Solution:

Algorithm 1 :
The most simple solution could be to use Brute Force and generate all the binary strings of length "n" and
check for the strings which do not have 2 consecutive zeroes in them. Increment the count as you find the string
that follows the pattern and display the result.

Algorithm 2:
This is the algo implemented by me to find the solution.
Let's have a look at the pattern that follows - 
For the values of length of string, the output varied as
  1) n =1 -> no of strings = 2
	2) n =2 -> no of strings = 3
	3) n =3 -> no of strings = 5
	4) n =4 -> no of strings = 8
	... and so on
	The pattern follows a recursive series f(n) = f(n-1)+f(n-2) ( Fibonacci series).
  Hence using the recursive series, we can implement the solution.
