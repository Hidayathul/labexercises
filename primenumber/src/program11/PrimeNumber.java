package program11;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		int temp,n;
		boolean isprime=true;
		System.out.println("Enter the number:");
		Scanner in= new Scanner(System.in);
		 n=in.nextInt();
		 temp=n%2;
		 for(int i=2;i<=n/2;i++) {
			 if(temp==0) {
				 isprime=false;
				 break;
			 }
		 }
		if(isprime)
System.out.println("It is a prime number:"+n);
else
		System.out.println("It is not  a prime number:"+n);
				
		
	}

}
