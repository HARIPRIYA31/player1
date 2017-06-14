package playerset1;

import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("ENTER THE RANGE:");
		int range=sc.nextInt();
		System.out.println("PRIME NUMBERS ARE: 2");
		for(int j=2;j<=range;j++)
		{
		for(int i=2;i<j;i++)
		{
			if(j%i==0)
			{
				count=0;
			    break;
			}
			else
				count=1;
		}
		     if(count==1)
			 System.out.println(j);
		}
    if(count==0)
      System.out.println("NO PRIME NUMBERS FOUND");
        sc.close();
	}

}
