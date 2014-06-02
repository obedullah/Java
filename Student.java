import java.util.*;
public class Student
{
	public static void main(String[]args)
	{
		String [] sname = new String [10];
		Double sum=0.0;
		Float [] marks = new Float [10];
		String name="";
		Scanner user_input = new Scanner( System.in );
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter your name: ");
			name=user_input.next();
			sname[i]=name;
			System.out.println("Enter your marks: ");
			marks[i]=user_input.nextFloat();
			sum+=marks[i];
		}
		System.out.println("marks total: "+sum);
		sum=sum/5;
		System.out.println("avg : "+sum);
		
	}
}
