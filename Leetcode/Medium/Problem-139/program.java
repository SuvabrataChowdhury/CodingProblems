class Solution
{
	public boolean wordBreak(String s, List<String> wordDict)
	{
		/* Step(s):-
			1. sort wordDict
			2. for i:=wordDict.length-1 to 0, steps=-1 do
				2.1 for j:=0 to s.length()-wordDict[i].length-1 do
					2.1.1 if s.substring(j,j+wordDict[i]) equals wordDict[i] then
						2.1.1.1 remove s.substring(j,j+wordDict[i]) from s;
					[End if]
				[End for]
			[End for]
			3. if s is NULL then 
				return true;
			else
				return false;
			[End if]
		*/
		
		Collections.sort(wordDict);
		
		int upLimit;
		for(int i=wordDict-1;i>=0;i--)
		{
			int j=0;
			while(j<=s.length()-wordDict[i].length()-1)
			{
				String temp=s.substring(j,j+wordDict[i].length())
				if(temp.equals(wordDict[i]))
				{
					
				}
			}
		}
	}
}
