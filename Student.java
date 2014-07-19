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
		System.out.print("enter how many students : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter student name : ");
			name=user_input.next();
			sname[i]=name;
			System.out.print("Enter marks: ");
			marks[i]=user_input.nextFloat();
			sum+=marks[i];
		}
		System.out.println("marks total: "+sum);
		sum=sum/n;
		System.out.println("avg : "+sum);
		
	}
}
