package power.program8;

public class Power {
	public static void main(String[] args) {
		int base=3,exponent=4;
	 int res=1;
		while(exponent!=0) {
			res*=base;
			--exponent;
	
		}
		System.out.println("RESULT: "+res);
	}
	

}
