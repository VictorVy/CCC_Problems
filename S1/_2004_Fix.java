//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2004_Fix
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0;i < n; i++)
        {
            String a = br.readLine(), b = br.readLine(), c = br.readLine();

            System.out.println(free(a, b) && free(b, c) && free(a, c) ? "Yes" : "No");
        }
    }

    static boolean free(String a, String b) { return !a.startsWith(b) && !b.startsWith(a) && !a.endsWith(b) && !b.endsWith(a); }
}