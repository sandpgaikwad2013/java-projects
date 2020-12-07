package datastructure.array;

public class PrintArray
{

    static int[] array = new int[10];

    public static void main(String[] args)
    {
        int num = 10;
        for (int i = 0; i < num; i++)
        {
            array[i] = i;
        }
        for (int j = 0; j < array.length; j++)
        {
            System.out.println(array[j]);
        }

    }

}
