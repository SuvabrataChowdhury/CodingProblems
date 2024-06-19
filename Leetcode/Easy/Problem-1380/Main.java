import java.util.*;

class Solution{
	public List<Integer> luckyNumbers (int[][] matrix){
		List<Integer> result=new ArrayList<Integer>();

		boolean f=true;

		for(int i=0;i<matrix.length;i++){
			int minIndex=0;

			for(int j=1;j<matrix[i].length;j++){
				if(matrix[i][j]<matrix[i][minIndex])
					minIndex=j;
			}

			for(int j=0;j<matrix.length;j++){
				if(matrix[j][minIndex]>matrix[i][minIndex]){
					f=false;
					break;
				}
			}

			if(f)
				result.add(matrix[i][minIndex]);
			else
				f=true;
				
		}

		//System.out.println(result);

		return result;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[][] matrix={{1,10,4,2},{9,3,8,7},{15,16,17,12}};

		System.out.println(ob.luckyNumbers(matrix));
	}
}
