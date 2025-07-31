// Write a java program to copy a subset of array elements to another array.

import java.util.*;
public class CopySubset{
	public static void main(String[] args){

		Scanner no=new Scanner(System.in);

		System.out.print("Enter the size of the array:");
		int size=no.nextInt();

		int[] original=new int[size];

		System.out.print("Enter" +size+ "elements:");
		for(int i=0;i<size;i++)
		{
			original[i]=no.nextInt();
		}

		System.out.print("Enter the start index:");
		int start=no.nextInt();

		System.out.print("Enter the no of elements to be copied:");	
		int length=no.nextInt();
		
		if(start<0||length<0||start+length>size)
		{
			System.out.println("Error");
		}
		
		int[] subset=new int[length];
		
		for(int i=0;i<length;i++)
		{
			subset[i]=original[start+i];
		}
		
		System.out.print("Copied Subset:");
		for(int num:subset)
		{
			System.out.print(num+" ");
		}
		
	}	
}