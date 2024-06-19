import java.util.*;

class Solution{
	public String maximumBinaryString(String binary){
		char[] arr=binary.toCharArray();
		char[] temp;

		int n=arr.length;

		for(int i=0;i<n;i++){
			if(arr[i]=='0'){
				temp=changeNthBit(arr,i);
				
				if(temp!=null){
					arr=temp;
				}
			}

			System.out.println(Arrays.toString(arr));
		}

		return new String(arr);
	}

	char[] changeNthBit(char[] arr,int n){
		if(n+1>=arr.length)
			return null;
		else{
			if(arr[n+1]!='0'){ //current bit cannot be changed
				char[] temp=changeNthBit(arr,n+1); //change the next bit

				if(temp!=null)
					arr=temp;
				else
					return arr;
			}

			//current bit can be changed
			//change function:
			//	"00"->"10",
			//	"10"->"01"
			if(arr[n+1]=='0'){
				if(arr[n]=='0')
					arr[n]='1';
				else{
					arr[n+1]='1';
					arr[n]='0';
				}
			}

			return arr;
		}
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(args[0]);

		System.out.println(ob.maximumBinaryString(args[0]));
	}
}
