
package pkg136.programs.of.java.pkgfor.beginners;

import java.util.Scanner;
class CI
{
    Scanner ref=new Scanner(System.in);
    void main()
    {
        double principle;
        double rate;
        double time;
        
        double amount;
        
        System.out.println("enter the principal value");
        principle=ref.nextDouble();
        System.out.println("enter the rate value");
        rate=ref.nextDouble();
        System.out.println("enter the timel value");
        time=ref.nextDouble();
        
        double a=1+Math.pow(rate/100,time);
        amount=principle*a;
        
        System.out.println("CI is "+amount);
        
       double amount2=(principle*rate*time)/100;
       System.out.println("SI is "+amount2);
       
    }
}

public class compundsintereset {
    public static void main(String ags[])
    {
        CI ref=new CI();
        ref.main();
    }
}
