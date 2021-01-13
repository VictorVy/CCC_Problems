//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2019_Flipper
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sequence = br.readLine();

        int[][] grid = {{1, 2}, {3, 4}};

        for(int i = 0; i < sequence.length(); i++)
        {
            if(sequence.charAt(i) == 'H')
                grid = new int[][]{{grid[1][0], grid[1][1]}, {grid[0][0], grid[0][1]}};
            else
                grid = new int[][]{{grid[0][1], grid[0][0]}, {grid[1][1], grid[1][0]}};
        }

        System.out.println(grid[0][0] + " " + grid[0][1] + "\n" + grid[1][0] + " " + grid[1][1]);
    }
}
