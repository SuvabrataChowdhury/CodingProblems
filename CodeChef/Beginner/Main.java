import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	void solutionMethod(int n,int k){
		if(n<k){
			System.out.println(0);
			return ;
		}
		
		while(n<2*k)
			k--;
		int e=((n-1)*n/2)-((n-k-1)*(n-k)/2)+((k-1)*k/2)+((n-2*k)*k);
		
		if(e<0)
			System.out.println(0);
		else
			System.out.println(e);
	}
}

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				if(st.hasMoreTokens()){
					str = st.nextToken("\n");
				}
				else{
					str = br.readLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args)
	{
		Solution ob=new Solution();
		FastReader s = new FastReader();
		int t = s.nextInt();
		
		while (t-- > 0) {
			int n = s.nextInt();
			int k=s.nextInt();
			
			ob.solutionMethod(n,k);
		}
	}
}
