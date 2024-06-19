import java.util.*;

class Solution{
	public int convertTime(String current, String correct){
		int hour1=0,minute1=0,hour2=0,minute2=0;

		for(int i=0;i<5;i++){
			if(i<2){
				hour1=hour1*10+current.charAt(i)-'0';
				hour2=hour2*10+correct.charAt(i)-'0';
			}
			
			if(i>2){
				minute1=minute1*10+current.charAt(i)-'0';
				minute2=minute2*10+correct.charAt(i)-'0';
			}
		}

		int time=(hour2-hour1)*60+(minute2-minute1);

		int opr=0;

		opr+=time/60;
		time%=60;
		
		opr+=time/15;
		time%=15;

		opr+=time/5;
		time%=5;

		return opr+time;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.convertTime(args[0],args[1]));
	}
}
