//this problem sucks

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1999_Year2000
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens())
            {
                String word = st.nextToken();

                if(isDate(word)) System.out.print(replaceYear(word) + " ");
                else System.out.print(word + " ");
            }

            System.out.print("\n");
        }
    }

    static boolean isDate(String s)
    {
        if(s.contains("/") )
        {

        }
        else if(s.contains("."))
        {

        }
        else if(s.contains(" ,") &&
               (s.startsWith("January") ||
                s.startsWith("February") ||
                s.startsWith("March") ||
                s.startsWith("April") ||
                s.startsWith("May") ||
                s.startsWith("June") ||
                s.startsWith("July") ||
                s.startsWith("August") ||
                s.startsWith("September") ||
                s.startsWith("October") ||
                s.startsWith("November") ||
                s.startsWith("December")))
        {

        }

        return false;
    }

    static String replaceYear(String s)
    {
        return s;
    }
}
