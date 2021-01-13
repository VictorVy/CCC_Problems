//solved

import java.io.*;

public class _2020_Epidemiology
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limit = Integer.parseInt(br.readLine());
        int num = Integer.parseInt(br.readLine());
        int ph = num;
        int rate = Integer.parseInt(br.readLine());
        int out = 0;

        for(int i = 0; num <= limit; i++)
        {
            num += ph * rate;
            ph *= rate;
            out++;
        }

        System.out.println(out);
    }
}
