package hero;

import java.util.Arrays;
import java.util.Scanner;

class sachin
{
    Scanner ref=new Scanner(System.in);
    void main()
    {
        String first;
        String second;
        
        System.out.println("enter the first String ::");
        first=ref.next();
        System.out.println("enter the second String");
        second=ref.next();
        
        if(first.length()==second.length())
        {
            char[] array1=first.toCharArray();
            char[] array2=second.toCharArray();
            
            Arrays.sort(array1);
            Arrays.sort(array2);
            
            boolean result=Arrays.equals(array1, array2);
            
            if(result)
            {
                System.out.println(first+" and "+second+" are anagram");
            }
            if(result==false)
            {
                 System.out.println(first+" and "+second+" are not anagram");
            }
            
        }
    }
}
public class anagram
{
    public static void main(String args[])
    {
        sachin sac=new sachin();
        sac.main();
    }
}