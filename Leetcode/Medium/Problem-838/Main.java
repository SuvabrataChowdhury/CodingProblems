import java.util.*;

class Solution{
	public String pushDominoes(String dominoes){
		char[] dArr=dominoes.toCharArray();

		int left=0;
		int right=0;

		while(right<dArr.length){
			if(dArr[left]=='R' && dArr[right]=='L'){
				if((right-left-1)%2==0){
					dArr=change(dArr,left+1,(left+right)/2+1,'R');
				}
				else{
					dArr=change(dArr,left+1,(left+right)/2,'R');
				}

				dArr=change(dArr,(left+right)/2+1,right,'L');
				left=right;
			}
			else if(dArr[left]==dArr[right] && (dArr[left]=='R' || dArr[left]=='L')){
				dArr=change(dArr,left+1,right,dArr[left]);

				left=right;
			}
			else{
				if(dArr[right]=='R')
					left=right;
				if(dArr[right]=='L'){
					dArr=change(dArr,left,right,dArr[right]);

					left=right;
				}
			}

			right++;

			//System.out.println(String.valueOf(dArr)+" "+left+" "+right);
		}

		if(dArr[left]=='R')
			dArr=change(dArr,left+1,right,dArr[left]);

		return String.valueOf(dArr);
	}

	char[] change(char[] arr,int start,int end,char val){ //changes values of arr from start to end-1 with val
		for(int i=start;i<end;i++)
			arr[i]=val;

		return arr;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.pushDominoes(args[0]));
	}
}
