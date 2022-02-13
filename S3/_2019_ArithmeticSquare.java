import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2019_ArithmeticSquare
{
    private static String[][] grid = new String[3][3];
    private static int[][] Xs = new int[2][3];

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int r = 0; r < 3; r++)
        {
            String[] row = br.readLine().split(" ");

            for(int c = 0; c < 3; c++)
            {
                grid[r][c] = row[c];
                if(row[c].equals("X"))
                {
                    Xs[0][r]++;
                    Xs[1][c]++;
                }
            }
        }

        for(int r = 0; r < 3; r++)
        {
            if(Xs[0][r] == 1)
            {
                if(grid[r][0].equals("X")) grid[r][0] = "" + (Integer.parseInt(grid[r][1]) * 2 - Integer.parseInt(grid[r][2]));
                else if(grid[r][1].equals("X")) grid[r][1] = "" + ((Integer.parseInt(grid[r][0]) + Integer.parseInt(grid[r][2])) / 2);
                else if(grid[r][2].equals("X")) grid[r][2] = "" + (Integer.parseInt(grid[r][1]) * 2 - Integer.parseInt(grid[r][0]));
            }
            else if(Xs[0][r] == 2)
            {
                int ind = grid[r][0].equals("X") ? (grid[r][1].equals("X") ? 2 : 1) : 0;
                Xs[0][r] = 0;

                if(ind == 0)
                {
                    Xs[1][1]--;
                    Xs[1][2]--;

                    for(int d = 0; d < 1000000001; d++)
                    {
                        String[][] tmp = grid.clone();
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][0]) + d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) + d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][0]) - d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) - d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                    }
                }
                else if(ind == 1)
                {
                    Xs[1][0]--;
                    Xs[1][2]--;

                    for(int d = 0; d < 1000000001; d++)
                    {
                        String[][] tmp = grid.clone();

                        tmp[r][0] = String.valueOf(Integer.parseInt(tmp[r][1]) - d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) + d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                        tmp[r][0] = String.valueOf(Integer.parseInt(tmp[r][1]) + d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) - d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                    }
                }
                else
                {
                    Xs[1][0]--;
                    Xs[1][1]--;

                    for(int d = 0; d < 1000000001; d++)
                    {
                        String[][] tmp = grid.clone();
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][2]) - d);
                        tmp[r][0] = String.valueOf(Integer.parseInt(tmp[r][1]) - d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][2]) + d);
                        tmp[r][0] = String.valueOf(Integer.parseInt(tmp[r][1]) + d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                    }
                }
            }
            else if(Xs[0][r] == 3)
            {
                Xs[1][0]--;
                Xs[1][1]--;
                Xs[1][2]--;

                for(int s = 1; s < 1000001; s++)
                {
                    for(int d = 0; d < 1000000001; d++)
                    {
                        String[][] tmp = grid.clone();
                        tmp[r][0] = "" + s;
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][0]) - d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) - d);

                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][0]) + d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) + d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }

                        tmp[r][0] = "" + -s;
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][0]) - d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) - d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                        tmp[r][1] = String.valueOf(Integer.parseInt(tmp[r][0]) + d);
                        tmp[r][2] = String.valueOf(Integer.parseInt(tmp[r][1]) + d);
                        if(!checkGridWrong(tmp))
                        {
                            grid = tmp.clone();
                            break;
                        }
                    }
                }
            }
        }

        for(int r = 0; r < 3; r++)
        {
            if(r != 0) System.out.print("\n");

            for(int c = 0; c < 3; c++)
                System.out.print(grid[r][c] + " ");
        }
    }

    private static boolean checkGridWrong(String[][] tmp)
    {
        return checkRCWrong(tmp[0], Xs[0][0]) || checkRCWrong(tmp[1], Xs[0][1]) || checkRCWrong(tmp[2], Xs[0][2]) ||
                checkRCWrong(new String[] {tmp[0][0], tmp[1][0], tmp[2][0]}, Xs[1][0]) ||
                checkRCWrong(new String[] {tmp[0][1], tmp[1][1], tmp[2][1]}, Xs[1][1]) ||
                checkRCWrong(new String[] {tmp[0][2], tmp[1][2], tmp[2][2]}, Xs[1][2]);
    }

    public static boolean checkRCWrong(String[] rc, int Xn)
    {
        if(Xn > 1) return false;
        if(Xn == 0) return Math.abs(Integer.parseInt(rc[1]) - Integer.parseInt(rc[0])) != Math.abs(Integer.parseInt(rc[2]) - Integer.parseInt(rc[1]));
        return rc[1].equals("X") && (Integer.parseInt(rc[0]) % 2 == 0) != (Integer.parseInt(rc[2]) % 2 == 0);
    }
}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class _2019_ArithmeticSquare
//{
//    static String[][] grid = new String[3][3];
//    private static int[][] Xs = new int[2][3];
//
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        for(int r = 0; r < 3; r++)
//        {
//            String[] row = br.readLine().split(" ");
//
//            for(int c = 0; c < 3; c++)
//            {
//                grid[r][c] = row[c];
//                if(row[c].equals("X"))
//                {
//                    Xs[0][r]++;
//                    Xs[1][c]++;
//                }
//            }
//        }
//
//        do { pass(); /* fills in rows/columns with only one 'X' */ }
//        while(Arrays.toString(grid[0]).contains("X") || Arrays.toString(grid[1]).contains("X") || Arrays.toString(grid[2]).contains("X"));
//
//        for(int r = 0; r < 3; r++)
//        {
//            System.out.print("\n");
//
//            for(int c = 0; c < 3; c++)
//                System.out.print(grid[r][c] + " ");
//        }
//    }
//
//    private static void pass()
//    {
//        for(int r = 0; r < 3; r++)
//        {
//            if(Xs[0][r] == 1)
//            {
//                if(grid[r][0].equals("X")) grid[r][0] = "" + (Integer.parseInt(grid[r][1]) * 2 - Integer.parseInt(grid[r][2]));
//                else if(grid[r][1].equals("X")) grid[r][1] = "" + ((Integer.parseInt(grid[r][0]) + Integer.parseInt(grid[r][2])) / 2);
//                else if(grid[r][2].equals("X")) grid[r][2] = "" + (Integer.parseInt(grid[r][1]) * 2 - Integer.parseInt(grid[r][0]));
//            }
//        }
//    }
//}