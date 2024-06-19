import java.util.*;

class Solution
{
	int mA=1,mB=1,mC=1;
	
	public int nthUglyNumber(int n, int a, int b, int c)
	{
		int sol=0;
		
		Solution ob=new Solution();
		int i=0;
		while(i<=n)
		{
			prevSol==sol;
			sol=ob.min(a*this.mA,b*this.mB,c*this.mC);
			
			System.out.println(sol);
			
			if(sol==a*mA)
				this.mA=this.mA+1;
			else if(sol==b*mB)
				this.mB=this.mB+1;
			else
				this.mC=this.mC+1;
			
			i++;
		}
		
		return sol;
	}
	
	public int min(int num1,int num2,int num3)
	{
		if((num1<=num2)&&(num1<=num3))
			return num1;
		else if((num2<=num1)&&(num2<=num3))
			return num2;
		else
			return num3;
	}
}

class Program
{
	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int a=Integer.parseInt(args[1]);
		int b=Integer.parseInt(args[2]);
		int c=Integer.parseInt(args[3]);
		
		Solution ob=new Solution();
		System.out.println(ob.nthUglyNumber(n,a,b,c));
	}
}
