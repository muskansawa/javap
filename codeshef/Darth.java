import java.util.*;

class Darth
{
	  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int T = sc.nextInt();

	  while(T>0)
	  {

			int H = sc.nextInt();
		  	int P = sc.nextInt(); //power  bar of chef
		  	 

		  	while(P>0)
		  	{

		  		H = H - P;

		  		P = P/2;

		  	}
		  	
		  		System.out.println((H>0)?0:1);
		  	 
		  	T--;

	  }

		
	}
}