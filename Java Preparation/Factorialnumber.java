
import java.util.Scanner;
public class Factorialnumber {

	public static void main(String[] args) {
		System.out.print("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++) {
			a = a*i;
			
		}
		System.out.print("The Factorial of is:"+a);
		sc.close();
	}

}
