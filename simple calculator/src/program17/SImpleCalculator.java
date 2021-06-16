package program17;
import java.util.Scanner;
public class SImpleCalculator {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		char operator;
		double n1,n2,res;
		System.out.println("Enter the operators: +,-,*,/: ");
		operator=in.next().charAt(0);
		System.out.println("Enter the number1: ");
		n1=in.nextDouble();
		System.out.println("Enter the number2:  ");
		n2=in.nextDouble();
		switch(operator) {
		case '+':
		     res=n1+n2;
			System.out.println("Addition of two  numbers:"+n1+ "+"+n2+"="+res);
			break;
		case '-':
			res=n1-n2;
			System.out.println("Subtraction of two numbers:"+n1+"-"+n2+"="+res);
			break;
		case '*':
			res=n1*n2;
			System.out.println("Multiplication of two numbers:"+n1+"*"+n2+"="+res);
		    break;
		case '/':
			res=n1/n2;
			System.out.println("Division of two numbers:"+n1+"/"+n2+"="+res);
			break;
		default:
			System.out.println("not vaild operator");
			break;
			
			
		
		}
		
	}

}
