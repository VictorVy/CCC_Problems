//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class _2013_From1987To2013
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pYear = Integer.parseInt(br.readLine());

        for(int i = pYear + 1; i <= 9876; i++)
        {
            if(isUnique(toArray(i)))
            {
                System.out.println(i);
                return;
            }
        }

        System.out.println(10234);
    }

    static Integer[] toArray(int i)
    {
        if(i >= 1000)
            return new Integer[] {i / 1000, (i / 100) % 10, (i % 100) / 10, i % 10};
        else if(i >= 100)
            return new Integer[] {(i / 100) % 10, (i % 100) / 10, i % 10};
        else if(i >= 10)
            return new Integer[] {(i % 100) / 10, i % 10};
        else
            return new Integer[] {i};
    }

    static boolean isUnique(Integer[] arr) { return new HashSet<>(Arrays.asList(arr)).size() == arr.length; }
}