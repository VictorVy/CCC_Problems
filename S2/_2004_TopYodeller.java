//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2004_TopYodeller
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());

        int[] scores = new int[y], ranks = new int[y], worstRanks = new int[y];

        for(int i = 0; i < r; i++)
        {
            st = new StringTokenizer(br.readLine());

            //updating scores
            for(int k = 0; k < y; k++)
                scores[k] += Integer.parseInt(st.nextToken());

            //updating ranks and worst ranks
            for(int k = 0; k < y; k++)
            {
                int p = 1;

                for(int j = 0; j < y; j++)
                    if(scores[k] < scores[j]) p++;

                worstRanks[k] = Math.max(worstRanks[k], p);
                ranks[k] = p;
            }
        }

        for(int i = 0; i < y; i++)
            if(ranks[i] == 1) System.out.println("Yodeller " + (i + 1) + " is the TopYodeller: score " + scores[i] + ", worst rank " + worstRanks[i]);
    }
}