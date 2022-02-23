//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2022_GoodFoursAndGoodFives
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = n / 5; i > 0; i--)
            if(i * 5 == n || (n - i * 5) % 4 == 0) count++;

        if(n % 4 == 0) count++;

        System.out.println(count);
    }
}
