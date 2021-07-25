/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg136.programs.of.java.pkgfor.beginners;

import java.io.File;
import java.util.Scanner;
class hey
{

    int count=0;
    void main()
    {
            try{
        File f1=new File("sachin.txt");
        Scanner ref=new Scanner(System.in);
        
        while(ref.hasNextLine())
        {
            ref.nextLine();
             count++;
        }
        System.out.println("no of lines"+count);
    }catch(Exception ex)
            {
            
            };
    }
}

public class cpountthelines 
{
    public static void main(String args[])
    {
        
    }
}
