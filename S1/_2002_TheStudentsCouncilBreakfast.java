//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2002_TheStudentsCouncilBreakfast
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pink = Integer.parseInt(br.readLine());
        int green = Integer.parseInt(br.readLine());
        int red = Integer.parseInt(br.readLine());
        int orange = Integer.parseInt(br.readLine());
        int amount = Integer.parseInt(br.readLine());

        int count = 0, min = Integer.MAX_VALUE;

        for(int p = 0; p * pink <= amount; p++)
        {
            for(int g = 0; g * green <= amount; g++)
            {
                for(int r = 0; r * red <= amount; r++)
                {
                    for(int o = 0; o * orange <= amount; o++)
                    {
                        if(p * pink + g * green + r * red + o * orange == amount)
                        {
                            System.out.println("# of PINK is " + p + " # of GREEN is " + g + " # of RED is " + r + " # of ORANGE is " + o);
                            count++;
                            min = Math.min(min, p + g + r + o);
                        }
                    }
                }
            }
        }

        System.out.println("Total combinations is " + count + ".");
        System.out.println("Minimum number of tickets to print is " + min + ".");
    }
}