package program13;
import java.util.Scanner;
public class AreaOfTraingle {
 public static void main(String[] args) {

	 Scanner obj=new Scanner(System.in);
	 System.out.println("Enter the height and base:");
	 int h=obj.nextInt();
	 int b=obj.nextInt();
	 double area=((0.5)*h*b);
	 System.out.println("Area of traingle:"+area);
 }
}
