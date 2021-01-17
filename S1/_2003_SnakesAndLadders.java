import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2003_SnakesAndLadders
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pos = 1;

        while(true)
        {
            int steps = Integer.parseInt(br.readLine());

            if(steps == 0)
            {
                System.out.println("You Quit!");
                return;
            }

            if(!(pos + steps > 100))
                pos = check(pos + steps);

            System.out.println("You are now on square " + pos);

            if(pos == 100)
            {
                System.out.println("You Win!");
                return;
            }
        }
    }

    static int check(int pos)
    {
        switch(pos)
        {
            case 54:
                pos = 19;
                break;
            case 90:
                pos = 48;
                break;
            case 99:
                pos = 77;
                break;
            case 9:
                pos = 34;
                break;
            case 40:
                pos = 64;
                break;
            case 67:
                pos = 86;
                break;
        }

        return pos;
    }
}
