import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _2020_EscapeRoom
{
    static int r, c;
    static ArrayList<ArrayList<int[]>> cells;
    static boolean[][] covered;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        cells = new ArrayList<>(1000001);
        covered = new boolean[r][c];

        for(int i = 0; i < 1000001; i++)
            cells.add(new ArrayList<>());

        for(int y = 1; y <= r; y++)
        {
            st = new StringTokenizer(br.readLine());

            for(int x = 1; x <= c; x++)
                cells.get(Integer.parseInt(st.nextToken())).add(new int[]{y, x});
        }

        System.out.println(escapable(r, c) ? "yes" : "no");
    }

    static boolean escapable(int y, int x)
    {
        if(y == 1 && x == 1) return true;
        covered[y - 1][x - 1] = true;

        for(int[] next : cells.get(y * x))
        {
            if(!covered[next[0] - 1][next[1] - 1])
            {
                covered[next[0] - 1][next[1] - 1] = true;
                if(escapable(next[0], next[1])) return true;
            }
        }

        return false;
    }
}
