//2.Write a program in java to find the HCF (Highest Common Factor) of two numbers.

import java.util.*;
public class HCF{
	public static void main(String[] args){
		Scanner no=new Scanner (System.in);
		System.out.println("Enter a number num1:");
		int num1=no.nextInt();
		System.out.println("Enter a number num2:");
		int num2=no.nextInt();
		 int hcf = 1;
        	int a = num1;
        	int b = num2;
        	while (b != 0) {
            		int temp = b;
            		b = a % b;
            		a = temp;
        	}
        	hcf = a;
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);		
	}
} 
