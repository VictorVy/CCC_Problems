import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2019_RuleOfThree
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String l1  = br.readLine();
        String l2 = br.readLine();
        String l3 = br.readLine();

        String[] r1 = {l1.substring(0, l1.indexOf(' ')), l1.substring(l1.indexOf(' ') + 1)};
        String[] r2 = {l2.substring(0, l2.indexOf(' ')), l2.substring(l2.indexOf(' ') + 1)};
        String[] r3 = {l3.substring(0, l3.indexOf(' ')), l3.substring(l3.indexOf(' ') + 1)};

        String line = br.readLine();
        int limit = Integer.parseInt(line.substring(0, 2).trim());
        String init = line.substring(2, line.lastIndexOf(' ')).trim();
        String goal = line.substring(line.lastIndexOf(' ') + 1);

        for(int i = 0; i < goal.length(); i++)
        {
            ArrayList<String> steps = new ArrayList<>();

            for(int k = 0; k < limit; k++)
            {
                
            }
        }
    }
}
