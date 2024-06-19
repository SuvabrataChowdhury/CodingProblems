import java.util.*;

class Solution{
	public String oddString(String[] words){
		int[] diff;
		int[] tempDiff;

		diff=findDiff(words[0]);

		for(int i=1;i<words.length;i++){
			tempDiff=findDiff(words[i]);

			if(!isSame(diff,tempDiff)){
				if(i==1){
					break;
				}
				else
					return words[i];
			}
		}
		
		int[] newDiff=findDiff(words[2]);
		return isSame(newDiff,diff)?words[1]:words[0];
	}

	int[] findDiff(String str){
		int len=str.length();
		int[] diff=new int[len-1];

		for(int i=1;i<len;i++){
			diff[i-1]=(int)(str.charAt(i)-str.charAt(i-1));
		}

		return diff;
	}

	boolean isSame(int[] arr1,int[] arr2){
		for(int i=0;i<arr1.length;i++){
			if(arr1[i]!=arr2[i])
				return false;
		}

		return true;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.oddString(args));
	}
}
