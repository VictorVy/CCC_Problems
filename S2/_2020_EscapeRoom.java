//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _2020_EscapeRoom
{
    private static int r, c;

    private static int[][] room;
    private static boolean[][] visited;

    private static ArrayList<ArrayList<int[]>> factors = new ArrayList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        room = new int[r][c];
        visited = new boolean[r][c];

        for(int i = 0; i < 1000001; i++)
            factors.add(new ArrayList<>());

        for(int y = 0; y < r; y++)
        {
            st = new StringTokenizer(br.readLine());

            for(int x = 0; x < c; x++)
            {
                room[y][x] = Integer.parseInt(st.nextToken());
                int n = (y + 1) * (x + 1);
                factors.get(n).add(new int[] {(y + 1), (x + 1)});
            }
        }

        System.out.println(search(0, 0) ? "yes" : "no");
    }

    private static boolean search(int y, int x)
    {
        if(y == r - 1 && x == c - 1) return true;
        if(visited[y][x]) return false;
        visited[y][x] = true;

        for(int[] coords : factors.get(room[y][x]))
            if(search(coords[0] - 1, coords[1] - 1)) return true;

        return false;
    }
}
