
package pkg136.programs.of.java.pkgfor.beginners;

import java.util.Random;

class first
{
    void main()
    {
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        StringBuilder sb=new StringBuilder();
        
        Random random=new Random();
        
        int lengthofstring=6;
        
        for(int i=0;i<=lengthofstring;i++)
        {
            int index=random.nextInt(alphabet.length());
            
            char randomchar = alphabet.charAt(index);
            
            sb.append(randomchar);
            
        }
        String randomstring=sb.toString();
        
        System.out.println("random string is "+randomstring);
    }
}
public class randomSring 
{
    public static void main(String args[])
    {
        first ref=new first();
        ref.main();
    }
}
