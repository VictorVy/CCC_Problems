import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _2018_ChooseYourOwnPath
{
    static int size;
    static int steps = 0;
    static int shortest = -1;

    static HashMap<Integer, String[]> allPages = new HashMap<>();
    static HashMap<Integer, String[]> readPages = new HashMap<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());

        for(int i = 0; i < size; i++)
            allPages.put(i + 1, br.readLine().split(" "));

        read(1);

        if(readPages.size() == size)
            System.out.println("Y" + "\n" + shortest);
        else
            System.out.println("N" + "\n" + shortest);
    }

    private static void read(int pageN)
    {
        String[] pageInfo = allPages.get(pageN);

        if(shortest == -1)
            steps++;

        if(!readPages.containsKey(pageN))
            readPages.put(pageN, pageInfo);

        if(!pageInfo[0].equals("0"))
        {
            for(int i = 0; i < pageInfo.length - 1; i++)
            {
                pageInfo[0] = String.valueOf(Integer.parseInt(pageInfo[0]) - 1);
                readPages.put(pageN, pageInfo);

                read(Integer.parseInt(pageInfo[i + 1]));
            }
        }
        else if(shortest == -1)
            shortest = steps;
    }
}
