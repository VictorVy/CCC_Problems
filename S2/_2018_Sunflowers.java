import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2018_Sunflowers
{
    static int n;
    static int[][] data;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        data = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());

            for(int k = 0; k < n; k++)
                data[i][k] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < 4; i++)
        {
            if(checkData() && data[0][0] < data[1][0])
            {
                printData();
                break;
            }

            rotateData();
        }
    }

    static boolean checkData()
    {
        for(int i = 0; i < n; i++)
            for(int k = 0; k < n - 1; k++)
                if(data[i][k] > data[i][k + 1]) return false;

        return true;
    }

    static void printData()
    {
        for(int i = 0; i < n; i++)
        {
            for(int k = 0; k < n; k++)
                System.out.print(data[i][k] + " ");

            System.out.print("\n");
        }
    }

    static void rotateData()
    {
        int[][] rotated = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int k = 0; k < n; k++)
                rotated[k][n - i - 1] = data[i][k];

        data = rotated;
    }
}