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

public class decimaltobinary 
{
 public static void main(String args[])
 {
     int a,rem;
     String abc="";
     System.out.println("enter the number");
     Scanner ref=new Scanner(System.in);
     
     a=ref.nextInt();
     
     while(a!=0)
     {
         rem=a%2;
         a=a/2;
         abc=rem+abc;
     }
     System.out.println(abc);
 }
}
