import java.util.*;

class rainbow
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =0;i<T;i++)
		{
			int N = sc.nextInt();
			int ar[] = new int[N];

			for(int j = 0;j<N;j++)
			{
				ar[j] = sc.nextInt(); //entering nos. in array
			}
			int mid =0;
			boolean rainarr = true;
			if(N%2==0)
			{
				mid = (N/2)-1;

			}
			else
			{
				mid= (N-1)/2;
			}
			for(int j = 0;j<=mid;j++)
			{
				if(ar[j]!=ar[N-j-1])
				{
					rainarr= false;
					break;
				}
				if( j>0 && ar[j]-ar[j-1]>1 )//&& ar[j]<ar[j+1]  )
					{
					rainarr= false;
					break;
				}

				if(ar[0]!=1)
					{
					rainarr= false;
					break;
				}
				if(ar[mid]!=7)
					{
					rainarr= false;
					break;
				}



			}
			System.out.println(rainarr?"yes":"no");
			 
		}

	}
}