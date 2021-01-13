//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018_Sunflowers
{
    static int flowers;
    static int[][] measurements;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        flowers = Integer.parseInt(br.readLine());

        measurements = new int[flowers][flowers];

        for(int i = 0; i < flowers; i++)
        {
            String[] row = br.readLine().split(" ");

            for(int k = 0; k < flowers; k++)
                measurements[i][k] = Integer.parseInt(row[k]);
        }

        for(int i = 0; i < 4; i++)
        {
            if(check())
            {
                print();
                break;
            }
            else
                rotate();
        }
    }

    private static boolean check()
    {
        int rowInit = 0;

        for(int i = 0; i < flowers; i++)
        {
            //checks order of rows
            if(rowInit > measurements[i][0])
                return false;
            else
                rowInit = measurements[i][0];

            for(int k = 0; k < flowers - 1; k++)
            {
                //checks order of measurements
                if(measurements[i][k] > measurements[i][k + 1])
                    return false;
            }
        }

        return true;
    }

    private static void rotate()
    {
        int[][] rotated = new int[flowers][flowers];

        //assigns each row of measurements to column of new array
        for(int i = 0; i < flowers; i++)
        {
            for(int k = 0; k < flowers; k++)
                rotated[k][(flowers - 1) - i] = measurements[i][k];
        }

        measurements = rotated;
    }

    private static void print()
    {
        for(int i = 0; i < flowers; i++)
        {
            for(int k = 0; k < flowers; k++)
                System.out.print(measurements[i][k] + " ");

            System.out.print("\n");
        }
    }
}
