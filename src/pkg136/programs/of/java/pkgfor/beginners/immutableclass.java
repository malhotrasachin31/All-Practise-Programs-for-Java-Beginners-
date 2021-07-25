/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg136.programs.of.java.pkgfor.beginners;


class Immutable
{
    private String name;
    private int date;
    
    Immutable(String name,int date)
    {
        this.name=name;
        this.date=date;
    }
    public String getname()
    {
        return name;
    }
    public int getdate()
    {
        return date;
    }
}

public class immutableclass 
{
    public static void main(String args[])
    {
        Immutable i=new Immutable("Happy Birthday",1999);
        System.out.println(i.getdate());
        System.out.println(i.getname());
    }
}
