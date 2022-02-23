import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2022_GoodGroups
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int mustSame = Integer.parseInt(br.readLine());
        HashMap<String, ArrayList<String>> sameCons = new HashMap<>(mustSame);

        for(int i = 0; i < mustSame; i++)
        {
            st = new StringTokenizer(br.readLine());
            String n1 = st.nextToken(), n2 = st.nextToken();
            if(!sameCons.containsKey(n1)) sameCons.put(n1, new ArrayList<>());
            sameCons.get(n1).add(n2);
        }

        int mustDiff = Integer.parseInt(br.readLine());
        HashMap<String, ArrayList<String>> diffCons = new HashMap<>(mustDiff);

        for(int i = 0; i < mustDiff; i++)
        {
            st = new StringTokenizer(br.readLine());
            String n1 = st.nextToken(), n2 = st.nextToken();
            if(!diffCons.containsKey(n1)) diffCons.put(n1, new ArrayList<>());
            diffCons.get(n1).add(n2);
        }

        int nGroups = Integer.parseInt(br.readLine()), count = 0;

        for(int i = 0; i < nGroups; i++)
        {
            st = new StringTokenizer(br.readLine());
            HashSet<String> set = new HashSet<>();

            while(st.hasMoreTokens())
                set.add(st.nextToken());

            for(String name : set)
            {
                if(sameCons.containsKey(name))
                {
                    ArrayList<String> cons = sameCons.get(name);
                    for(int k = 0; k < cons.size(); k++)
                    {
                        if(!set.contains(cons.get(k)))
                            count++;

                        cons.remove(cons.get(k));
                        k--;
                        if(cons.isEmpty()) sameCons.remove(name);
                    }
                }

                if(diffCons.containsKey(name))
                {
                    ArrayList<String> cons = diffCons.get(name);
                    for(int k = 0; k < cons.size(); k++)
                    {
                        if(set.contains(cons.get(k)))
                            count++;

                        cons.remove(cons.get(k));
                        k--;
                        if(cons.isEmpty()) sameCons.remove(name);
                    }
                }
            }
        }

        System.out.println(count);
    }
}