//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class _2016_TandemBicycle
{
    static boolean type;
    static int n;
    static int[] dmoj;
    static Integer[] peg;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        type = br.readLine().equals("1");

        n = Integer.parseInt(br.readLine());

        StringTokenizer dst = new StringTokenizer(br.readLine()), pst = new StringTokenizer(br.readLine());
        dmoj = new int[n];
        peg = new Integer[n];

        for(int i = 0; i < n; i++)
        {
            dmoj[i] = Integer.parseInt(dst.nextToken());
            peg[i] = Integer.parseInt(pst.nextToken());
        }

        Arrays.sort(dmoj);
        if(type) Arrays.sort(peg);
        else Arrays.sort(peg, Collections.reverseOrder());

        System.out.println(solve());
    }

    static int solve()
    {
        int speed = 0;

        for(int i = 0; i < n; i++)
            speed += Math.max(dmoj[i], peg[i]);

        return speed;
    }
}