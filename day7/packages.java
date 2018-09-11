import java.util.*;
import java.lang.*;

public class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int a,b;
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		if(a>b)
		{
			System.out.println("s1 is greater and its value is: "+a);
		}
		else
		{
			System.out.println("s2 is greater and its value is: "+b);
		}
	}
}
