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
public class comapreoftwostrings 
{
    public static void main(String args[])
    {
        String sachin="hello";
        String sachin2="hello";
        boolean x;
        System.out.println("compare of equals() and == operators");
        
        x=(sachin==sachin2);
         System.out.println("sachin==sachin2");
        System.out.println("result is "+x);
        
        x=(sachin.equals(sachin2));
         System.out.println("sachin.equals(sachin2)");
        System.out.println("result is "+x);
    }
    
}
