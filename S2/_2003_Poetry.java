//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2003_Poetry
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String s1 = br.readLine().toLowerCase();
            String s2 = br.readLine().toLowerCase();
            String s3 = br.readLine().toLowerCase();
            String s4 = br.readLine().toLowerCase();

            s1 = s1.contains(" ") ? s1.substring(s1.lastIndexOf(' ')) : s1;
            s2 = s2.contains(" ") ? s2.substring(s2.lastIndexOf(' ')) : s2;
            s3 = s3.contains(" ") ? s3.substring(s3.lastIndexOf(' ')) : s3;
            s4 = s4.contains(" ") ? s4.substring(s4.lastIndexOf(' ')) : s4;

            s1 = containsVowel(s1) ? s1.substring(s1.lastIndexOf(lastVowel(s1))) : s1;
            s2 = containsVowel(s2) ? s2.substring(s2.lastIndexOf(lastVowel(s2))) : s2;
            s3 = containsVowel(s3) ? s3.substring(s3.lastIndexOf(lastVowel(s3))) : s3;
            s4 = containsVowel(s4) ? s4.substring(s4.lastIndexOf(lastVowel(s4))) : s4;

            String form;

            if(s1.equals(s2) && s2.equals(s3) && s3.equals(s4)) form = "perfect";
            else if(s1.equals(s2) && s3.equals(s4)) form = "even";
            else if(s1.equals(s3) && s2.equals(s4)) form = "cross";
            else if(s1.equals(s4) && s2.equals(s3)) form = "shell";
            else form = "free";

            System.out.println(form);
        }
    }

    static boolean containsVowel(String s) { return s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u"); }

    static char lastVowel(String s)
    {
        for(int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);

            if(ch == 'a') return 'a';
            if(ch == 'e') return 'e';
            if(ch == 'i') return 'i';
            if(ch == 'o') return 'o';
            if(ch == 'u') return 'u';
        }

        return 'z';
    }
}
