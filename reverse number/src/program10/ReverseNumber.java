package program10;

public class ReverseNumber {
	public static void main(String[] args) {
		int rev=0;
		int num=789;
		while(num!=0) {
			rev*=10;
			rev+=num%10;
			num/=10;
		}
		System.out.println("Reversenumber:"+rev);
	}

}
