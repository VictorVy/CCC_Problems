//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2203_Poetry
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String s1 = getSyllable(br.readLine().toLowerCase()), s2 = getSyllable(br.readLine().toLowerCase()), s3 = getSyllable(br.readLine().toLowerCase()), s4 = getSyllable(br.readLine().toLowerCase());

            if(s1.equals(s2) && s2.equals(s3) && s3.equals(s4)) System.out.println("perfect");
            else if(s1.equals(s2) && s3.equals(s4)) System.out.println("even");
            else if(s1.equals(s3) && s2.equals(s4)) System.out.println("cross");
            else if(s1.equals(s4) && s2.equals(s3)) System.out.println("shell");
            else System.out.println("free");
        }
    }

    private static String getSyllable(String s)
    {
        s = s.substring(s.lastIndexOf(' ') + 1);

        int ai = s.lastIndexOf('a'), ei = s.lastIndexOf('e'), ii = s.lastIndexOf('i'), oi = s.lastIndexOf('o'), ui = s.lastIndexOf('u');

        int lastIndex = Math.max(ai, Math.max(ei, Math.max(ii, Math.max(oi, ui))));

        return (lastIndex == -1 ? s : s.substring(lastIndex));
    }
}
