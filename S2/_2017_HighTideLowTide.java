import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2017_HighTideLowTide
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] data = new int[n];

        for(int i = 0; i < n; i++)
            data[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(data);

        int centre = n % 2 == 0 ? n / 2 - 1 : n / 2;

        for(int i = 0; i < n / 2; i++)
            System.out.print(data[centre - i] + " " + data[centre + i + 1] + " ");

        if(n % 2 != 0) System.out.print(data[0]);
    }
}