import java.util.*;

class Solution{
	public boolean canVisitAllRooms(List<List<Integer>> rooms){
		int[] keySet=new int[rooms.size()];
		
		Set<Integer> keys=new HashSet<Integer>();
		keys.add(0);
		
		int index=0;
		List<Integer> ob=rooms.get(0);
		
		if(ob==null)
			return false;
		else{
			for(Integer num:ob){
				keys.add(num);
				keySet[index++]=num;
			}
			
			for(int i=0;i<index;i++){
				ob=rooms.get(keySet[i]);
				
				if(ob!=null){
					for(Integer num:ob){
						if(!keys.contains(num)){
							keys.add(num);
							keySet[index++]=num;
						}
					}
				}
			}
			
			
			for(int i=1;i<keySet.length;i++){
				if(!keys.contains(i))
					return false;
			}
			
			return true;
		}
	}
}

class program{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Solution ob=new Solution();
		List<List<Integer>> rooms=new ArrayList<>();
		
		for(int i=0;i<2;i++){
			List<Integer> temp=new ArrayList<Integer>();
			for(int j=0;j<2;j++){
				temp.add(sc.nextInt());
			}
			
			rooms.add(temp);
		}
		
		System.out.println(ob.canVisitAllRooms(rooms));
	}
}
