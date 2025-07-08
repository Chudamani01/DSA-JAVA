import java.util.*;
public class All_prime
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		System.out.println("Enter ranch to prime number:");
		for(int n=low; n<=high; n++)
		{	
			int count=0;
			for(int div=2; div*div<=n; div++)
			{
				if(n%div==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(n);
			}
		}
	}
}