package datastructure.array;

public class FebonaciSeries
{

    public static void main(String[] args)
    {
        int size = 10;
        int first = 0;
        int second = 1;
        int third = 0;

        System.out.println("First" + first + " and Second " + second);

        for (int i = 2; i <= size; i++)
        {
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }

    }

}
