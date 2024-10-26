package backtracking;

public class RatInAMaze {

	public static void ratInAMaze(int maze[][], int n){
		//int n = maze.length;
		int path[][] = new int[n][n];

		printAllPath(maze, 0, 0, path);

	}
	
	private static void printAllPath(int maze[][], int i, int j, int path[][]) {

		int n = maze.length;

		//check if i,j cell is valid or not
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1 )
			return;

		//include the cell in current path
		path[i][j] = 1;

		//destination cell
		if(i == n-1 && j == n-1) {
			for(int r=0; r<n; r++) {
				for(int c=0; c<n; c++) {
					System.out.print(path[r][c]+" ");
				}
				System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}

		//explore further in all directions
		//first direction - top
		printAllPath(maze, i-1, j, path);

		//second direction - right
		printAllPath(maze, i, j+1, path);
		
		//third direction - down
		printAllPath(maze, i+1, j, path);

		//fourth direction - left
		printAllPath(maze, i, j-1, path);
		
		path[i][j] = 0;
		
	}
	
	public static boolean ratInAMaze(int maze[][]){
		int n = maze.length;
		int path[][] = new int[n][n];

		return solveMaze(maze, 0, 0, path);
	}

	private static boolean solveMaze(int maze[][], int i, int j, int path[][]) {

		int n = maze.length;

		//check if i,j cell is valid or not
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1 )
			return false;

		//include the cell in current path
		path[i][j] = 1;

		//destination cell
		if(i == n-1 && j == n-1) {
			for(int r=0; r<n; r++) {
				for(int c=0; c<n; c++) {
					System.out.print(path[r][c]+" ");
				}
				//System.out.println();
			}
			
			return true;
		}

		//explore further in all directions
		//first direction - top
		if(solveMaze(maze, i-1, j, path))
			return true;
		//second direction - right
		if(solveMaze(maze, i, j+1, path))
			return true;
		//third direction - down
		if(solveMaze(maze, i+1, j, path))
			return true;
		//fourth direction - left
		if(solveMaze(maze, i, j-1, path))
			return true;
		
		return false;
	}
	
	

	public static void main(String[] args) {
		int maze[][] = {{1,1,0},
						{1,1,0},
						{1,1,1}};
		//boolean pathPossible = ratInAMaze(maze);
		//System.out.println(pathPossible);
		ratInAMaze(maze, maze.length);
	}

}
