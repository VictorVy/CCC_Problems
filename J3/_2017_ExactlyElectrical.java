//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2017_ExactlyElectrical
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();

        int moves = Integer.parseInt(br.readLine());

        int ax = Integer.parseInt(a.substring(0, a.indexOf(' ')));
        int ay = Integer.parseInt(a.substring(a.indexOf(' ') + 1));
        int bx = Integer.parseInt(b.substring(0, b.indexOf(' ')));
        int by = Integer.parseInt(b.substring(b.indexOf(' ') + 1));

        int distance = Math.abs(ax - bx) + Math.abs(ay - by);

        if(moves < distance)
            System.out.println("N");
        else if(moves == distance || (moves - distance) % 2 == 0)
            System.out.println("Y");
        else
            System.out.println("N");
    }
}