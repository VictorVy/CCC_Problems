//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class _2015_ZeroThatOut
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(br.readLine());

            if(num == 0)
            {
                list.removeLast();
                continue;
            }

            list.addLast(num);
        }

        if(list.size() == 0)
        {
            System.out.println(0);
            return;
        }

        int sum = 0;

        for(Integer integer : list)
            sum += integer;

        System.out.println(sum);
    }
}
