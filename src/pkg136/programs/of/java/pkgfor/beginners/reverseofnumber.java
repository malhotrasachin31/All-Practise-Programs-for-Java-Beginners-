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

public class reverseofnumber 
{
    public static void main(String args[])
    {
        System.out.println("enter the number ");
        Scanner ref=new Scanner(System.in);
        
        int num,rem,rev=0,i;
        
        num=ref.nextInt();
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("the reverse number is "+rev);
    }
}
