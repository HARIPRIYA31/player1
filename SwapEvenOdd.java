

import java.util.Scanner;

public class SwapEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=new char[str.length()];
		char swap,temp;
   
		if(str.length()%2==0)
		{
		for(int i=0;i<str.length();i=i+2)
		{
		   swap=str.charAt(i);
		   temp=str.charAt(i+1);
		   arr[i]=temp;
		   arr[i+1]=swap;
		}
		}
		else
		{
			for(int k=0;k<str.length()-1;k=k+2)
			{
			   swap=str.charAt(k);
			   temp=str.charAt(k+1);
			   arr[k]=temp;
			   arr[k+1]=swap;					   
			}
			arr[str.length()-1]=str.charAt(str.length()-1);
		}
		if(str.length()==arr.length)
                 {
		String ans=String.valueOf(arr);
		System.out.println(ans);
                }
    else
      System.out.println("NOT IN RANGE");
        sc.close();
	}

}
