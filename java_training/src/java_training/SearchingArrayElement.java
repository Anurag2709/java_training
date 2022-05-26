// Searching an element in an array

import java.util.Scanner;
class SearchingArrayElement
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scn.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the Array");
		for(int i = 0; i < size; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		System.out.println("Enter the element that you want to search in the Array");
		int searchElement = scn.nextInt();
		
		System.out.println("Original Array is as under");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + "		");
		}
		
		System.out.println();
		System.out.println();

		int indexPos = -1;
		for(int i = 0; i < size; i++)
		{
			if(searchElement == arr[i])
			{
				indexPos = i+1;
				break;
			}
		}
		
		if(indexPos == -1)
			System.out.println("Element not found in the Array");
		else
			System.out.println("Element found at the position : " + indexPos);
		
		
	}
}