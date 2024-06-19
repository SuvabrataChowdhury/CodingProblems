import java.util.*;

class Solution
{
	public int maxCoins(int[] piles)
	{
	//The given problem essentially asks us to find the sum of the second largest numbers in n
	// triplets in such a way that the sum is maximum.
	
	// Thus if we sort the array first and then find the sum of all the second largest elements
	//until we have piles.length/3 elements [Because there will be piles.length/3 no. of groups and
	//from each group I will get a pile] we will get the answer
	
		Arrays.sort(piles); //sorts piles
		
		int i=piles.length-2;
		int count=0;
		int sum=0;
		
		while(count!=(piles.length/3))
		{
			sum=sum+piles[i]; // gets the sum  of the second largest element
			
			count++;
			i-=2;
		}
		
		return sum;
	}
}

class program
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Solution ob=new Solution();
		
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		
		int[] piles= new int[n];
		
		System.out.println("Enter the array");
		for(int i=0;i<n;i++)
			piles[i]=in.nextInt();
		
		int myPart=ob.maxCoins(piles);
		System.out.println("My max share can be "+myPart);
	}
}
