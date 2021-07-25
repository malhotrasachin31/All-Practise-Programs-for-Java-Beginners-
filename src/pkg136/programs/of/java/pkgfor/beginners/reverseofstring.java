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

public class reverseofstring 
{
    public static void main(String args[])  
    {
        System.out.println("enter the string");
        Scanner ref=new Scanner(System.in);
        
        String first,second="";
        int i;
        
        first=ref.nextLine();
        char[] as=first.toCharArray();
        for(i=first.length()-1;i>=0;i--)
        {
           second=second+first.charAt(i);
        }
        System.out.println(second);
        
        if(first.equalsIgnoreCase(second))
        {
            System.out.println("yes");
        }
        else
        {
             System.out.println("no");
        }
    }
}
