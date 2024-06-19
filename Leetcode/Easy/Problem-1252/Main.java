import java.util.*;

class Solution{
	public int oddCells(int m, int n, int[][] indices){
		boolean[][] matrix= new boolean[m][n];

		for(int i=0;i<indices.length;i++){
			for(int row=indices[i][0],col=0;col<n;col++){
				if(col==indices[i][1])
					continue;
				matrix[row][col]=!matrix[row][col];
			}

			for(int col=indices[i][1],row=0;row<m;row++){
				if(row==indices[i][0])
					continue;
				matrix[row][col]=!matrix[row][col];
			}
		}

		int count=0;

		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j])
					count++;
			}
		}

		return count;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();
		
		int indices[][]={{1,1},{0,0}};
		System.out.println(ob.oddCells(2,2,indices));
	}
}
