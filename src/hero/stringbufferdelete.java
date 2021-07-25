
package hero;

public class stringbufferdelete 
{
 public static void main(String args[])
 {
     StringBuffer sb=new StringBuffer();
     sb.append("hello");
     sb.append("sachin malhotra");
     
     System.out.println("old stringbuffer value is "+sb);
     
     sb.delete(0,sb.length());
     System.out.println("new stringbuffer value is "+sb);
 }
}
