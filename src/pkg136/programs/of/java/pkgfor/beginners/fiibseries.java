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
public class fiibseries
{
 public static void main(String args[])
 {
     int a=11;
     int count=0;
     for(int i=1;i<=a;i++)
     {
         if(a%i==0)
         {
             count++;
         }
     }
     if(count==2)
     {
         System.out.println("yes is is a prime number");
     }
     else
     {
       System.out.println("no");  
     }
        
     
 }
}
