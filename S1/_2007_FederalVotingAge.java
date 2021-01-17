import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2007_FederalVotingAge
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            System.out.println((y > 1989 || (y == 1989 && m > 2) || (y == 1989 && m == 2 && d > 27) ? "No" : "Yes"));
        }
    }
}
