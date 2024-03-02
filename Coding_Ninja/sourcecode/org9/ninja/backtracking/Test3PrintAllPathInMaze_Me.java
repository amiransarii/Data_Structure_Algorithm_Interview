package org9.ninja.backtracking;

public class Test3PrintAllPathInMaze_Me {
	static void ratInAMaze(int maze[][], int n) {
		int path[][] = new int[maze.length][maze.length];
		solveMaze(maze,0,0,path, n);

	}

	private static void solveMaze(int[][] maze, int i, int j, int[][] path, int n) {
		
		//Check if i,j are valid pair of indices => i,j>=0
		
		if(i < 0 || j < 0 || i >= n || j >= n) {
			return ;
		}
		
		//If cell is already part of the path
		if(path[i][j] == 1)
			return;
		
		//If cell is blocked in maze (cell value=0)
		if(maze[i][j] == 0)
			return;
		
		//If all previous conditions fail, then the cell is a possible path
		//Include the cell in current path
		
		path[i][j] = 1;
		
		//If we have  reached ending point
		if(i == n-1  && j ==  n -1) {
			
			
			for(int row = 0;  row <n; row++) {
				for(int col = 0; col < n; col++) {
					System.out.print(path[row][col]+" ");
				}
			}
			path[i][j] = 0; //reset once you visited 
			System.out.println();
			return;
		}
        //Changing the recursive calls to find all the paths
		solveMaze(maze, i-1, j, path, n);
		solveMaze(maze, i, j+1, path, n);
		solveMaze(maze, i+1, j, path, n);
		solveMaze(maze, i, j-1, path, n);
		path[i][j]=0; //before retrurning reset it
		
		//If none of the conditions are satisfied, then the path is not working out
		return;
	}
}
