class Sign {
	
	public long p,alpha,beta,m,r,s,k,d;
	
	private long z;
	
	Sign(long a, long b,long c,long d, long e){
		p=a;
		alpha=b;
		beta=((long)Math.pow(alpha, z))%p;
		m=c;
		this.d=e;
		k=d;//createK();
		z=e;
		r=createS1(alpha,k);
		s=createS2();
	}
	
	long gcd(long g1,long g2) {
		if(g2==0)
			return g1;
		else
			return gcd(g2,g1%g2);
	}
	
	/*long createK() {
		long a = 2*(p-1);
		while(gcd(a,p-1)!=1) {
			a = (long) (Math.random()*(p-1));
		}
		return a;
	}*/
	
	long inv(long k) {
		for (int x = 1; x < p-1; x++) 
	           if ((k * x) % (p-1) == 1) 
	              return x; 
	        return 1; 
	}
	
	long createS1(long b, long c) {//Computes S1 = a^k % p
		long a=(new Double(Math.pow(b, c)).longValue())%p;
		
		if(a<(new Double(Math.pow(2, 36)-1).longValue())) {
			System.out.println("S1 "+a);
			return a%p;
		}
		else//(a==(long)Math.pow(2, 36)-1)
			return (createS1(b,c/2)*createS1(b,c-c/2))%p;
	}
	
	long createS2() {
		long a=(inv(k)*(m-z*r))%(p-1);
		if(a>=0)
			return a;
		else
			return (a+p-1);
	}
	
	
}