
import java.math.*;
class Bigin{
	public static void main(String[] args)
	{
		BigInteger b;
		b = new BigInteger("123");
		System.out.println("big integer ="+b);
		Integer x = b.intValue();
		System.out.println("integer value ="+x);
		double k = Math.random();
		System.out.println (k);
		//--------------------

		int low = 1;      
		int high=6;  
		  int rnd = (int)(Math.random() * (high - low + 1)) + low;
		  System.out.println("random dice no. ="+rnd);

		 //-----
		  double t= 2.3;
		  long r = Math.round(t);
		  System.out.println("round used="+r);
	}
}