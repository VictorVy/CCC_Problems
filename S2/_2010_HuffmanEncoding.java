//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _2010_HuffmanEncoding
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        HashMap<Character, String> map = new HashMap<>(n);

        for(int i = 0; i < n; i++)
        {
            String line = br.readLine();

            map.put(line.charAt(0), line.substring(line.indexOf(' ') + 1));
        }

        String code = br.readLine();

        while(code.length() > 0)
        {
            for(Map.Entry<Character, String> entry : map.entrySet())
            {
                if(code.startsWith(entry.getValue()))
                {
                    System.out.print(entry.getKey());
                    code = code.substring(entry.getValue().length());
                }
            }
        }
    }
}
