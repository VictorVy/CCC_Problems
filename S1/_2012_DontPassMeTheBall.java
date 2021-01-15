import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2012_DontPassMeTheBall
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n <= 4)
        {
            System.out.println(n == 4 ? 1 : 0);
            return;
        }


    }
}
