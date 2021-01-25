//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1997_NastyNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(br.readLine());

            ArrayList<int[]> pairs = new ArrayList<>();

            for(int k = 1; k < num / 2; k++)
            {
                if(num % k == 0)
                    pairs.add(new int[]{k, num / k});
            }

            boolean nasty = false;

            for(int k = 0; k < pairs.size() - 1 && !nasty; k++)
            {
                for(int j = k + 1; j < pairs.size() && !nasty; j++)
                {
                    if(isNasty(pairs.get(k), pairs.get(j)))
                        nasty = true;
                }
            }

            System.out.println(num + " is " + (nasty ? "" : "not ") + "nasty");
        }
    }

    static boolean isNasty(int[] a, int[] b) { return (a[0] + a[1] == b[0] - b[1] || a[0] + a[1] == b[1] - b[0]) || (b[0] + b[1] == a[0] - a[1] || b[0] + b[1] == a[1] - a[0]); }
}