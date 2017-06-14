import java.util.*;
import java.lang.*;
class Occurence
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String value=sc.nextLine();
  int count=value.length()-value.replaceAll("7","").length();
  System.out.println(count);
  }
 }
