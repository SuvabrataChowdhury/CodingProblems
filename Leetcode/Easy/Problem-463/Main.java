import java.util.*;

class Solution{
	public int islandPerimeter(int[][] grid){
		int islands = 0, intersections = 0;

		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				//If cell is land then
				if(grid[i][j]==1){
					islands++;

					if(i<grid.length-1 && grid[i+1][j]==1)
						intersections++;

					if(j<grid[i].length-1 && grid[i][j+1]==1)
						intersections++;
				}
			}
		}
		
		return 4*islands - 2*intersections;
	}
}

class Main{
	public static void main(String[] args){
		Solution ob = new Solution();

		int[][] grid = {
				{0,1,0,0},
				{1,1,1,0},
				{0,1,1,0},
				{0,1,0,0}
				};

		System.out.println(ob.islandPerimeter(grid));
	}
}
