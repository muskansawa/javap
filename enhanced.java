import java.util.*;
class enhanced
{
	public static void main(String[] args)
	{
	 int ar[] = {1,62,73,67,75};

	 for(int i:ar)
	 {
	 	//System.out.println(i);
	 }//enhanced for loop

	 int y = 67;
	 int x =Arrays.binarySearch(ar,y);
	 //System.out.println(x );

	 int a1[] = Arrays.copyOf(ar , 6);
	 for(int f : a1)
	 {
	 	//System.out.println(f);
	 }

	 //next it does the same thing but copies in range
	 int a2[] = Arrays.copyOfRange(ar , 2,7); // agar orignal ke length se jyada range hai toh 0 add hojayega
	 for(int f : a2)
	 {
	 	//System.out.println(f);
	 }

	 //next we check if 2 arrays have same elements , this work for 2d or more dimensions array
	 Object o1[] = {1,6,8,9};
	 Object o2[] = new Object[]{1,6,8};
	 //System.out.println(Arrays.deepEquals(o1,o2));

	 // next to check equality of 1d arrays
	 System.out.println(Arrays.equals(o1,o2));
	 Arrays.fills


	}
}