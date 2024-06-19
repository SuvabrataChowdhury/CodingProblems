/*

Question:
	You are given an array of distinct integers arr and an array of 
	integer arrays pieces, where the integers in pieces are distinct. 
	Your goal is to form arr by concatenating the arrays in pieces in any order.
	However, you are not allowed to reorder the integers in each array pieces[i].

	Return true if it is possible to form the array arr from pieces. Otherwise, return false.
	 
	Example 1:

		Input: arr = [15,88], pieces = [[88],[15]]
		Output: true
		Explanation: Concatenate [15] then [88]

	Example 2:

		Input: arr = [49,18,16], pieces = [[16,18,49]]
		Output: false
		Explanation: Even though the numbers match, we cannot reorder pieces[0].

	Example 3:

		Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
		Output: true
		Explanation: Concatenate [91] then [4,64] then [78]

	Constraints:

		1 <= pieces.length <= arr.length <= 100
		sum(pieces[i].length) == arr.length
		1 <= pieces[i].length <= arr.length
		1 <= arr[i], pieces[i][j] <= 100
		
		The integers in arr are distinct.
		The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).
*/

//Solution:
//Solution Complexity:
//	Time Complexity: O(arr.length+pieces.length)
//	Space Complexity: O(pieces.length)

import java.util.*;

class Solution{
	public boolean canFormArray(int[] arr, int[][] pieces){
		//Store pieces' 0th row elements as key along with their row indices as the corresponding values in a hashmap named table

		HashMap<Integer,Integer> table=new HashMap<Integer,Integer>();
		
		for(int i=0;i<pieces.length;i++){
			table.put(pieces[i][0],i);
		}

		//Traverse arr from left to right
		int rowIndex=0,colIndex=0;
		boolean rowTraverse=false; //indicates if we are accessing a row of pieces (reffered to as piece)

		for(int i=0;i<arr.length;i++){
			if(rowTraverse){// if we are accessing a piece then
				
				if(colIndex < pieces[rowIndex].length){		//check if there exists more piece elements
					
					if(pieces[rowIndex][colIndex] != arr[i]){

					//if a piece is being accessed but its individual 
					//elements do not match with the current element 
					//of arr then the current piece should not be used 
					//and as we donot have extra pieces (see constraints) to match the current subarray.
						return false;
					}

					colIndex++; //to match the next piece elements
				}
				else{	//if we have used the piece
					rowTraverse=false;
					i--;	//the current element of arr needs to be matched thus
						//save the pointer in the same position for the next iteration
				}
			}
			else{ //if we are not using a piece

				if(table.containsKey(arr[i])){	//if arr[i] exists as the first element of a row
					rowIndex = table.get(arr[i]);
					colIndex = 0;
					rowTraverse = true;
					i--;	//same logic as before
				}
				else{
				
				//it is not possible to form arr with pieces as 
				//there exists no row with which the current element can be matched.
					return false;
				}
			}
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] arr = {91,4,64,78};
		int[][] pieces = {{78},{4,64},{91}};

		System.out.println(ob.canFormArray(arr,pieces));
	}
}
