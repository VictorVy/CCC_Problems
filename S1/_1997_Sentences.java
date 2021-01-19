//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1997_Sentences
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int s, v, o;
        String[] subjects, verbs, objects;

        for(int i = 0; i < n; i++)
        {
            s = Integer.parseInt(br.readLine());
            v = Integer.parseInt(br.readLine());
            o = Integer.parseInt(br.readLine());

            subjects = new String[s];
            verbs = new String[v];
            objects = new String[o];

            for(int k = 0; k < s; k++)
                subjects[k] = br.readLine();
            for(int k = 0; k < v; k++)
                verbs[k] = br.readLine();
            for(int k = 0; k < o; k++)
                objects[k] = br.readLine();

            for(int a = 0; a < s; a++)
            {
                for(int b = 0; b < v; b++)
                {
                    for(int c = 0; c < o; c++)
                        System.out.print(subjects[a] + " " + verbs[b] + " " + objects[c] + ".\n");
                }
            }

            System.out.print("\n");
        }
    }
}
