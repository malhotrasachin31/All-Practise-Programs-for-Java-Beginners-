
package pkg136.programs.of.java.pkgfor.beginners;

class first1
{
    void main()
    {
        System.out.println("hello java");
    }
}
class second
{
    void main()
    {
        System.out.println("hello python");
    }
}
public class determinetheclass
{
    public static void main(String args[])
    {
        first1 f1=new first1();
        System.out.println("the class name is ");
        System.out.println(f1.getClass());
        
        second s1=new second();
        System.out.println("the class name is ");
        System.out.println(s1.getClass());
    }
}
