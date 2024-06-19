import java.util.*;

class Solution{
	public int[] constructRectangle(int area){
		int length=area;
		int width=1;

		int[] result={length,width};
		int fact=2;

		int lim=(int) Math.sqrt(area);

		while(fact<=lim){
			if(area%fact==0){
				length=area/fact;
				width=fact;

				if(length<width)
					break;
			}

			fact++;

			result[0]=length;
			result[1]=width;
		}

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		System.out.println(Arrays.toString(ob.constructRectangle(Integer.parseInt(args[0]))));
	}
}
