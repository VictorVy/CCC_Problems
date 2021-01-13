//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2017_SumGame
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] swifts = br.readLine().split(" ");
        String[] semaphores = br.readLine().split(" ");

        int swiftsCount = 0;
        int semaphoresCount = 0;

        int day = 0;

        for(int i = 0; i < n; i++)
        {
            swiftsCount += Integer.parseInt(swifts[i]);
            semaphoresCount += Integer.parseInt(semaphores[i]);

            if(swiftsCount == semaphoresCount)
                day = i + 1;
        }

        System.out.println(day);
    }
}