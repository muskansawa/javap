import java.util.*;
class UserInput
{
	public static void main(String[] args)
	{
		int q = 4;
		Scanner sc = new Scanner(System.in);
		try
		{
		
		q = sc.nextInt();
		 
	    }
	    catch(Exception e){
	    	System.out.println("oops!");
	    	System.out.println(e.getMessage()); 
	    	e.printStackTrace(System.out);


	    }
	    finally{
	    	//sc.next();   it takes an extra input when there is no exception!
	    	sc.nextLine();
	    int w = sc.nextInt();
	    System.out.println(q+""+w);
	    }
		/*while(true)
		{
		System.out.println(q+w);
		}*/
	}
}