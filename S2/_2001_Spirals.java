import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2001_Spirals
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());

        int n = b - a + 1;

        if(n == 1)
        {
            System.out.println(a);
            return;
        }

        int side = (int)Math.ceil(Math.sqrt(n));

        int[][] spiral = new int[side][side];

        int center = side % 2 == 0 ? side / 2 - 1 : side / 2;
        int counter = a, d = 1, r = 1, u = 2, l = 2;
        int x = center, y = center;

        spiral[y][x] = counter++;

        for(int k = 2; counter <= b; k++)
        {
            //down
            for(int i = 1; i <= d && counter <= b; i++)
                spiral[y + i][x] = counter++;
            y += d;
            //right
            for(int i = 1; i <= r && counter <= b; i++)
                spiral[y][x + i] = counter++;
            x += r;
            //up
            for(int i = 1; i <= u && counter <= b; i++)
                spiral[y - i][x] = counter++;
            y -= u;
            //left
            for(int i = 1; i <= l && counter <= b; i++)
                spiral[y][x - i] = counter++;
            x -= l;

            //updating limits
            d += 2;
            r += 2;
            u += 2;
            l += 2;
        }

        for(int w = 0; w < side; w++)
        {
            for(int z = 0; z < side; z++)
            {
                if(spiral[w][z] == 0)
                {
                    for(int i = 0; i <= String.valueOf(b).length(); i++)
                        System.out.print(" ");
                }
                else
                    System.out.print(spiral[w][z] + " ");
            }

            System.out.print("\n");
        }
    }
}