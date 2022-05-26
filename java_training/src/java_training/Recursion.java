// Recursion Program to check the total number of digits

import java.util.Scanner;
class Recursion
{
	public static void main(String[] args)
	{
		int num = readNum();
		int totalDigit = countDigit(num);
		if(totalDigit < 0)
			System.out.println(totalDigit + " is a Negative Number");
		else
			System.out.println("Total Number of digits in the number is : " + totalDigit);
	}
	
	public static int readNum()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		return scn.nextInt();
	}
	
	public static int countDigit(int num)
	{
		int countDig = 0, count = 0;
		if(num < 0) {
			System.out.print("Please Enter Positive Number. ");
			return num;
		}
		else if(num == 0)
			return 1;
		else 
		{
			while(num > 0) {
				num /= 10;
				countDig = count + countDigit(num / 10);
				count++;
			}
			return countDig;
		}	
	}
}