import  java.util.Iterator;
import java.util.TreeSet;

public class Testend
{
	public static void main(String[] args)
	{
	TreeSet s1 = new TreeSet();
	s1.add("one");
	s1.add("two");
	s1.add("three");
	s1.add("one");

	  Iterator it = s1.iterator();
	 while(it.hasNext())
	 {
	 System.out.println(it.next() +" ");

	 }

	}
}