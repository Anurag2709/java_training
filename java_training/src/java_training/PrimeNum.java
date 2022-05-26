import java.util.Scanner;
class PrimeNum
{
	public static void main(String[] args)
	{
		int num = readNum();
		if(isPrime(num))
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");
	}
	
	public static int readNum()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = scn.nextInt();
		return num;
	}

	public static boolean isPrime(int num)
	{
		int count = 0;
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
					count++;
					break;
			}
		}
		return (count == 0);
	}
}