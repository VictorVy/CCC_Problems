import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2022_GoodSamples
{
    static ArrayList<Integer> piece;
    static int n, m, k;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if(k < n)
        {
            System.out.println(-1);
            return;
        }

        piece = new ArrayList<>(n);
        for(int i = 0; i < n; i++)
            piece.add(1);

        int g = findGood();
        while(g != k)
        {
            if(g < findGood()) g = lower();
            else g = raise();
            System.out.println(g);
//            if(g == raise()) break;
        }

        System.out.print(piece.get(0));
        for(int i = 1; i < n; i++)
            System.out.print(" " + piece.get(i));
    }

    public static int findGood()
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            for(int k = i + 1; k <= n; k++)
            {
                HashSet<Integer> hs = new HashSet<>(piece.subList(i, k));
                if(hs.size() == k - i)
                    list.add(new ArrayList<>(piece.subList(i, k)));
            }
        }

        return list.size();
    }

    public static int lower()
    {
        for(int i = 0; i < n; i++)
        {
            if(piece.get(i) > 1)
            {
                piece.set(i, piece.get(i) - 1);
                break;
            }
        }

        return findGood();
    }

    public static int raise()
    {
        for(int i = 0; i < n - 1; i++)
        {
            if(piece.get(i).equals(piece.get(i + 1)) && piece.get(i + 1) < m)
            {
                piece.set(i + 1, piece.get(i + 1) + 1);
                break;
            }
        }

        return findGood();
    }
}