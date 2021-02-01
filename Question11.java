package day2;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		int c,i,p,flag;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int number= scan.nextInt();
		p=2;
		i=1;
		while(i<=number)
		{
			flag=1;
			for(c=2;c<=p-1;c++)
			{
				if(p%c==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(p);
				i++;
			}
			p++;
		}
	}

}
