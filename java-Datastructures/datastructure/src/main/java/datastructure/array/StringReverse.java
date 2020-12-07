package datastructure.array;

public class StringReverse
{

    public static void main(String[] args)
    {
        String name = "madam";
        int lenth = name.length() - 1;
        StringBuilder sbf = new StringBuilder();
        for (int i = lenth; i >= 0; i--)
        {
            sbf.append(name.charAt(i));
        }
        if (name.equals(sbf.toString()))
        {
            System.out.println("String is palindrom " + sbf);
        }
        else
        {
            System.out.println("Not an palindrom"+sbf);
        }
       

    }

}
