class SplitSTRING
{
	public static void main(String[] args)
	{
	String s = "apple and: oranges";
	
	String[] parts =  s.split(" ");
	 for(int i=0;i< parts.length ;i++)
	 {
	 	System.out.println(parts[i]);  
	 }

	 System.out.println( );

	 String[] parts2 =  s.split(":");
	 for(int i=0;i< parts2.length ;i++)
	 {
	 	System.out.println(parts2[i]);  
	 }
	 
	



	}
}
/* output:

apple
and:
oranges

apple and
 oranges
*/