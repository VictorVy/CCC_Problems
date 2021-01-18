//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2000_SlotMachines
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int quarters = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());

        int counter = 0;
        int count = 0;

        while(quarters-- > 0)
        {
            counter++;
            count++;

            if(counter == 1)
                a++;
            else if(counter == 2)
                b++;
            else if(counter == 3)
            {
                c++;
                counter = 0;
            }

            if(a == 35)
            {
                quarters += 30;
                a = 0;
            }
            if(b == 100)
            {
                quarters += 60;
                b = 0;
            }
            if(c == 10)
            {
                quarters += 9;
                c = 0;
            }
        }

        System.out.println("Martha plays " + count + " times before going broke.");
    }
}
