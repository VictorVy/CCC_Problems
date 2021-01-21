//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2012_AromaticNumbers
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String aromatic = br.readLine();

        int sum = 0;

        for(int i = 1; i <= aromatic.length() - 2; i += 2)
        {
            int coeff = Character.getNumericValue(aromatic.charAt(i - 1));
            int base = valueOf(aromatic.charAt(i));
            int nextBase = valueOf(aromatic.charAt(i + 2));


            sum += nextBase > base ? -base * coeff : base * coeff;
        }

        System.out.println(sum + Character.getNumericValue(aromatic.charAt(aromatic.length() - 2)) * valueOf(aromatic.charAt(aromatic.length() - 1)));
    }

    static int valueOf(char roman)
    {
        switch(roman)
        {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}
