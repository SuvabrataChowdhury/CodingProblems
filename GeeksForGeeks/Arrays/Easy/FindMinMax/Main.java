/*
Question:

Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Example 1:

	Input:
		N = 6
		A[] = {3, 2, 1, 56, 10000, 167}
	Output:
		min = 1, max =  10000

Example 2:

	Input:
		N = 5
		A[]  = {1, 345, 234, 21, 56789}
	Output:
		min = 1, max = 56789

Your Task:  
	You don't need to read input or print anything.
	Your task is to complete the function getMinMax() 
	which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Ai <=1012

*/

import java.util.*;

class Pair{
	long first, second;
	public Pair(long first, long second){
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString(){
		return this.first+" "+this.second;
	}
}

class Compute{
	static Pair getMinMax(long a[], long n){
		long max=Integer.MIN_VALUE;
		long min=Integer.MAX_VALUE;
		
		for(long num:a){
			if(num>=max)
				max=num;
			if(num<=min)
				min=num;
		}

		return new Pair(min,max);
	}
}

class Main{
	public static void main(String[] args){
		long[] a = {3, -2, 1, 56, 10, 16};

		System.out.println(Compute.getMinMax(a,a.length));
	}
}
