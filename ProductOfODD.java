//6.Write a java program to calculate the product of all odd numbers from 1 to 50.

import java.util.*;
import java.math.BigInteger;
public class ProductOfODD{
	public static void main(String [] args){
		BigInteger product=BigInteger.ONE;
		for(int i=1;i<=50;i=i+2)
		{
			product=product.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The product of all odd numbers from 1 to 50 are " +product);
	}
}
