// Number Palindrome

import java.util.Scanner;
class NumberPalindrome
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scn.nextInt();
		int temp = num;
		
		int revNum = 0;
		while(num != 0)
		{
			int digit = num % 10;
			revNum = (revNum * 10) + digit;
			num /= 10;
		}
		if(revNum == temp)
			System.out.println(temp + " is a Pallindrome");
		else
			System.out.println(temp + " is not a Pallindrome");
	}
}
