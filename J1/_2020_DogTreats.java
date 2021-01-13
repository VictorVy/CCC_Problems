//solved

import java.io.*;

public class _2020_DogTreats
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int small = Integer.parseInt(br.readLine());
        int med = Integer.parseInt(br.readLine());
        int large = Integer.parseInt(br.readLine());

        boolean happy = small + med * 2 + large * 3 >= 10;

        System.out.println(happy ? "happy" : "sad");
    }
}