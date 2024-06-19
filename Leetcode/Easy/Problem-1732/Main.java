import java.util.*;

class Solution{
	public int largestAltitude(int[] gain){
		int altitude=0;
		int max=altitude;

		for(int i=0;i<gain.length;i++){
			altitude+=gain[i];

			if(altitude>max)
				max=altitude;
		}

		return max;
	}
}

class Main{
	public static void main(String[] args){
		int[] gain={-4,-3,-2,-1,4,3,2};

		Solution ob=new Solution();
		System.out.println(ob.largestAltitude(gain));
	}
}
