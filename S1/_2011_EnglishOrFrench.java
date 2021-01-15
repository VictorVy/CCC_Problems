//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2011_EnglishOrFrench
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int tCount = 0, sCount = 0;

        for(int i = 0; i < n; i++)
        {
            String line = br.readLine().toLowerCase();

            for(int k = 0; k < line.length(); k++)
            {
                if(line.charAt(k) == 't') tCount++;
                else if(line.charAt(k) == 's') sCount++;
            }
        }

        System.out.println(tCount > sCount ? "English" : "French");
    }
}
