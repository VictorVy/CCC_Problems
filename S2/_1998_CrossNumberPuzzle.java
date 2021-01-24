//solved

public class _1998_CrossNumberPuzzle
{
    public static void main(String[] args)
    {
        for(int i = 1000; i <= 9999; i++)
        {
            int sum = 0;

            for(int k = 1; k <= i / 2; k++)
                if(i % k == 0) sum += k;

            if(sum == i) System.out.print(i + " ");
        }

        System.out.print("\n");

        for(int i = 100; i <= 999; i++)
        {
            String number = String.valueOf(i);

            int sum = 0;

            for(int k = 0; k < number.length(); k++)
                sum += Math.pow(Character.getNumericValue(number.charAt(k)), 3);

            if(sum == i) System.out.print(i + " ");
        }
    }
}
