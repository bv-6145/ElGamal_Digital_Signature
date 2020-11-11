public class Verification {
	
	public long p,alpha,beta,m,r,s;
	
	Verification(long a, long b,long c,long d, long e,long f){
		p=a;
		alpha=b;
		beta=c;
		m=d;
		r=e;
		s=f;
	}
	
	/*long v1() {
		return ((((long)Math.pow(beta,r))*((long)(Math.pow(r, s))))%p);
	}*/
	
	long v1(long b, long c,long d,long e) {
		long a =(new Double(Math.pow(b, c)).longValue())*(new Double(Math.pow(c, d)).longValue())%e;
		if(a<(long)Math.pow(2, 36)-1)
			return a%p;
		else//(a==(long)Math.pow(2, 36)-1)
			return (v1(b,c/2,d,e/2)*v1(b,c-c/2,d,e-e/2))%p;
	}
	
	

	long v2() {
		return ((new Double(Math.pow(alpha, m)).longValue())%p);
	}
	
	long v2(long b, long c) {
		long a=((long)Math.pow(b, c));
		if(a<(long)Math.pow(2, 36)-1)
			return a%p;
		else//(a==(long)Math.pow(2, 36)-1)
			return (v2(b,c/2)*v2(b,c-c/2))%p;
	}
	
	void verified() {
		if(v1(beta,r,r,s)==v2(alpha,m)) {
			System.out.println("Signature verified using ElGamal.");
			System.out.println("The value of v1 mod p: "+v1(beta,r,r,s));
			System.out.println("The value of v2 mod p: "+v2(alpha,m));
		}
		else {
			System.out.println("Signature missmatch");
			System.out.println("The value of v1 mod p: "+v1(beta,r,r,s));
			System.out.println("The value of v2 mod p: "+v2(alpha,m));
		}
	}
}

