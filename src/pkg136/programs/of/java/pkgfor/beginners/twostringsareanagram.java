/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg136.programs.of.java.pkgfor.beginners;

import java.util.Arrays;
import java.util.Scanner;

class sachin
{
    Scanner ref1=new Scanner(System.in);
    void main()
    {
        System.out.println("enter the first string");
        String first=ref1.next();
        System.out.println("enter the second string");
        String second=ref1.next();
        
        if(first.length()==second.length())
        {
            char[] chararray1=first.toCharArray();
            char[] chararray2=second.toCharArray();
            
            Arrays.sort(chararray1);
            Arrays.sort(chararray2);
            
            boolean result=Arrays.equals(chararray1,chararray2);
            
            if(result)
            {
                System.out.println(first+" and "+second+" are anagram ");
            }
            else
            {
                 System.out.println(first+" and "+second+" are anagram ");
            }
        }
    }
}

public class twostringsareanagram
{
 public static void main(String args[])
 {
    sachin ref=new sachin(); 
    ref.main();
 }
}
