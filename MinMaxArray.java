//Write a java program to find the largest and smallest element in an array.

import java.util.*;

public class MinMaxArray{
	public static void main(String[] args){
		Scanner no=new Scanner(System.in);
		
		System.in.print("Enter the size of the elements:");
		int size=no.nextInt();

		int[] array=new int[size];

		System.in.print("Enter" +size+  "element:");
		for(int i=0;i<size;i++)
		{
			array[i]=no.nextInt();
		}

		int min=array[0];
		int max=array[0];

		for(int i=0;i<size;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		System.out.print("Smallest element:" + min);
		System.out.print("largest Element" +max);
	}
}