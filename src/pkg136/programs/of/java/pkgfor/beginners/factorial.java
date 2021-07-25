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
public class factorial
{
 public static void main(String args[]) 
 {
     int a=9;
     int i,fact=1;
     
     for(i=1;i<=a;i++)
     {
         fact=fact*i;
     }
     System.out.println(fact);
 }
}
