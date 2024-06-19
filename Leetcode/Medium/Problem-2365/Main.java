import java.util.*;

class Solution{
	public long taskSchedulerII(int[] tasks, int space){
		HashMap<Integer,Long> dayCount=new HashMap<Integer,Long>();

		long day=0;

		for(int i=0;i<tasks.length;i++){
			if(dayCount.containsKey(tasks[i])){
				day=Math.max(day,dayCount.get(tasks[i])+space)+1;
				
				dayCount.put(tasks[i],day);
			}
			else
				dayCount.put(tasks[i],++day);
		}

		return day;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[] tasks={5,8,8,5};
		int space=2;

		System.out.println(ob.taskSchedulerII(tasks,space));
	}
}
