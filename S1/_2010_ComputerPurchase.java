//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2010_ComputerPurchase
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n <= 1)
        {
            System.out.println(n == 1 ? br.readLine().split(" ")[0] : "");
            return;
        }

        ArrayList<ArrayList<String>> computers = new ArrayList<>(15257);

        for(int i = 0; i < 15257; i++)
            computers.add(i, new ArrayList<>());

        int high = 0, higher = 0;

        for(int i = 0; i < n; i++)
        {
            String[] line = br.readLine().split(" ");

            int val = 2 * Integer.parseInt(line[1]) + 3 * Integer.parseInt(line[2]) + Integer.parseInt(line[3]);
            computers.get(val).add(line[0]);

            if(val > higher)
            {
                high = higher;
                higher = val;
            }
            else if(val > high)
                high = val;
        }

        if(computers.get(higher).size() > 1)
        {
            String min = minString(computers.get(higher));
            System.out.println(min);
            computers.get(higher).remove(min);
            System.out.println(minString(computers.get(higher)));
            return;
        }

        System.out.println(minString(computers.get(higher)));
        System.out.println(minString(computers.get(high)));
    }

    static String minString(ArrayList<String> arr)
    {
        String min = arr.get(0);

        for(String s : arr)
            if(s.compareTo(min) < 0) min = s;

        return min;
    }
}