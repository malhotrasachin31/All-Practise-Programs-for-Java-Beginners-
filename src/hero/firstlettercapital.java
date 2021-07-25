
package hero;

import java.util.Scanner;

class first
{
    void main()
    {
        Scanner ref=new Scanner(System.in);
        System.out.println("enter the string");
        String str1=ref.next();
        
        String first=str1.substring(0,1);
        String second = str1.substring(1, str1.length());
        
        String hello= first.toUpperCase();
        
        String full = hello+second;
        System.out.println(full);
        
    }
}

public class firstlettercapital {
    
    public static void main(String args[])
    {
        first ref =new first();
        ref.main();
    }
}
