//solved

import java.io.*;

public class _2020_Art
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int points = Integer.parseInt(br.readLine());

        int minX = 100, minY = 100, maxX = 0, maxY = 0;

        for(int i = 0; i < points; i++)
        {
            String line = br.readLine();
            int x = Integer.parseInt(line.substring(0, line.indexOf(',')));
            int y = Integer.parseInt(line.substring(line.indexOf(',') + 1));

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        minX--;
        minY--;
        maxX++;
        maxY++;

        System.out.println(minX + "," + minY);
        System.out.println(maxX + "," + maxY);
    }
}
