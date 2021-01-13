//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2019_ColdCompress
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lines = Integer.parseInt(br.readLine());

        for(int i = 0; i < lines; i++)
        {
            System.out.print("\n");

            String line = br.readLine();

            int k = 0;
            while(k < line.length())
            {
                char chr = line.charAt(k);
                int num = 0;

                for(int s = k; s < line.length(); s++)
                {
                    if(line.charAt(s) == chr)
                    {
                        num++;

                        if(s == line.length() - 1)
                        {
                            k = line.length();
                            System.out.print(num + " " + chr + " ");
                            break;
                        }
                    }
                    else
                    {
                        k = s;
                        System.out.print(num + " " + chr + " ");
                        break;
                    }
                }
            }
        }
    }
}
