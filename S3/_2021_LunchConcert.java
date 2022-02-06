import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class _2021_LunchConcert
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        TreeMap<Integer, int[]> friends = new TreeMap<>();

        for(int i = 0; i < n; i++)
        {
            String[] input = br.readLine().split(" ");
            friends.put(Integer.parseInt(input[0]), new int[] {Integer.parseInt(input[1]), Integer.parseInt(input[2])});
        }

        long time = 0;
        TreeMap<Integer, Long> timeSumL = new TreeMap<>(), timeSumR = new TreeMap<>();
        timeSumL.put(friends.firstKey() - 1, 0L);

        for(Map.Entry<Integer, int[]> entry : friends.entrySet())
        {
            time += (long) entry.getValue()[0] * Math.max(0, Math.abs(entry.getKey() - friends.firstKey()) - entry.getValue()[1]);

            timeSumL.put(entry.getKey() + entry.getValue()[1], timeSumL.get(timeSumL.lowerKey(entry.getKey())) + entry.getValue()[0]);
//            timeSum.put(entry.getKey() + entry.getValue()[1], timeSum.get(friends.lowerKey(entry.getKey())) + entry.getValue()[0]);
        }

//        long minTime = time;
//
//        for(int i = friends.firstKey() + 1; i <= friends.lastKey(); i++)
//        {
//            time += timeSum.get(friends.lowerKey(i));
//            time -= timeSum.get(friends.lastKey()) - timeSum.get(friends.lowerKey(i));
//            System.out.println(time);
//            minTime = Math.min(minTime, time);
//        }
//
//        System.out.println(minTime);
    }
}