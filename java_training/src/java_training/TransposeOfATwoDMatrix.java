// Transpose of A Two - D Matrix

import java.util.Scanner;
class TransposeOfATwoDMatrix
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rowNo = scn.nextInt();
		System.out.println("Enter the number of columns");
		int colNo = scn.nextInt();
		int[][] mat = new int[rowNo][colNo];
		int[][] transMat = new int[rowNo][colNo];
		
		// Take user input of the matrix
		System.out.println("Enter the elements of the matrix");
		for(int i = 0; i < rowNo; i++)
		{
			for(int j = 0; j < colNo; j++)
			{
				mat[i][j] = scn.nextInt();
			}
		}
		
		// Print the original matrix
		System.out.println("The original matrix is as under :");
		for(int i = 0; i < rowNo; i++) 
		{
			for(int j = 0; j < colNo; j++)
			{
				System.out.print(mat[i][j] + "		");
			}
			System.out.println();
		}
		
		// Transpose Matrix
		for(int i = 0; i < rowNo; i++)
		{
			for(int j = 0; j < colNo; j++) 
			{
				transMat[i][j] = mat[j][i];
			}
		}
		
		System.out.println("The Transpose Matrix is as under :");
		for(int i = 0; i < rowNo; i++) 
		{
			for(int j = 0; j < colNo; j++)
			{
				System.out.print(transMat[i][j] + "		");
			}
			System.out.println();
		}
		
	}
}