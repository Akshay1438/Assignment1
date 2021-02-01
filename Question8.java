package day2;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		int t,r=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		t=number;
		while(t>0)
		{
			r=r*10;
			r=r+t%10;
			t=t/10;
		}
if(number==r)
{
	System.out.println("palindrome number is="+r);
}
else
{
	System.out.println("it is not palindrome ="+r);
}
	}
}
