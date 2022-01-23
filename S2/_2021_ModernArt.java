//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2021_ModernArt
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine()), n = Integer.parseInt(br.readLine());

        int[] rowStrokes = new int[r], columnStrokes = new int[c];

        for(int i = 0; i < n; i++)
        {
            String input = br.readLine();
            int pos = Integer.parseInt(input.substring(2)) - 1;

            if(input.charAt(0) == 'R') rowStrokes[pos]++;
            else columnStrokes[pos]++;
        }

        int count = 0;

        for(int y = 0; y < r; y++)
            for(int x = 0; x < c; x++)
                if((rowStrokes[y] + columnStrokes[x]) % 2 == 1) count++;

        System.out.println(count);
    }
}