package getting.started;
import java.util.*;
public class GCD_and_LCM {
	public static  void main(String ar[]) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any two number:");
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		while(n1 % n2!=0) {
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n2;
		int lcm=(n1 * n2)/gcd;
		System.out.println("GCD is:"+" "+gcd);
		System.out.println("LCM is:"+" "+lcm);
	}
}
