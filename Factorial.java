

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int value=sc.nextInt();
    if(value>1)
    {
		for(int i=2;i<=value;i++)
		{
			fact=fact*i;
		}
		System.out.println("FACTORIAL OF "+value+" :"+fact);
    }
    else
      System.out.println("1");
		sc.close();

	}

}
