public class Factorial
{
	int n,result=1;
	Factorial(int a)
	{
		n=a;
	}
	void fact()
	{
		for(int i=1;i<=n;i++)
		{
			result*=i;
		}
		System.out.println("the factorial value : "+result);
	}
	public static void main(String[]args)
	{
		Factorial obj=new Factorial(7);
		obj.fact();
	}
}
