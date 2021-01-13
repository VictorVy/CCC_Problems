//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018_TelemarketerOrNot
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String f = br.readLine();
        String a = br.readLine();
        String b = br.readLine();
        String l = br.readLine();

        if(!(f.equals("8") || f.equals("9")) || !a.equals(b) || !(l.equals("8") || l.equals("9")))
            System.out.println("answer");
        else
            System.out.println("ignore");
    }
}
