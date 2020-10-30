
public class Sign {
	long p;
	Sign(){
		
	}
	public long gcd( long g1, long g2) {
		if(g1==0)
			return g2;
		else
			return gcd(g2%g1,g1);
	}


	public long s1(long a, long k, long p) {
		return (long)Math.pow(a, k)%p;
	}
	public long s2(long m, long xa, long k , long s1) {
		long s2=(inv(k)*(m-xa*s1))%(this.p-1);
		return (s2+p-1)%(p-1);
	}
	long inv(long k) {
		for (int x = 1; x < p-1; x++) 
	           if ((k * x) % (p-1) == 1) 
	              return x; 
	        return 1; 
	}

}