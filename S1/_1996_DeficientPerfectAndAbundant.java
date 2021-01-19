//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1996_DeficientPerfectAndAbundant
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(br.readLine());

            int sum = 0;

            for(int k = 1; k <= num / 2; k++)
                if(num % k == 0) sum += k;

            System.out.print(num + " is ");
            System.out.print(sum < num ? "a deficient" : sum > num ? "an abundant" : "a perfect");
            System.out.print(" number.\n");
        }
    }
}