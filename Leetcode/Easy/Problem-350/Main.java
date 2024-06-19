import java.util.*;

class Solution{
	public int[] intersect(int[] nums1, int[] nums2){
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int ptr1=0;
		int ptr2=0;
		
		int j=0;
		int[] result=new int[1000];

		while(ptr1<nums1.length&&ptr2<nums2.length){
			if(nums1[ptr1]<nums2[ptr2])
				ptr1++;
			else if(nums2[ptr2]<nums1[ptr1])
				ptr2++;
			else{
				result[j++]=nums1[ptr1];
				ptr1++;
				ptr2++;
			}
		}
		
		return Arrays.copyOfRange(result,0,j);
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Solution ob=new Solution();
		
		int size1=Integer.parseInt(args[0]);
		int size2=Integer.parseInt(args[1]);

		int[] nums1=new int[size1];
		int[] nums2=new int[size2];
	
		System.out.println("Enter the first Array");	
		for(int i=0;i<size1;i++)
			nums1[i]=sc.nextInt();
	
		System.out.println("Enter the Second Array");
		for(int i=0;i<size2;i++)
			nums2[i]=sc.nextInt();

		int[] nums3=ob.intersect(nums1,nums2);

		System.out.println("The resultant array is:");
		for(int i=0;i<nums3.length;i++)
			System.out.println(nums3[i]);
	}
}
