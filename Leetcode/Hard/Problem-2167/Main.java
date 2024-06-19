import java.util.*;

class Solution{
	public int minimumTime(String s){
		int cost=0;
		int len=s.length();
		int start=0,end=len-1;

		int ptr1=-1;
		boolean flag=false;

		for(int i=0;i<len;i++){
			if(s.charAt(i)=='1'&&!flag){
				ptr1=i;
				flag=true;
			}
			else{
				if(ptr1!=-1){
					
					flag=false;
	
					int startCost=(i-1)-start+1;
					int endCost=end-ptr1+1;
					int midCost=2*(i-1-ptr1+1);
	
					int minCost=min(startCost,endCost,midCost);
	
					if(minCost==startCost&&startCost==endCost){
						int count1=count1s(s,start,i-1);
						int count2=count1s(s,ptr1,end-1);
	
						if(count1>=count2)
							start=i;
						else
							end=i;
					}
					else if(minCost==startCost)
						start=i;
					else if(minCost==endCost)
						end=i;
					else
						start+=(midCost/2);
	
					cost+=minCost;
				}
			}
		}

		return cost;
	}

	int min(int num1,int num2,int num3){
		if(num1<num2&&num1<num3)
			return num1;
		else if(num2<num1&&num2<num3)
			return num2;
		else
			return num3;
	}

	int count1s(String s,int start,int end){
		int count=0;

		for(int i=start;i<=end;i++){
			if(s.charAt(i)=='1')
				count++;
		}

		return count;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.minimumTime(args[0]));
	}
}
