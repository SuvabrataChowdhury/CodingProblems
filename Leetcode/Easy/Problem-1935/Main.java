import java.util.*;

class Solution{
	public int canBeTypedWords(String text, String brokenLetters){
		int len1=text.length();
		int len2=brokenLetters.length();

		Set<Character> table=new HashSet<Character>();

		//creation of lookup table
		for(int i=0;i<len2;i++){
			table.add(brokenLetters.charAt(i));
		}

		int f=0;
		int count=0;
		for(int i=0;i<len1;i++){
			if(text.charAt(i)==' '){
				if(f==0)
					count++;
				f=0;
				continue;
			}

			if(table.contains(text.charAt(i))){
				f=1;
			}

			//System.out.println(f);
		}

		return (f==0)?(count+1):count;
	}
}

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		Solution ob=new Solution();
		
		String str1=sc.next();
		String str2=sc.next();

		System.out.println(ob.canBeTypedWords(str1,str2));
	}
}
