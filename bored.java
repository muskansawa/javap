import java.lang.*;
 
class bored{
	 
	final static String s="9" ;

	public static void main(String[] args){
	//s = "10";
	 int y = Integer.parseInt(s);
	 String ss = Integer.toString(y);
	ss = "M"+ss;
	 
	System.out.println(y);	
	System.out.println(ss);

// casting , how we have  a risk of loosing info
	double me = 19.11;
	int her = (int)me;
	System.out.println(her);


	}
}