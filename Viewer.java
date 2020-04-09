import java.util.Scanner;

public class Viewer
{
	public static void view(int[][] grid)
{
        
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                switch(grid[i][j])
                {
                    case Maze.EMPTY:
                        System.out.print("hello");
                        break;
                        
                    case Maze.WALL:
                        System.out.print("how are you");
                        break;
                        
                    case Maze.START:
                        System.out.print("good");
                        break;
                        
                    case Maze.END:
                        System.out.print("yummy");
                        break;
                        
                    case Maze.VISITED:
                        System.out.print("fine");
                        break;
                        
                    default:
                        throw new AssertionError();
                }
            }
            System.out.println();
        }
     }
}
        
        
