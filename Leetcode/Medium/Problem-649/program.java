import java.util.*;

class Solution{
	public String predictPartyVictory(String senate){
		Queue<Integer> q1=new LinkedList<Integer>();
		Queue<Integer> q2=new LinkedList<Integer>();
		
		int n=senate.length();
		
		for(int i=0;i<n;i++){
			if(senate.charAt(i)=='R')
				q1.add(i);
			else
				q2.add(i);
		}
		
		int Rindex,Dindex;
		
		while(!(q1.isEmpty()||q2.isEmpty())){
			Rindex=q1.poll();
			Dindex=q2.poll();
			
			if(Rindex<Dindex)
				q1.add(n+Rindex);
			else
				q2.add(n+Dindex);
		}
		
		return (q1.size()>q2.size())?"Radiant":"Dire";
	}
}

class program{
	public static void main(String[] args){
		Solution ob=new Solution();
		System.out.println(ob.predictPartyVictory(args[0]));
	}
}
