import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2001_KeepingScore
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String hand = br.readLine();

        int count = 0;
        int points = 0;
        int total = 0;

        System.out.print("Cards Dealt       Points\nClubs ");

        for(int i = 1; i < hand.length(); i++)
        {
            char card = hand.charAt(i);

            if(card == 'D')
            {
                if(count == 0) points += 3;
                else if(count == 1) points += 2;
                else if(count == 2) points++;
                System.out.print("      " + points + "\nDiamonds ");
                total += points;
                points = count = 0;
                continue;
            }
            if(card == 'H')
            {
                if(count == 0) points += 3;
                else if(count == 1) points += 2;
                else if(count == 2) points++;
                System.out.print("      " + points + "\nHearts ");
                total += points;
                points = count = 0;
                continue;
            }
            if(card == 'S')
            {
                if(count == 0) points += 3;
                else if(count == 1) points += 2;
                else if(count == 2) points++;
                System.out.print("      " + points + "\nSpades ");
                total += points;
                points = count = 0;
                continue;
            }

            if(card == 'A') points += 4;
            else if(card == 'K') points += 3;
            else if(card == 'Q') points += 2;
            else if(card == 'J') points += 1;

            System.out.print(card + " ");
            count++;
        }

        total += points;
        System.out.println("        " + points + "\n                Total " + total);
    }
}
