//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018_OccupyParking
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int spaces = Integer.parseInt(br.readLine());

        String a = br.readLine();
        String b = br.readLine();

        int count = 0;

        for(int i = 0; i < spaces; i++)
        {
            if(a.charAt(i) == 'C' && b.charAt(i) == 'C')
                count++;
        }

        System.out.println(count);
    }
}
