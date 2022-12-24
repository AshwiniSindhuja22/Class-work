package basicprogram;

import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args)
	{
		int n=123456;
		
		int firstdigit=0;
		int lastdigit=0;
		lastdigit = n%10;
		while(n!=0) {
			firstdigit = n;
			n=n/10;
						}
			System.out.println("first digit is "+firstdigit);
			
			System.out.println("last digit is "+lastdigit);

		}

	}



