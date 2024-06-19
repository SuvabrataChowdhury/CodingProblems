import java.util.*;

class Solution
{
	public List<String> simplifiedFractions(int n)
	{
		List<String> fraction=new ArrayList<String>();
		
		if(n==1)
		{
			return fraction;
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				for(int j=1;j<i;j++)
				{
					if(j<i&&gcd(j,i)==1)
						fraction.add(j+"/"+i);
				}
			}
		}
		
		return fraction;
	}
	
	int gcd(int p,int q)
	{
		if(q==0)
			return p;
		return gcd(q,p%q);
	}
}

class program
{
	public static void main(String[] args)
	{
		Solution ob=new Solution();
		
		List<String> fraction=ob.simplifiedFractions(Integer.parseInt(args[0]));
		
		for(String f:fraction)
			System.out.println(f+" ");
	}
}
