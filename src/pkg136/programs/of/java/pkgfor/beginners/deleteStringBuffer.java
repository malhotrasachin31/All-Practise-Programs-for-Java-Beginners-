
package pkg136.programs.of.java.pkgfor.beginners;

public class deleteStringBuffer 
{
 public static void main(String args[])
 {
     StringBuffer sb=new StringBuffer();
     sb.append("java");
     sb.append("is");
     sb.append("life");
     
     System.out.println("old string buffer is "+sb);
     sb.delete(0, sb.length());
     System.out.println("new string buffer is "+sb);
 }
}
