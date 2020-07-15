// is string variable an object or a reference to an object?

/*Strings are Reference/Complex Object Type
They store a reference to the object rather than the object itself. When you assign a string variable to another variable, It actually copies the reference to the object but not the object itself */

class TestSTRING
{
	public static void main(String[] args)
	{
	String s = "apple and oranges";
	String ss = "APPLE AND ORANGES";

	System.out.println(s.equals(ss));
	System.out.println(s.equalsIgnoreCase(ss));

	}
}