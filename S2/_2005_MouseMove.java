//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2005_MouseMove
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());

        int mx = 0, my = 0;

        while(true)
        {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

            if(x == 0 && y == 0) break;

            mx = mx + x < 0 ? 0 : Math.min(mx + x, c);
            my = my + y < 0 ? 0 : Math.min(my + y, r);

            System.out.println(mx + " " + my);
        }
    }
}
