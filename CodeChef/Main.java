import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{	
	void solutionMethod(int num, int diff){
		
		if(diff>=0 && diff<=num-2){
			if(diff == 0){
				for(int i=1;i<=num;i++)
					System.out.print(i+" ");
				
				System.out.println();
				return ;
			}
			
			int shift = diff+1;
			int shiftIndex = num - shift;

			if(shiftIndex == 1){
				System.out.print(num+" ");

				for(int i=1;i<=num-1;i++){
					System.out.print(i+" ");
				}
				System.out.println();
			}
			else{
				int printNum = 1;

				for(int i=1;i<=num;i++){
					if(i==shiftIndex){
						System.out.print(num+" ");
					}
					else{
						System.out.print(printNum+" ");
						printNum++;
					}
				}
				System.out.println();

			}

			return ;
		}

		System.out.println("-1");
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
		
		//ob.solutionMethod(t);
		//Input begins...
		
		while (t-- > 0) {
			int n = s.nextInt();
			int x = s.nextInt();

			ob.solutionMethod(n,x);
		}
	}
}
