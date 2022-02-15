//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2002_FractionAction
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), d = Integer.parseInt(br.readLine());

        if(n % d == 0)
        {
            System.out.println(n / d);
            return;
        }

        int m = Math.min(n, d);
        for(int i = m / 2; i > 1; i--)
        {
            if(n % i == 0 && d % i == 0)
            {
                n /= i;
                d /= i;
                break;
            }
        }

        int q = n / d;
        n -= q * d;

        System.out.println((q == 0 ? "" : q + " ") + n + "/" + d);
    }
}
