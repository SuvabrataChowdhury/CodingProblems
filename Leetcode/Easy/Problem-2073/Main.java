import java.util.*;

class Solution{
	public int timeRequiredToBuy(int[] tickets, int k){
		//int lim=0;

		/*if(tickets[k]==1)
			lim=k;
		else
			lim=tickets.length-1;*/

		int time=0;
		int f=0;
		for(int i=0;i<tickets.length;i++){
			if(tickets[i]<=tickets[k])
				time+=tickets[i];
			else{
				time+=tickets[k];
			}
		}
		
		int noOfMax=0;

		for(int i=k+1;i<tickets.length;i++)
			noOfMax=(tickets[i]>=tickets[k])?noOfMax+1:noOfMax;

		return time-noOfMax;
	}
}

class Main{
	public static void main(String[] args){
		int[] tickets={84,49,5,24,70,77,87,8};
		int k=3;

		Solution ob=new Solution();

		System.out.println(ob.timeRequiredToBuy(tickets,k));
	}
}
