//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2009_CoolNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = (int)Math.ceil(Math.pow(a, 1.0 / 6.0)); i * i * i * i * i * i <= b; i++)
            count++;

        System.out.println(count);
    }
}