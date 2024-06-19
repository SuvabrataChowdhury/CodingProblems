// Working program with FastReader 
import java.io.*;
import java.util.*; 

class Solution
{
	int solutionMethod(int x)
	{
		return (x>100)?(x-10):x;
	}
}

public class program { 
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
		FastReader s = new FastReader();
		Solution ob=new Solution();
		int n = s.nextInt(); 
		//int k = s.nextInt(); 
		//int count = 0; 
		while (n-- > 0) { 
			int x = s.nextInt(); 
			System.out.println(ob.solutionMethod(x));
		} 
	} 
}

