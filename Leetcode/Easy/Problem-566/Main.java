import java.util.*;

class Solution{
	public int[][] matrixReshape(int[][] mat, int r, int c){
		if(r*c == mat.length*mat[0].length){
			int[][] result = new int[r][c];

			for(int i=0;i<r*c;i++){
				result[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
			}

			return result;
		}
		
		return mat;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		int[][] mat = {
				{1,2,3},
				{4,5,6}
				};

		System.out.println(Arrays.deepToString(ob.matrixReshape(mat,3,2)));
	}
}
