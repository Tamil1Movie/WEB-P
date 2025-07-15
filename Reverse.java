                                                                                                                                                                                                                                                                                                                                                                                                                                //1.Write a program in java to display the number in reverse order.

import java.util.Scanner;
public class Reverse{
	public static void main(String[] args){
		Scanner no = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number=no.nextInt();
		int reversed=0;
		while(number!=0)
		{
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;	
		}
		System.out.printf("Reversed number"+reversed);
		
	}
}