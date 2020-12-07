package datastructure.array;

public class PalindromNumber
{

    public static void main(String[] args)
    {

        int number = 15951;
        int temp = number;
        int rev = 0;
        int reminder = 0;

        while (temp > 0)
        {
            reminder = temp % 10;
            rev = rev * 10 + reminder;
            temp = temp / 10;
        }
        System.out.println("Test");
        System.out.println(number);
        System.out.println(rev);

    }

}
