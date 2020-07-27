import java.util.Arrays;
class terse{

	public static void main (String[] args)
	{
		int i ;
		long j;
		for(i=0,j=9;i<10;System.out.print(j++),i++,System.out.println(" is the price "),j=j*40)
		{
			//mandatory to put brackets here
		}

		int arr[] = {1,2,34,55,5};
		String s ="";
		//Arrays.stream(arr).forEach(e->System.out.print(e + " ")); //1 2 34 55 5
		Arrays.stream(arr).forEach(e->if(e==35){s="yes";}); 
		System.out.println(s);
		//1 2 34 55 5
		
	}
}