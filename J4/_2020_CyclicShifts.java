//solved

import java.io.*;

public class _2020_CyclicShifts
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String set = br.readLine();
        String sub = br.readLine();

        for(int i = 0; i < sub.length(); i++)
        {
            if(set.contains(sub))
            {
                System.out.println("yes");
                return;
            }

            sub = sub.substring(1) + sub.charAt(0);
        }

        System.out.println("no");
    }
}
