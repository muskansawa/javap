import java.util.*;

public class Testphir
{
	public static void main(String[] args)
{
	Set s = new TreeSet();
	s.add("7");
	s.add(9);
	Iterator itr = s.iterator();
	while(itr.hasNext())
	System.out.println(itr.next()+" ");
}}