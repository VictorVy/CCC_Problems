//solved

import java.util.Arrays;
import java.util.Scanner;

public class _2017_HighTideLowTide
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] measures = new int[n];

        for(int i = 0; i < n; i++)
            measures[i] = sc.nextInt();

        Arrays.sort(measures);

        int mid = n % 2 == 0 ? n / 2 : n / 2 + 1;

        for(int i = 0; i < mid; i++)
        {
            if(i == mid - 1 && n % 2 != 0)
            {
                System.out.print(measures[0]);
                break;
            }

            System.out.print(measures[(mid - 1) - i] + " " + measures[mid + i] + " ");
        }
    }
}