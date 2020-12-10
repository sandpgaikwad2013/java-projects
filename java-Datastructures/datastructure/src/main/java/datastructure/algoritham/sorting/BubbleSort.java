package datastructure.algoritham.sorting;

public class BubbleSort
{

    public static void main(String[] args)
    {
        int[] arrray = { 20, 56, 78, 1, 58, 1 };

        int arrayLenght = arrray.length;
        for (int i = 0; i < arrayLenght; i++)
        {
            for (int j = 0; j < arrayLenght - 1; j++)
            {
                // compare elements
                if (arrray[j] > arrray[j + 1])
                {
                    int temp = arrray[j + 1];
                    arrray[j + 1] = arrray[j];
                    arrray[j] = temp;
                }

            }

        }
        for (int i = 0; i < arrray.length; i++)
        {
            System.out.println(arrray[i]);
        }

    }

}
