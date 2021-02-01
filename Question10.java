package day2;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		int t=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		for(int i=1;i<=number;i++)
		{
			t=i*i*i;
			System.out.println(t);
		}

	}

}
