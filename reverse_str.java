import java.lang.StringBuffer;
import java.util.Scanner;
public class reverse_str
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A STRING:");
      String str=sc.nextLine();
      String ans=new StringBuffer(str).reverse().toString();
      System.out.println("ORIGINAL:"+str);
      System.out.println("REVERSED:"+ans);
    }
 }
