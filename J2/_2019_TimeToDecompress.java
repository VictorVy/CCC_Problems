//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2019_TimeToDecompress
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(br.readLine());

        for(int i = 0; i < lines; i++)
        {
            System.out.print("\n");

            String line = br.readLine();
            int num = Integer.parseInt(line.substring(0, line.indexOf(' ')));
            char chr = line.charAt(line.length() - 1);

            for(int k = 0; k < num; k++)
                System.out.print(chr);
        }
    }
}
