import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _2020_SearchingForStrings
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String needle = br.readLine();

        String haystack = br.readLine();


        if(needle.length() > haystack.length())
        {
            System.out.println("0");
            return;
        }

        int nHash = 0;
        int hHash = 0;
        int[] nChars = new int[26];
        int[] hChars = new int[26];

        for(int i = 0; i < needle.length(); i++) //creating char array for needle and haystack, and both hashes
        {
            char nChar = needle.charAt(i);
            char hChar = haystack.charAt(i);

            nChars[nChar - 97]++;
            hChars[hChar - 97]++;

            nHash += nChar;
            hHash += hChar;
        }

        HashSet<Integer> distinctPerms = new HashSet<>();

        if(nHash == hHash && arrEquals(nChars, hChars))
            distinctPerms.add(haystack.substring(0, needle.length()).hashCode());

        //searching haystack for permutations
        for(int i = 1; i <= haystack.length() - needle.length(); i++)
        {
            char prev = haystack.charAt(i - 1);
            char next = haystack.charAt(i + needle.length() - 1);

            //updating hash
            hHash -= prev;
            hHash += next;

            //updating array
            hChars[prev - 97]--;
            hChars[next - 97]++;

            //comparing needle and haystack arrays
            if(nHash == hHash && arrEquals(nChars, hChars))
                distinctPerms.add(haystack.substring(i, i + needle.length()).hashCode());
        }

        System.out.println(distinctPerms.size());
    }

    static boolean arrEquals(int[] a, int[] b) //is this better than Arrays.equals()??
    {
        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i]) return false;

        return true;
    }
}