/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg136.programs.of.java.pkgfor.beginners;

/**
 *
 * @author dell
 */
import java.util.Scanner;

public class armstrong 
{
    public static void main(String args[])
    {
        System.out.println("enter the number");
        Scanner ref=new Scanner(System.in);
        
        int num,num2,num3,i,rem,mult=1,arm=0;
        int length=0;
        
        num=ref.nextInt();
        num2=num;
        
        while(num2!=0)
        {
            num2=num2/10;
            length=length+1;
        }
        
        // for reverse number
        
        num3=num;
        while(num3!=0)
        {
            rem=num3%10;
            
            for(i=1;i<=length;i++)
            {
                mult=mult*rem;
            }
            arm=arm+mult;
            num3=num3/10;
        }
        if(arm==num3)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
