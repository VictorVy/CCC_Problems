//solved

import java.io.*;
import java.util.*;

public class _2020_EscapeRoom
{
    static BufferedReader br;

    static int sizeY, sizeX;

    static ArrayList<ArrayList<int[]>> cells;

    static boolean[][] covered;

    public static void main(String[] args) throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));

        sizeY = Integer.parseInt(br.readLine());
        sizeX = Integer.parseInt(br.readLine());

        cells = new ArrayList<>(1000001);
        covered = new boolean[sizeY][sizeX];

        for(int i = 0; i < 1000001; i++) //no generic arrays allowed :^(
            cells.add(new ArrayList<>());

        for(int r = 0; r < sizeY; r++) //parsing input
        {
            String[] line = br.readLine().split(" ");

            for(int c = 0; c < sizeX; c++)
                cells.get(Integer.parseInt(line[c])).add(new int[] {r + 1, c + 1});
        }

        System.out.println(findPath(sizeY, sizeX) ? "yes" : "no");
    }

    static boolean findPath(int r, int c)
    {
        for(int[] cell : cells.get(r * c))
        {
            if(cell[0] == 1 && cell[1] == 1) return true;
            if(covered[cell[0] - 1][cell[1] - 1]) return false;

            covered[cell[0] - 1][cell[1] - 1] = true;
            if(findPath(cell[0], cell[1])) return true;
        }

        return false;
    }
}