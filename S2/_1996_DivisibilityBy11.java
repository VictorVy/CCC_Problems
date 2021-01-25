import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1996_DivisibilityBy11
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
        {
            String num = br.readLine();
            String temp = num;

            System.out.println(num);

            while(temp.length() > 2)
            {
                int digit = Character.getNumericValue(temp.charAt(temp.length() - 1));

                temp = temp.substring(0, temp.length() - 1);

                long tmp = Long.parseLong(temp.substring(temp.length() - 2));

                if(tmp < 10)
                {
                    for(int k = 3; true; k++)
                    {
                        if(temp.charAt(temp.length() - k) != '0')
                        {
                            tmp = Long.parseLong(temp.substring(temp.length() - k));
                            break;
                        }
                    }
                }

                temp = temp.substring(0, temp.length() - String.valueOf(tmp).length()) + (tmp - digit < 10 ? "0" + (tmp - digit) : (tmp - digit));

                System.out.println(temp.startsWith("0") ? temp.charAt(1) : temp);
            }

            System.out.println("The number " + num + " is " + (Integer.parseInt(temp) % 11 == 0 ? "" : "not ") + "divisible by 11.");
        }
    }
}