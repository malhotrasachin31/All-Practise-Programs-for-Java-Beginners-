
package pkg136.programs.of.java.pkgfor.beginners;
import java.util.Scanner;

public class twoofthreeboolean 
{
   
    public static void main(String args[])
    {
        boolean result ;
        boolean first;
        boolean second;
        boolean third;
        
        Scanner ref=new Scanner(System.in);
        System.out.println("enter the first string");
        first=ref.nextBoolean();
        
        System.out.println("enter the second string");
        second=ref.nextBoolean();
        
        System.out.println("enter the third string");
        third=ref.nextBoolean();
        
        
        if(first)
        {
        result=second || third;
        System.out.println(result);
        }
        else
        {
        result=second && third;
        System.out.println(result);
        }
        if(result)
        {
            System.out.println("2 boolean values are true");
        }
        else
        {
            System.out.println("2 boolean values are false");
        }
    }
}
