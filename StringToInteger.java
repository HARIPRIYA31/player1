

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int ans=Integer.parseInt(str);
    if(ans>0)
		System.out.println("INTEGER:"+ans);
    else
    System.out.println("NOT AN INTEGER");
        sc.close();
	}

}
