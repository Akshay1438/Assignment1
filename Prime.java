package day2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int count = 0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
				count++;
		}
		if(count==2)
			System.out.println("it is prime number");
		else
			System.out.println("not a prime number");
		
	}

}
