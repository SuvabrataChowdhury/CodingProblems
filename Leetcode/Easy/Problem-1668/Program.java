import java.util.*;

class Solution
{
	public int maxRepeating(String sequence, String word)
	{
		int lengthSequence=sequence.length();
		int lengthWord=word.length();
		
		if(lengthWord>lengthSequence)
			return 0;
		if(lengthSequence==lengthWord)
		{
			if(word.equals(sequence))
				return 1;
			else
				return 0;
		}
		
		int i=0;
		int k=1;
		int maxK=0;
		String temp=word;
		while(lengthWord<=lengthSequence)
		{
			i=0;
			
			while(i+lengthWord<=lengthSequence)
			{
				if(temp.equals(sequence.substring(i,i+lengthWord)))
				{
					maxK=(maxK<k)?k:maxK;
					break;
				}
				i++;
			}
			
			k++;
			temp=temp+word;
			lengthWord=temp.length();
		}
		
		return maxK;
	}
}

class Program
{
	public static void main(String[] args)
	{
		Solution ob=new Solution();
		
		System.out.println(ob.maxRepeating(args[0],args[1]));
	}
}
