import java.util.*;

class Solution
{
	public String longestWord(String[] words)
	{
		Set<String> table=new HashSet<String>();
		Arrays.sort(words);
		
		int len=0;
		String result="";
		
		for(int i=0;i<words.length;i++)
		{
			len=words[i].length();
			
			if( (len==1) || ( table.contains( words[i].substring(0,len-1) ) ) )
			{
				table.add(words[i]);
				
				if(len>result.length())
					result=words[i];
			}
		}
		
		return result;
	}
}

//Driver code
//Give input as command line argument
class program
{
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.println("Wrong Input");
			return ;
		}
		
		Solution ob=new Solution();
		System.out.println(ob.longestWord(args));
	}
}
//End of driver code
