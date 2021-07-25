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

public class binarytoecimal 
{
 public static void main(String args[])
 {
     int a,rem,i=0,x=0;
     
     System.out.println("enter the binary number");
     Scanner ref=new Scanner(System.in);
     
     a=ref.nextInt();
     while(a!=0)
     {
         rem=a%10;
         a=a/10;
          x=x+rem*(int)Math.pow(2, i++);
         
     }
     System.out.println(x);
 }
}
