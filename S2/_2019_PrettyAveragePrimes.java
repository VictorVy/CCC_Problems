//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2019_PrettyAveragePrimes
{
    //using prime sieve
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int largest = 0;

        //reading input
        int[] input = new int[size];
        for(int i = 0; i < size; i++)
        {
            input[i] = Integer.parseInt(br.readLine());
            largest = Math.max(largest, input[i]);
        }

        //creating prime sieve
        boolean[] primeSieve = new boolean[largest * 2];
        Arrays.fill(primeSieve, 2, largest * 2, true);
        for(int i = 2; i < primeSieve.length; i++)
        {
            if(primeSieve[i])
            {
                for(int k = 2; i * k < primeSieve.length; k++)
                    primeSieve[i * k] = false;
            }
        }

        //creating output
        for(int i = 0; i < size; i++)
        {
            int num = input[i];

            for(int k = 0; k < num / 2; k++)
            {
                int lesser = num - k;
                int greater = num + k;

                if(primeSieve[lesser] && primeSieve[greater] && (lesser + greater) / 2 == num)
                {
                    System.out.println(lesser + " " + greater);
                    break;
                }
            }
        }
    }
}
