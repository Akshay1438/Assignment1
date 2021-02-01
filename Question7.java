package day2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		int r;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		System.out.println("reverse number");
		while(number>0)
		{
			r=number%10;
			System.out.print(r);
			number=number/10;
			
		}

	}

}
