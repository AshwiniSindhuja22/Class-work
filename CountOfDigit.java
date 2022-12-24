package basicprogram;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to count:");
		n=sc.nextInt();
		for(;n!=0;)
		{
			count++;
			n=n/10;
		
		}
		System.out.println("no of digits are: "+ count);
	}

}
