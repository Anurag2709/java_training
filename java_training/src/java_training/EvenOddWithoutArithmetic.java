// Program to check Even or Odd without using Arithematic Operator

class EvenOddWithoutArithmetic
{
	public static void main(String[] args) 
	{
		int num = 11;
		if((num & 1) == 0)
		{
			System.out.println(num+" is an Even Number");
		}
		else
		{
			System.out.println(num+" is an Odd Number");
		}
	}
}