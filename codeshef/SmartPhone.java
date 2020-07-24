import java.util.*;
class SmartPhone
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ar[] = new long[n];//k

		for(int i =0;i<n;i++)
		{
			ar[i] = sc.nextLong();
		}

		//go through each element and see if can be kept the price of app for max revenue

		int    gn=0;
		long temp = ar[0]  ,rev=0,r=0;
		for(int i= 0;i<n;i++)
		{
			gn=0;
			//loop to count how many customers are available for a particular customers budget
			for(int j=0;j<n;j++)
			{
				if(ar[j]>=ar[i])
				{
					gn++;
				}
			}
			r = ar[i]*gn;
			if(r> rev)
			{
				temp = ar[i];
				rev = r;
			}

		}
		//calculated the best price
		System.out.println(rev);

	}
}