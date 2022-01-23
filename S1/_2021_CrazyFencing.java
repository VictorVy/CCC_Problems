//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2021_CrazyFencing
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double area = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stH = new StringTokenizer(br.readLine()), stW = new StringTokenizer(br.readLine());

        int pH = Integer.parseInt(stH.nextToken());

        for(int i = 0; i < n; i++)
        {
            int h = Integer.parseInt(stH.nextToken());
            area += Integer.parseInt(stW.nextToken()) * (pH + h) / 2.0;
            pH = h;
        }

        String output = String.valueOf(area);
        System.out.println(output.endsWith(".0") ? output.substring(0, output.length() - 2) : output);
    }
}