/*

Question:
	Given an array, rotate the array by one position in clock-wise direction.

	Example 1:

	Input:
		N = 5
		A[] = {1, 2, 3, 4, 5}
	Output:
		5 1 2 3 4

	Example 2:

	Input:
		N = 8
		A[] = {9, 8, 7, 6, 4, 2, 1, 3}
	Output:
		3 9 8 7 6 4 2 1

	Your Task:
		You don't need to read input or print anything.
		Your task is to complete the function rotate() 
		which takes the array A[] and its size N as inputs and modify the array in place.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
	1<=N<=105
	0<=a[i]<=105
*/

import java.util.*;

class Compute{
	public void rotate(int arr[], int n){
		int last=arr[0];

		for(int i=1;i<n;i++){
			int t=arr[i];
			arr[i]=last;
			last=t;
		}
		arr[0]=last;
	}
}

class Main{
	public static void main(String[] args){
		Compute ob=new Compute();

		int[] arr={1,2,3,5,789};

		ob.rotate(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
