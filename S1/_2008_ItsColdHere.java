//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class _2008_ItsColdHere
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<Integer, String> cities = new TreeMap<>();

        while(true)
        {
            String line = br.readLine();

            String name = line.substring(0, line.indexOf(' '));
            int temp = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

            cities.put(temp, name);

            if(name.equals("Waterloo")) break;
        }

        System.out.println(cities.firstEntry().getValue());
    }
}
