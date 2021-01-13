//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2018_VoronoiVillages
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        double minSize = 1000000000;
        int[] villages = new int[num];

        for(int i = 0; i < num; i++)
            villages[i] = Integer.parseInt(br.readLine());

        Arrays.sort(villages);

        for(int i = 1; i < num - 1; i++)
        {
            double size = (double) (villages[i] - villages[i - 1]) / 2 + (double) (villages[i + 1] - villages[i]) / 2;

            minSize = Math.min(minSize, size);
        }

        System.out.printf("%.1f%n", minSize);
    }
}
