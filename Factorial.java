import java.util.Scanner;

public class Factorial
{	
	int num,result=1;
	Factorial(int n)
	{
		num=n;
	}
	void fact()
	{
		for(int i=1;i<=num;i++)
		{
			result*=i;
		}
		System.out.println("factorial value : "+result+"\n");
	}
	public static void main(String [] args)
	{
		System.out.print("enter the number : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Factorial obj=new Factorial(n);
		obj.fact();
	}
}
