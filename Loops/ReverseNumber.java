package getting.started;
import java.util.*;
public class ReverseNumber {
	public static void main(String ar[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scanner.nextInt();
		while(num > 0) {
			int digit= num % 10;
			num=num/10;
			System.out.println(digit);
		}
	}
}
