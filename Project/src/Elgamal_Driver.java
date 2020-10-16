import java.util.*;
class PrivateKeyRangeException extends Exception{
	public String toString() {
		return "Hush.. the private key should lie in the range (1,q-1)";
	}
}
class PrimenumberError extends Exception{
	public String toString() {
		return "Hush.. the Prime number should not be a multiple of 8";
	}
}

public class Elgamal_Driver {
	static long q,a,xa,m,k;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcom to Elgamal-Digital signetur verifier");//embed it to the title label
		try {
			System.out.print("Enter the Prime number :");//embed to status label
			q = in.nextLong();
			if(q%8==0)
				throw new PrimenumberError();
			System.out.print("Enter the primitive root of the "+q+" to proceed further :");//embed to status label
			a=in.nextLong();
			System.out.print("Enter the private element of the System XA :");//embed to status label
			xa=in.nextLong();
			if(xa<=1||xa>=(q-1))
				throw new PrivateKeyRangeException();
			System.out.print("Enter the message to sign :");
			m=in.nextLong();
			System.out.print("Enter the k :");
			k=in.nextLong();
		}
		catch(Exception e) {
			if(xa<=1||xa>=(q-1)) {
				System.out.println(e);
				System.out.println("Recompile the program");
			}
		}
	}

}
