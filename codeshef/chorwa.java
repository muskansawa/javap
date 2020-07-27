import java.util.*;

class chorwa
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T;i++)
		{
			int M,x,y;
			M = sc.nextInt();
			x = sc.nextInt();
			y= sc.nextInt();

			int police[] = new int[M];
			for(int j =0;j<M;j++)
			{
				police[j] = sc.nextInt(); //entering house no. of police
			}
			 Arrays.sort(police);
			 int th = 100;
			 if(police[0]>=(x*y))
			 {
			 	th =th - (x*y)-1;
			 }
			 else 
			 	th = th- police[0];
			 for(int j =0;j<M-1;j++)
			{
				if(police[j+1] - police[j]>=(2*x*y))
				{

					th = th - (2*x*y)-1;

				} 
				else{
					th = th -(police[j+1] - police[j]);
				} 
			}
			if((100-police[M-1])>=(x*y))
			 {
			 	th =th - (x*y);
			 }
			 else
			 {
			 	th = th -(100-police[M-1]);
			 }
			 System.out.println(th);

		}

	}
}