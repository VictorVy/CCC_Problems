//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2006_Maternity
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String alice = br.readLine();
        String bob = br.readLine();

        boolean A = (Character.isUpperCase(alice.charAt(0)) && Character.isUpperCase(alice.charAt(1))) ||
                    (Character.isUpperCase(bob.charAt(0)) && Character.isUpperCase(bob.charAt(1)));
        boolean B = (Character.isUpperCase(alice.charAt(2)) && Character.isUpperCase(alice.charAt(3))) ||
                    (Character.isUpperCase(bob.charAt(2)) && Character.isUpperCase(bob.charAt(3)));
        boolean C = (Character.isUpperCase(alice.charAt(4)) && Character.isUpperCase(alice.charAt(5))) ||
                    (Character.isUpperCase(bob.charAt(4)) && Character.isUpperCase(bob.charAt(5)));
        boolean D = (Character.isUpperCase(alice.charAt(6)) && Character.isUpperCase(alice.charAt(7))) ||
                    (Character.isUpperCase(bob.charAt(6)) && Character.isUpperCase(bob.charAt(7)));
        boolean E = (Character.isUpperCase(alice.charAt(8)) && Character.isUpperCase(alice.charAt(9))) ||
                    (Character.isUpperCase(bob.charAt(8)) && Character.isUpperCase(bob.charAt(9)));

        boolean a = Character.isLowerCase(alice.charAt(0)) && Character.isLowerCase(alice.charAt(1)) && Character.isLowerCase(bob.charAt(0)) && Character.isLowerCase(bob.charAt(1));
        boolean b = Character.isLowerCase(alice.charAt(2)) && Character.isLowerCase(alice.charAt(3)) && Character.isLowerCase(bob.charAt(2)) && Character.isLowerCase(bob.charAt(3));
        boolean c = Character.isLowerCase(alice.charAt(4)) && Character.isLowerCase(alice.charAt(5)) && Character.isLowerCase(bob.charAt(4)) && Character.isLowerCase(bob.charAt(5));
        boolean d = Character.isLowerCase(alice.charAt(6)) && Character.isLowerCase(alice.charAt(7)) && Character.isLowerCase(bob.charAt(6)) && Character.isLowerCase(bob.charAt(7));
        boolean e = Character.isLowerCase(alice.charAt(8)) && Character.isLowerCase(alice.charAt(9)) && Character.isLowerCase(bob.charAt(8)) && Character.isLowerCase(bob.charAt(9));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String line = br.readLine();

            System.out.println(((Character.isUpperCase(line.charAt(0)) && a) || (Character.isLowerCase(line.charAt(0)) && A) ||
                                (Character.isUpperCase(line.charAt(1)) && b) || (Character.isLowerCase(line.charAt(1)) && B) ||
                                (Character.isUpperCase(line.charAt(2)) && c) || (Character.isLowerCase(line.charAt(2)) && C) ||
                                (Character.isUpperCase(line.charAt(3)) && d) || (Character.isLowerCase(line.charAt(3)) && D) ||
                                (Character.isUpperCase(line.charAt(4)) && e) || (Character.isLowerCase(line.charAt(4)) && E))
                                 ? "Not their baby!" : "Possible baby.");
        }
    }
}