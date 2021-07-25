
package hero;

import java.util.Random;

class random
{ 
    void main()
    {
    String str="123456ABCDEFGHIJKLMNOPQRSTUVWXYZ0";
    
    StringBuffer sb=new StringBuffer();
    
    Random rd=new Random();
    
    int lengthofString=7;
    
    for(int i=0;i<=lengthofString;i++)
    {
        int index=rd.nextInt(str.length());
        
        char ch=sb.charAt(index);
        
        sb.append(ch);
    }
    String rdstr=sb.toString();
    System.out.println("code is "+rdstr);
    }
}
public class randomsttring 
{
 public static void main(String args[]) 
 {
    random reg=new random(); 
    reg.main();
 }
}
