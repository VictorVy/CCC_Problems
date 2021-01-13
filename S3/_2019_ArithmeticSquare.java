import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2019_ArithmeticSquare
{
    static String[][] grid = new String[3][3];

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int r = 0; r < 3; r++)
        {
            String[] row = br.readLine().split(" ");

            for(int c = 0; c < 3; c++)
                grid[r][c] = row[c];
        }

        firstPass(); //fills in rows/columns with only one 'X'

        for(int r = 0; r < 3; r++)
        {
            System.out.print("\n");

            for(int c = 0; c < 3; c++)
                System.out.print(grid[r][c] + " ");
        }
    }

    private static void firstPass()
    {
        for(int r = 0; r < 3; r++)
        {
            for(int c = 0; c < 3; c++)
            {
                if(grid[r][c].equals("X"))
                {
                    int a, b;

                    //check row
                    if(c == 0 && !grid[r][1].equals("X") && !grid[r][2].equals("X"))
                    {
                        a = Integer.parseInt(grid[r][1]);
                        b = Integer.parseInt(grid[r][2]);

                        grid[r][c] = String.valueOf(a < b ? a - (b - a) / 2 : a + (a - b) / 2);
                    }
                    else if(c == 1 && !grid[r][0].equals("X") && !grid[r][2].equals("X"))
                    {
                        a = Integer.parseInt(grid[r][0]);
                        b = Integer.parseInt(grid[r][2]);

                        grid[r][c] = String.valueOf(a < b ? a + (b - a) / 2 : b + (a - b) / 2);
                    }
                    else if(c == 2 && !grid[r][0].equals("X") && !grid[r][1].equals("X"))
                    {
                        a = Integer.parseInt(grid[r][0]);
                        b = Integer.parseInt(grid[r][1]);

                        grid[r][c] = String.valueOf(a < b ? b + (b - a) / 2 : b - (a - b) / 2);
                    }
                }
            }
        }
    }
}
