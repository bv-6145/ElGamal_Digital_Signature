import java.util.Scanner;
public class Elgamal_Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Prime number  p");//(according to algorithm q)
		long p=sc.nextLong();
		System.out.println("Enter the value of it's Primitive root alpha");//(according to algorithm primitive root of q)
		long alpha=sc.nextLong();
		System.out.println("Enter the value of your message m");
		long m=sc.nextLong();
		System.out.println("Enter the public component of r");
		long r=sc.nextLong();
		System.out.println("Enter the value of d");
		long d = sc.nextLong();
		Sign sign = new Sign(p,alpha,m,r,d);
		Verification v = new Verification(sign.p,sign.alpha,sign.beta,sign.m,sign.r,sign.s);
		v.verified();
	}
}