package program4;


public class SwapTwoNumbers {
	public static void main(String[] args) {
		int firstnumber=12,secondnumber=220;
		System.out.println("Before swapping");
		System.out.println("First number"+firstnumber);
		System.out.println("Second number "+secondnumber);
		firstnumber=firstnumber-secondnumber;
		secondnumber=firstnumber+secondnumber;
		firstnumber=secondnumber-firstnumber;
		System.out.println("After swapping");
		System.out.println("Firstnumber"+firstnumber);
		System.out.println("Secondnumber "+secondnumber);
		
	}

}
