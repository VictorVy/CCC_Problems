//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2008_PenniesInTheRing
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true)
        {
            double radius = Integer.parseInt(br.readLine());
            if(radius == 0) break;

            int pennies = 0;

            for(double i = 1; i < radius; i++)
                pennies += (int)Math.floor(Math.sqrt(radius * radius - i * i));

            System.out.println(4 * pennies + 4 * (int)radius + 1);
        }
    }
}