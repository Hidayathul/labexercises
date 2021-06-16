package program18;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the year: ");
	int lyear=in.nextInt();
	if(lyear%4==0) {
		System.out.println("It is a leap year:"+lyear);
		
	}
	else {
		System.out.println("It is not a leap year: "+lyear);
	}
}
}
