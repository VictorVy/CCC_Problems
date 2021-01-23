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

        int num = n / d;
        int rem = n % d;

        int gcf = 1;

        for(int i = Math.min(rem, d); i > 0; i--)
        {
            if(rem % i == 0 && d % i == 0)
            {
                gcf = i;
                break;
            }
        }

        System.out.println((num == 0 && rem != 0 ? "" : num + " ") + (rem == 0 ? "" : rem / gcf + "/" + d / gcf));
    }
}