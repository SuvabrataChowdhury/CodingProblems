import java.util.*;

class Solution{
	public boolean isBoomerang(int[][] points){
		int m1=(points[1][1]-points[0][1])*(points[2][0]-points[0][0]);
		int m2=(points[2][1]-points[0][1])*(points[1][0]-points[0][0]);

		if(m1!=m2)
			return true;
		else
			return false;
	}
}

class Main{
	public static void main(String[] args){
		int[][] points={{1,1},{2,2},{3,3}};

		Solution ob=new Solution();

		System.out.println(ob.isBoomerang(points));
	}
}
