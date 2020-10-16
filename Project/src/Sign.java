
public class Sign {
	static long m,k,q,S1,S2;
	public static int gcd(long e,long f) {
		if(e==f)
			return 0;
		if(f==1)
			return 1;
		else return gcd(f,f%2);
	}
	
}
