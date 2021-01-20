//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2015_Jerseys
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int j = Integer.parseInt(br.readLine()), a = Integer.parseInt(br.readLine());

        char[] jerseys = new char[j + 1];
        boolean[] taken = new boolean[j + 1];

        for(int i = 1; i <= j; i++)
            jerseys[i] = br.readLine().charAt(0);

        int count = 0;

        for(int i = 0; i < a; i++)
        {
            String line = br.readLine();

            char size = line.charAt(0);
            int num = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

            if(!taken[num] && jerseys[num] <= size)
            {
                count++;
                taken[num] = true;
            }
        }

        System.out.println(count);
    }
}
