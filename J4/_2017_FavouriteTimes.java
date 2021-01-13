import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11: 11 (1)
//10: (0)
//9: 51 (1)
//8: 52, 40 (2)
//7: 53, 41 (2)
//6: 54, 42, 30 (3)
//5: 55, 43, 31 (3)
//4: 56, 44, 32, 20 (4)
//3: 57, 45, 33, 21 (4)
//2: 58, 46, 34, 22, 10 (5)
//1: 59, 47, 35, 23, 11 (5)
//12: 34 (1)

public class _2017_FavouriteTimes
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minutes = Integer.parseInt(br.readLine());

        int hours = minutes / 60;
        int minuteRemainder = minutes - hours * 60;
        int loops = hours / 12;
        int hourRemainder = hours - loops * 12;

        int count = loops * 31;

        int[] digits = {1, 2, 0, 0};
        for(int i = 0; i < hourRemainder * 60; i++)
        {
            if(digits[3] != 9)
                digits[3]++;
            else if(digits[2] != 5)
            {
                digits[3] = 0;
                digits[2]++;
            }
            else if(digits[1] == 9)
            {
                digits[3] = digits[2] = digits[1] = 0;
                digits[0] = 1;
            }
            else if(digits[0] == 1 && digits[1] == 2)
            {
                digits[3] = digits[2] = digits[0] = 0;
                digits[1] = 1;
            }
            else
            {
                digits[3] = digits[2] = 0;
                digits[1]++;
            }

            int diff = digits[1] - digits[0];

            if(digits[2] - digits[1] == diff && digits[3] - digits[2] == diff)
                count++;
        }

//        switch(hourRemainder)
//        {
//            case 0:
//                if(minuteRemainder == 34)
//                    count++;
//                break;
//            case 1:
//                count++;
//                if(minuteRemainder == 59)
//                    count += 5;
//                else if(minuteRemainder == 47)
//                    count += 4;
//                else if(minuteRemainder == 35)
//                    count += 3;
//                else if(minuteRemainder == 23)
//                    count += 2;
//                else if(minuteRemainder == 11)
//                    count++;
//                break;
//            case 2:
//                count += 6;
//                if(minuteRemainder == 58)
//                    count += 5;
//                else if(minuteRemainder == 46)
//                    count += 4;
//                else if(minuteRemainder == 34)
//                    count += 3;
//                else if(minuteRemainder == 22)
//                    count += 2;
//                else if(minuteRemainder == 10)
//                    count++;
//                break;
//            case 3:
//                count += 11;
//                if(minuteRemainder == 57)
//                    count += 4;
//                else if(minuteRemainder == 45)
//                    count += 3;
//                else if(minuteRemainder == 33)
//                    count += 2;
//                else if(minuteRemainder == 21)
//                    count++;
//                break;
//            case 4:
//                count += 15;
//                if(minuteRemainder == 56)
//                    count += 4;
//                else if(minuteRemainder == 44)
//                    count += 3;
//                else if(minuteRemainder == 32)
//                    count += 2;
//                else if(minuteRemainder == 20)
//                    count++;
//                break;
//            case 5:
//                count += 19;
//                if(minuteRemainder == 55)
//                    count += 3;
//                else if(minuteRemainder == 43)
//                    count += 2;
//                else if(minuteRemainder == 31)
//                    count++;
//                break;
//            case 6:
//                count += 22;
//                if(minuteRemainder == 54)
//                    count += 3;
//                else if(minuteRemainder == 42)
//                    count += 2;
//                else if(minuteRemainder == 30)
//                    count++;
//                break;
//            case 7:
//                count += 25;
//                if(minuteRemainder == 53)
//                    count += 2;
//                else if(minuteRemainder == 41)
//                    count++;
//                break;
//            case 8:
//                count += 27;
//                if(minuteRemainder == 52)
//                    count += 2;
//                else if(minuteRemainder == 40)
//                    count++;
//                break;
//            case 9: case 10:
//                count += 29;
//                if(minuteRemainder == 51 && hourRemainder != 10)
//                    count++;
//                break;
//            case 11:
//                count += 30;
//                if(minuteRemainder == 11)
//                    count++;
//                break;
//        }

        System.out.println(count);
    }
}
