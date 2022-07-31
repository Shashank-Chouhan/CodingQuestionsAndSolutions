import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int row, int col, String psf) {
        if(row<0 || col<0 || row==maze.length || col == maze[0].length || maze[row][col]==1)
            return;
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(psf);
            return;
        }

        maze[row][col] = 1;
        floodfill(maze, row-1, col, psf+"t");//top
        floodfill(maze, row, col-1, psf+"l");//left
        floodfill(maze, row+1, col, psf+"d");//down
        floodfill(maze, row, col+1, psf+"r");//right

        maze[row][col] = 0; 


    }
}