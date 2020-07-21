import java.util.*;
class chefmate
{
	public static void main(String[] args)
	{
		int T,X,Y,K,N;

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int i;
		 for(i=0;i<T;i++)
		 {
		 	X =sc.nextInt();
		 	Y =sc.nextInt();
		 	K =sc.nextInt();
		 	N =	sc.nextInt();

		 	int j ;
		 	int arr[][] = new int[N][2] ;
		 	for(j=0;j<N;j++)
		 	{
		 		arr[j][0]  = sc.nextInt();
		 		arr[j][1]  = sc.nextInt();

		 	}
		 	int pl = X-Y; // no. of pages needed by chef
		 	int c = 999;

		 	for(j=0;j<N;j++)
		 	{
		 		if((arr[j][0]>=pl)&&(arr[j][1])<=K)
		 		{
		 			if(c!=999)
		 			{
		 				if(arr[j][1]<arr[c][1])
		 				c = j;
		 			}
		 			else c=j;

		 		}
		 	}

		 	if(c== 999)
		 		System.out.println("UnLuckyChef");
		 	else 
		 		System.out.println("LuckyChef");
		 }//close of a test case
	}
}