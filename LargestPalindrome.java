//4.Write a java program to find the largest palindrome number less than 1000.

import java.util.*;
public class LargestPalindrome{
	public static void main(String[] args){
		int largepalindrome=0;
		for(int i=999;i>=1;i--)
		{
			if(isPalindrome(i))
			{
				largepalindrome=i;
				break;
			}
		}
		System.out.println("The largest palindrome number is " +largepalindrome);
	}
	public static boolean isPalindrome(int number){
		int original=number;
		int reversed=0;
		while (number!=0)
		{
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;
		}
		return original==reversed;
	}
}

