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

public class palindrome 
{
 public static void main(String args[])
 {
     System.out.println("enter the number");
     Scanner ref=new Scanner(System.in);
     
     int num,num2,rem,rev=0,i;
     
     num=ref.nextInt();
     
     num2=num;
     
     while(num2!=0)
     {
         rem=num2%10;
         rev=rev*10+rem;
         num2=num2/10;
     }
     System.out.println("reverse of the number"+num2+"is:"+rev);
     if(rev==num)
     {
         System.out.println("yes");
     }
     else
     {
         System.out.println("no");
     }
 }
}
