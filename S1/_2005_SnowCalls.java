//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2005_SnowCalls
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String line = br.readLine();

            int count = 0;
            for(int k = 0; count < 10; k++)
            {
                if(line.charAt(k) == '-')
                    continue;

                if(count == 3 || count == 6) System.out.print("-");
                System.out.print(num(line.charAt(k)));

                count++;
            }

            System.out.print("\n");
        }
    }

    static int num(char chr)
    {
        if(chr == '1' || chr == '2' || chr == '3' || chr == '4' || chr == '5' || chr == '6' || chr == '7' || chr == '8' || chr == '9' || chr == '0')
            return Integer.parseInt(String.valueOf(chr));
        if(chr == 'A' || chr == 'B' || chr == 'C')
            return 2;
        if(chr == 'D' || chr == 'E' || chr == 'F')
            return 3;
        if(chr == 'G' || chr == 'H' || chr == 'I')
            return 4;
        if(chr == 'J' || chr == 'K' || chr == 'L')
            return 5;
        if(chr == 'M' || chr == 'N' || chr == 'O')
            return 6;
        if(chr == 'P' || chr == 'Q' || chr == 'R' || chr == 'S')
            return 7;
        if(chr == 'T' || chr == 'U' || chr == 'V')
            return 8;
        if(chr == 'W' || chr == 'X' || chr == 'Y' || chr == 'Z')
            return 9;

        return -1;
    }
}