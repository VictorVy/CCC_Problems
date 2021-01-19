//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1998_Censor
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String line = br.readLine();

            st = new StringTokenizer(line);

            while(st.hasMoreTokens())
            {
                String word = st.nextToken();

                System.out.print(word.length() == 4 ? "**** " : word + " ");
            }

            System.out.print("\n");
        }
    }
}
