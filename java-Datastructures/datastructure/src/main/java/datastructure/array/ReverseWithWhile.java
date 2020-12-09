package datastructure.array;

public class ReverseWithWhile
{

    public static void main(String[] args)
    {
        String string = "141";
        int i = 0;
        int j = string.length() - 1;
        while (i < j || i == j)
        {
            char charAtI = string.charAt(i);
            char charAtJ = string.charAt(j);
            if (charAtI == charAtJ)
            {
                System.out.println("Match============================");
                System.out.println(charAtI);
                System.out.println(charAtJ);
            }
            else
            {
                System.out.println("Not a palindrom ");
            }
            i++;
            j--;
        }

    }

}
