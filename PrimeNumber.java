package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		boolean flag = false;
		for(int i=2;i<number; i++)
		{
			if (number%i==0)
			{
				flag = true;
			}
		}
		
			if (flag = true)
			{
				System.out.println(number +  "is a prime number");
			}
			else
				System.out.println(number +  "is a Not a Prime");

	}

}
