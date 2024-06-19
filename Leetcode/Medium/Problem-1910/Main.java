import java.util.*;

class Solution{
	public String removeOccurrences(String s, String part){
		int lenS=s.length();
		int lenP=part.length();

		StringBuilder result=new StringBuilder();
		int ptr=0;

		for(int i=0;i<lenS;i++){
			result.append(s.charAt(i));
			int lenR=result.length();

			if(lenR>=lenP){
				if(part.equals(result.substring(lenR-lenP)))
					result.delete(lenR-lenP,lenR);
			}
		}

		return result.toString();
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(ob.removeOccurrences(args[0],args[1]));
	}
}
