
package pkg136.programs.of.java.pkgfor.beginners;

import java.util.Scanner;

class swtch
{
    Scanner ref=new Scanner(System.in);
    void main()
    {
        System.out.println("enter the string");
        String input=ref.next();
        
        switch(input)
        {
            case "java":
            {
                System.out.println("hello java");
                break;
            }
            case "python":
            {
                System.out.println("hello python");
                break;
            }
        }
    }
}
public class Stringswitchcase {
    
    public static void main(String args[])
    {
        swtch ref=new swtch();
        ref.main();
    }
}
