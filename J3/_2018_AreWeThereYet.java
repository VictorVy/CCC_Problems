//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018_AreWeThereYet
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] distances = new int[5];
        distances[0] = 0;

        for(int i = 1; i < 5; i++)
            distances[i] = Integer.parseInt(input[i - 1]) + distances[i - 1];

        for(int i = 0; i < 5; i++)
        {
            System.out.print("\n");

            System.out.print(Math.abs(distances[i] - distances[0]) + " ");
            System.out.print(Math.abs(distances[i] - distances[1]) + " ");
            System.out.print(Math.abs(distances[i] - distances[2]) + " ");
            System.out.print(Math.abs(distances[i] - distances[3]) + " ");
            System.out.print(Math.abs(distances[i] - distances[4]));
        }
    }
}
