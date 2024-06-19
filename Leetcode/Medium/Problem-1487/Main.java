import java.util.*;

class Solution{
	public String[] getFolderNames(String[] names){
		Set<String> table=new HashSet<String>();
		int freq=0;
		
		for(int i=0;i<names.length;i++){
			if(table.contains(names[i])){
				freq++;

				StringBuilder sb=new StringBuilder(names[i]);
				sb.append("(");
				sb.append(freq);
				sb.append(")");
				
				while(table.contains(sb.toString())){
					freq++;

					sb=new StringBuilder(names[i]);
					sb.append("(");
					sb.append(freq);
					sb.append(")");

					table.add(sb.toString());
				}

				names[i]=sb.toString();
			}

			freq=0;
			table.add(names[i]);
		}
		
		System.out.println(Arrays.toString(names));	

		return names;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		String[] names={"pes","pes(2)","pes(1)","pes","pes(3)"};

		System.out.println(ob.getFolderNames(names));
	}
}
