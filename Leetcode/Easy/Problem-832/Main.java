import java.util.*;

class Solution{
	public int[][] flipAndInvertImage(int[][] image){
		int[][] result=new int[image.length][image.length];

		for(int i=0;i<image.length;i++){
			for(int j=0,k=image.length-1;k>=0;k--,j++){
				result[i][j]=comp(image[i][k]);
			}
		}

		return result;
	}

	int comp(int num){
		return (num==1)?0:1;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob=new Solution();

		int[][] image={{1,1,0,0},{1,0,1,1},{0,0,0,1},{1,0,0,1}};

		int[][] result=new int[image.length][image.length];
		result=ob.flipAndInvertImage(image);

		for(int i=0;i<image.length;i++){
			for(int j=0;j<image.length;j++)
				System.out.print(result[i][j]);

			System.out.println("");
		}
	}
}
