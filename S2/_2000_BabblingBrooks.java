//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2000_BabblingBrooks
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Float> streams = new ArrayList<>(n);

        for(int i = 0; i < n; i++)
            streams.add((float)Integer.parseInt(br.readLine()));

        while(true)
        {
            int input = Integer.parseInt(br.readLine());

            if(input == 77) break;

            if(input == 88)
            {
                int stream = Integer.parseInt(br.readLine());

                streams.set(stream, streams.get(stream) + streams.get(stream - 1));
                streams.remove(stream - 1);
            }
            else if(input == 99)
            {
                int stream = Integer.parseInt(br.readLine());
                float leftPercent = Integer.parseInt(br.readLine());

                streams.add(stream - 1, streams.get(stream - 1) * (leftPercent / 100));
                streams.set(stream, streams.get(stream) * ((100 - leftPercent)) / 100);
            }
        }

        for(float f : streams)
            System.out.print((int)f + " ");
    }
}
