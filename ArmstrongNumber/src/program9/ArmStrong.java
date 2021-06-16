package program9;

public class ArmStrong {
	public static void main(String[] args) {
		int n=371,n1,rem,res=0;
		n1=n;
		while(n1!=0) {
			rem=n1%10;
			res+=Math.pow(rem, 3);
			n1/=10;
		}
		if(res==n) {
			System.out.println("It is a armstrong number: "+res);
		}
		else {
			System.out.println("It is not a armstrong number:"+res);
		}
	}

}
