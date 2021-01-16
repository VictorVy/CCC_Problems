//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _2008_ItsColdHere
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean done = false;

        HashMap<Integer, String> cities = new HashMap<>();

        int coldest = 200;

        while(!done)
        {
            String line = br.readLine();

            String name = line.substring(0, line.indexOf(' '));
            int temp = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

            coldest = Math.min(coldest, temp);

            cities.put(temp, name);

            if(name.equals("Waterloo")) done = true;
        }

        System.out.println(cities.get(coldest));
    }
}
