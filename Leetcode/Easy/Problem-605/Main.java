/*
Question:

	You have a long flowerbed in which some of the plots are planted, 
	and some are not. However, flowers cannot be planted in adjacent plots.

	Given an integer array flowerbed containing 0's and 1's, where 0 means empty 
	and 1 means not empty, and an integer n, return true if n new flowers can be 
	planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

	Example 1:

		Input: flowerbed = [1,0,0,0,1], n = 1
		Output: true

	Example 2:

		Input: flowerbed = [1,0,0,0,1], n = 2
		Output: false

	Constraints:

	    1 <= flowerbed.length <= 2 * 104
	    flowerbed[i] is 0 or 1.
	    There are no two adjacent flowers in flowerbed.
	    0 <= n <= flowerbed.length
*/

import java.util.*;

class Solution{
	public boolean canPlaceFlowers(int[] flowerbed, int n){
		for(int i=0;i<flowerbed.length;i++){
			if(flowerbed[i]==1){
				i++;
			}
			else{
				if(i==flowerbed.length-1)
					n--;
				else{
					if(flowerbed[i+1]==0){
						i++;
						n--;
					}
				}
			}
		}

		return (n>0)?false:true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] flowerbed={1,0,0,0,0};
		int n=2;

		System.out.println(ob.canPlaceFlowers(flowerbed,n));
	}
}
