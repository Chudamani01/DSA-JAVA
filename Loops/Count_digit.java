import java.util.*;
public class Count_digit
{
	public static void main(String ar[])
	{
		System.out.println("Enter any large digit number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=0;
		while(n!=0)
		{
			n=n/10;
			digit++;
		}
		System.out.println(digit);
	}
}