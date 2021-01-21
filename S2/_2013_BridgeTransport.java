//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2013_BridgeTransport
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());
        int[] cars = new int[n];

        for(int i = 0; i < n; i++)
            cars[i] = Integer.parseInt(br.readLine());

        int sum = 0;

            for(int i = 0; i < n; i++)
            {
                sum += cars[i];
                if(i >= 4) sum -= cars[i - 4];

                if(sum > max)
                {
                    System.out.println(i);
                    return;
                }
        }

        System.out.println(n);
    }
}
