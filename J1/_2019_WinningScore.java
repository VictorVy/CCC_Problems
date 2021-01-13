//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2019_WinningScore
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int apples = Integer.parseInt(br.readLine()) * 3 +
                    Integer.parseInt(br.readLine()) * 2 +
                    Integer.parseInt(br.readLine());

        int bananas = Integer.parseInt(br.readLine()) * 3 +
                    Integer.parseInt(br.readLine()) * 2 +
                    Integer.parseInt(br.readLine());

        if(apples > bananas)
            System.out.println("A");
        else if(bananas > apples)
            System.out.println("B");
        else
            System.out.println("T");
    }
}
