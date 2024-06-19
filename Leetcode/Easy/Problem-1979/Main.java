import java.util.*;

class Solution{
	public int findGCD(int[] nums){
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		for(int i=0;i<nums.length;i++){
			if(nums[i]>max)
				max=nums[i];
			if(nums[i]<min)
				min=nums[i];
		}

		return GCD(max,min);
	}

	//Euclid's algorithm
	int GCD(int num1,int num2){

		while(num2!=0){
			int temp=num1;
			num1=num2;
			num2=temp%num2;
        	}
		
        	return num1;
		
		/*if(num2==0)
			return num1;
		return GCD(num2,num1%num2);*/
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] nums={3,5,6,9,55};
		System.out.println(ob.findGCD(nums));
	}
}
