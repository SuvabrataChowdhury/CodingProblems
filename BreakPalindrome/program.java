import java.util.*;

class Solution
{
	public String breakPalindrome(String palindrome)
	{
		int length=palindrome.length();
		if(length==1)
			return "";//as a String with length 1 can not be changed to make it non
				//palindrome
		
		for(int i=0;i<(length/2);i++)//checking only half of the elements to reduce
		{					//no of operations
			if(palindrome.charAt(i)!='a')
			{
				palindrome=palindrome.substring(0,i)+"a"+palindrome.substring(i+1,length);
				return palindrome;
			}
		}
		
		//if the first half contains all a's then the last half will also contain all a's thus to make
		//the string non-palindrome and also lexicographically smallest, the last character needs to 
		//be changed to b
		palindrome=palindrome.substring(0,length-1)+"b";
		return palindrome;
	}
}

//driver code
//give input as a single command line argument and the input string must be a palindrome
class program
{
	public static void main(String[] args)
	{
		Solution ob=new Solution();
		
		System.out.println(ob.breakPalindrome(args[0]));
	}
}
//end of driver code
