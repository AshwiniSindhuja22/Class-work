package basicprogram;

import java.util.Scanner;

public class ReverseOfANumber {

	public static void main(String[] args) 
	{
			int n,reverse=0,rem,temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number to count:");
			n=sc.nextInt();
			temp=n;
			for(;n>0;)
			{
				rem=n%10;
				reverse=reverse*10+rem;
				n=n/10;
			
			}
			System.out.println("reverse of "+ temp+ " is: "+ reverse);
		}

	

	}


