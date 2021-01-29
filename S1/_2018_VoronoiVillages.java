import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2018_VoronoiVillages
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] villages = new int[n];

        for(int i = 0; i < n; i++)
            villages[i] = Integer.parseInt(br.readLine());

        Arrays.sort(villages);

        double min = 1000000000;

        for(int i = 1; i < n - 1; i++)
            min = Math.min(min, (villages[i] - villages[i - 1]) / 2.0 + (villages[i + 1] - villages[i]) / 2.0);

        System.out.printf("%.1f", min);
    }
}