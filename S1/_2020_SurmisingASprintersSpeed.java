//solved

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class _2020_SurmisingASprintersSpeed
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        TreeMap<Integer, Integer> map = new TreeMap<>();

        int lTime = -1;
        int lPos = 0;

        for(int i = 0; i < length; i++)
        {
            String line = br.readLine();

            map.put(Integer.parseInt(line.substring(0, line.indexOf(' '))), Integer.parseInt(line.substring(line.indexOf(' ') + 1)));
        }

        double maxSpeed = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (lTime != -1)
            {
                double timeDiff = Math.abs(lTime - entry.getKey());
                double posDiff = Math.abs(lPos - entry.getValue());

                maxSpeed = Math.max(maxSpeed, posDiff / timeDiff);

            }

            lTime = entry.getKey();
            lPos = entry.getValue();
        }

        System.out.println(maxSpeed);
    }
}