/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg136.programs.of.java.pkgfor.beginners;

import java.util.Scanner;

class money
{
    Scanner ref=new Scanner(System.in);
    void main()
    {
        
        int amount=10000;
        int width;
        System.out.println("enter the amount");
        width=ref.nextInt();
        try{
            if(width<=8000)
            {
                amount=amount-width;
                System.out.println("widthrawl amount is "+width);
                System.out.println("remaining amount is "+amount);
            }
            if(width>8000)
            {
                System.out.println("sorry! you can get this amount of money, minimum balance limit reached");
            }
        }catch(Exception ex)
        {
         System.out.println(ex);   
        }
    }
}

public class createcutsomexception
{
    public static void main(String args[])
    {
        money m=new money();
        m.main();
    }
}
