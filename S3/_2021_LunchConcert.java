//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2021_LunchConcert
{
    static int[] positions, times, ranges;
    static int n;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        positions = new int[n];
        times = new int[n];
        ranges = new int[n];

        int bot = 1000000000, top = 0;

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");

            positions[i] = Integer.parseInt(input[0]);
            times[i] = Integer.parseInt(input[1]);
            ranges[i] = Integer.parseInt(input[2]);

            bot = Math.min(bot, positions[i]);
            top = Math.max(top, positions[i]);
        }

        System.out.println(binSearch(bot, top));
    }

    private static long binSearch(int bot, int top)
    {
        int mid = (bot + top) / 2;
        long midT = calcTime(mid), botT = calcTime(mid - 1), topT = calcTime(mid + 1);

        if(botT >= midT && midT <= topT) return midT;
        if(botT < midT) return binSearch(bot, mid - 1);
        return binSearch(mid + 1, top);
    }

    private static long calcTime(int pos)
    {
        long time = 0;

        for(int i = 0; i < n; i++)
            time += (long) times[i] * Math.max(0, Math.abs(positions[i] - pos) - ranges[i]);

        return time;
    }
}
