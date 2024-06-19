import java.util.*;

class Solution{
	public int minNumberOfFrogs(String croakOfFrogs){
		int[] freq=new int[5];
		int frog=0;
		int result=0;

		for(char ch: croakOfFrogs.toCharArray()){
			switch(ch){
				case 'c':
					frog++;
					freq[0]++;
					break;
				case 'r':
					freq[1]++;

					if(freq[0]<freq[1])
						return -1;
					break;
				case 'o':
					freq[2]++;
					
					if(freq[1]<freq[2])
						return -1;
					break;
				case 'a':
					freq[3]++;

					if(freq[2]<freq[3])
						return -1;
					break;
				default:
					frog--;
					freq[4]++;

					if(freq[3]<freq[4])
						return -1;
			}

			if(result<frog)
				result=frog;
		}

		int temp=freq[0];

		for(int num:freq){
			if(num!=temp)
				return -1;
			temp=num;
		}

		return result;
	}

	/*boolean strictlyDecreasing(int[] arr){
		int temp=arr[0];

		for(int num: arr){
			if(temp<num)
				return false;
			temp=num;
		}

		return true;
	}*/
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.minNumberOfFrogs(args[0]));
	}
}
