//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2009_LightsGoingOnAndOff
{
    static int r, c;
    static ArrayList<boolean[]> combinations = new ArrayList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        boolean[][] lights = new boolean[r][c];

        for(int y = 0; y < r; y++)
        {
            st = new StringTokenizer(br.readLine());

            for(int x = 0; x < c; x++)
                lights[y][x] = st.nextToken().equals("1");
        }

        combinations.add(lights[r - 1]);

        for(int i = r - 1; i > 0; i--)
        {
            boolean[][] sub = Arrays.copyOfRange(lights, i - 1, r);

            for(int k = 1; k < r - i + 1; k++)
                sub[k] = pushButton(sub[k - 1], sub[k]);

            if(isUnique(sub[r - i]))
                combinations.add(sub[r - i]);
        }

        System.out.println(combinations.size());
    }

    static boolean[] pushButton(boolean[] top, boolean[] bot)
    {
        boolean[] xor = new boolean[c];

        for(int i = 0; i < c; i++)
            xor[i] = top[i] != bot[i];

        return xor;
    }

    static boolean isUnique(boolean[] arr)
    {
        for(boolean[] combo : combinations)
            if(Arrays.equals(combo, arr)) return false;

        return true;
    }
}
