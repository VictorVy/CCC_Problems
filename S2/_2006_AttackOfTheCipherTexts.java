//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _2006_AttackOfTheCipherTexts
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String plainText = br.readLine(), cipher1 = br.readLine(), cipher2 = br.readLine();

        HashMap<Character, Character> map = new HashMap<>(plainText.length());

        for(int i = 0; i < plainText.length(); i++)
            map.put(cipher1.charAt(i), plainText.charAt(i));

        for(int i = 0; i < cipher2.length(); i++)
            System.out.print(map.getOrDefault(cipher2.charAt(i), '.'));
    }
}