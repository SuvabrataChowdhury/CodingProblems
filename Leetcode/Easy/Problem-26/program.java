import java.util.*;
//1 2 2
class Solution{
	public int removeDuplicates(int[] nums){
		int ptr1=1,ptr2=ptr1;
		int k=1;
		
		while(ptr2<nums.length){
			if(nums[ptr2-1]!=nums[ptr2]){
				nums[ptr1]=nums[ptr2];
				ptr1++;
				k++;
			}
			
			ptr2++;
		}
		
		/*for(int j=0;j<k;j++)
			System.out.print(nums[j]+" ");
		System.out.println("");*/
		
		return k;
	}
}

class program{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		int[] nums=new int[args.length];
		
		for(int i=0;i<args.length;i++)
			nums[i]=Integer.parseInt(args[i]);
		
		System.out.println("Hello");
		int k=ob.removeDuplicates(nums);
		System.out.println(k);
		
	}
}
