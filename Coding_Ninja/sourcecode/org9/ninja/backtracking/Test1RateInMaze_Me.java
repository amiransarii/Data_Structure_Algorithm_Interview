package org9.ninja.backtracking;

public class Test1RateInMaze_Me {
	
	public static boolean ratInMaze(int maze[][]) {
		int path[][] = new int[maze.length][maze.length];
		
		return solveMaze(maze,0, 0, path);
	}
	
	
	public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
		//Check if i,j are valid pair of indices => i,j>=0
		
		int n = maze.length	;
		
		if(i <0 || j < 0 || i >=n || j >=n)
			return false;
		
		//if cell is already part of the path
		if(path[i][j] == 1)
			return false;
		
		//if the cell blocked  in maze(cell value =0)
		if(path[i][j] == 0)
			return false;
		
		//If all previous conditions fail, then the cell is a possible path
		//IInclude the cell in current path
		
		path[i][j] = 1;
		
		if(i == n-1 && j == n-1)
			return true;
		
		//Now, explore in all directions
		
       // Direction 1 - move towards cell above (top direction)
		if(solveMaze(maze, i-1, j, path)) 
			return true;	
		
		//Direction 2 - move towards cell to the right (right direction)
		if(solveMaze(maze, i, j+1, path))
			return true;
		
		//Direction 3 - move towards cell below (bottom direction)
		if(solveMaze(maze, i+1, j, path))
			return true;
		
		//Direction 4 - move towards cell to the left (left direction)
		
		if(solveMaze(maze, i, j-1, path))
			return true;
	
		//If none of the conditions are satisfied, then the path is not working out
				return false;
	}

}
