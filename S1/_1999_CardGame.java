//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1999_CardGame
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aPts = 0, bPts = 0;

        String[] cards = new String[52];
        ArrayList<Integer> indices = new ArrayList<>(12);

        for(int i = 0; i < 52; i++)
        {
            String card = br.readLine();

            cards[i] = card;

            if(isHigh(card)) indices.add(i);
        }

        for(Integer i : indices)
        {
            int lim = 1;

            if(cards[i].equals("queen"))lim = 2;
            else if(cards[i].equals("king")) lim = 3;
            else if(cards[i].equals("ace")) lim = 4;

            if(i >= 52 - lim) break;

            boolean addPts = true;

            for(int k = 1; k <= lim; k++)
            {
                if(isHigh(cards[i + k]))
                {
                    addPts = false;
                    break;
                }
            }

            if(addPts)
            {
                if(i % 2 == 0) aPts += lim;
                else bPts += lim;

                System.out.print("Player ");
                System.out.print(i % 2 == 0 ? "A " : "B ");
                System.out.print("scores " + lim + " point(s).\n");
            }
        }

        System.out.println("Player A: " + aPts + " point(s).\nPlayer B: " + bPts + " point(s).");
    }

    static boolean isHigh(String card) { return card.equals("jack") || card.equals("queen") || card.equals("king") || card.equals("ace"); }
}