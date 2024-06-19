import java.util.*;

class Solution{
	public int averageValue(int[] nums){
		int sum=0;
		int count=0;

		for(int num:nums){
			if(num%6==0){
				sum+=num;
				count++;
			}
		}

		return (count>0)?(sum/count):sum;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		int[] nums={1,2,4,7,10};

		System.out.println(ob.averageValue(nums));
	}
}
