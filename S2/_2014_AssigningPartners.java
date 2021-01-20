//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _2014_AssigningPartners
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n % 2 != 0)
        {
            System.out.println("bad");
            return;
        }

        HashMap<String, String> partners = new HashMap<>(n);

        StringTokenizer ast = new StringTokenizer(br.readLine()), bst = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String a = ast.nextToken(), b = bst.nextToken();

            if((partners.containsKey(b) && !partners.get(b).equals(a)) || a.equals(b))
            {
                System.out.println("bad");
                return;
            }

            partners.put(a, b);
        }

        System.out.println("good");
    }
}