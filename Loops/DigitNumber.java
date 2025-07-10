import java.util.*;
public class DigitNumber
{
	public static void main(String ar[])
	{	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nodig=0;
		int temp=n;
		while(temp !=0)
		{
			temp=temp/10;
			nodig++;
		}
		int div=(int)Math.pow(10,nodig-1);
		while(div !=0)
		{
			int q=n/div;
			System.out.println(q);
			n=n%div;
			div=div/10;
		}
	}
}