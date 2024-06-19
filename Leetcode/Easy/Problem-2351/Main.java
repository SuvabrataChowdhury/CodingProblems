import java.util.*;

class Solution{
	public char repeatedCharacter(String s){
		int len=s.length();
		Set <Character> table=new HashSet<Character>();

		char c=' ';

		for(int i=0;i<len;i++){
			c=s.charAt(i);
			if(table.contains(c))
				break;
			else
				table.add(c);
		}

		return c;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.repeatedCharacter(args[0]));
	}
}
