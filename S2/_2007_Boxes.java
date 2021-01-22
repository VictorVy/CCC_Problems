//solved

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2007_Boxes
{
    static int[][] boxes;
    static int largest = 0;

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boxes = new int[n][3];

        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            boxes[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            largest = Math.max(largest, boxes[i][0] * boxes[i][1] * boxes[i][2]);
        }

        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());

            int answer = smallestBox(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

            System.out.println(answer != -1 ? answer : "Item does not fit.");
        }
    }

    static int smallestBox(int l, int w, int h)
    {
        int smallest = largest;
        boolean fits = false;

        for(int[] box : boxes)
        {
            if(fits(box, l, w, h))
            {
                smallest = Math.min(smallest, box[0] * box[1] * box[2]);
                fits = true;
            }
        }

        return fits ? smallest : -1;
    }

    static boolean fits(int[] box, int l, int w, int h)
    {
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 3; k++)
            {
                if(k == i) continue;
                for(int j = 0; j < 3; j++)
                {
                    if(j == i || j == k) continue;
                    if(l <= box[i] && w <= box[j] && h <= box[k]) return true;
                }
            }
        }

        return false;

//        return (l <= box[0] && w <= box[1] && h <= box[2]) || (h <= box[0] && l <= box[1] && w <= box[2]) || (w <= box[0] && h <= box[1] && l <= box[2]);
    }
}
