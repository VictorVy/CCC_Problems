//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2016_Ragaman
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String rag = br.readLine();

        int l = str.length();

        int[] strArr = new int[26];

        for(int i = 0; i < l; i++)
            strArr[str.charAt(i) - 97]++;

        int astCount = 0;

        for(int i = 0; i < l; i++)
        {
            char chr = rag.charAt(i);

            if(chr == '*')
            {
                astCount++;
                continue;
            }

            strArr[chr - 97]--;
            if(strArr[chr - 97] < 0)
            {
                System.out.println("N");
                return;
            }
        }

        System.out.println(astCount == sum(strArr) ? "A" : "N");
    }

    static int sum(int[] arr)
    {
        int count = 0;

        for(int i = 0; i < 26; i++)
            count += arr[i];

        return count;
    }
}
