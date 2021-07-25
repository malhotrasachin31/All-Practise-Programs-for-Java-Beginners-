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
public class armstrongnumber 
{
 public static void main(String args[])
 {
     System.out.println("enter the number");
     Scanner ref=new Scanner(System.in);
      int arm=0;
     int num,num2,i;
     int length=0;
     num=ref.nextInt();
     
     num2=num;
     
     while(num!=0)
     {
         num=num/10;
         length=length+1;
     }
     System.out.println("length is"+length);
     int num3;
     
     num3=num2;
     int rem;
     while(num3!=0)
     {
         rem=num3%10;
         int mult=1;
        
         
         for( i=1;i<=length;i++)
         {
             mult=mult*rem;
         }
         arm=arm+mult;
         num3=num3/10;
         
     }
     System.out.println(arm);
     if(arm==num2)
     {
         System.out.println("yes");
     }
     else
     {
        System.out.println("no"); 
     }
 }
}
