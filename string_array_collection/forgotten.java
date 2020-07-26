import java.util.*;

class forgotten
{
	public String check(int K,String S,String[] phrase)
	{
		for(int k=0;k<K;k++)
		 		{

		 			String[] parts =  phrase[k].split("\\s+"); //maybe it is seprated by multiple space so \\s+
		 			for(int l=0;l<parts.length;l++)
		 			{
		 				 
		 				String ss = parts[l];
		 				if(S.equals(ss))
		 				{ 
		 					 
		 					return "YES";

		 				}

		 			}
		 		}
		 		return "NO";

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		forgotten ob = new forgotten();
		 int T = sc.nextInt();
		 for(int i=0;i<T;i++)
		 {
		 	int N, K;
		 	N= sc.nextInt();
		 	K= sc.nextInt();
		 	String fword[] = new String[N];
		 	String phrase[] = new String[K];

		 	for(int j=0;j<N;j++)
		 	{
		 		fword[j] = sc.next();
		 	}
		 	sc.nextLine();
		 	for(int p=0;p<K;p++)
		 	{
		 		phrase[p] = sc.nextLine();
		 	}


		 	for(int j=0;j<N;j++)
		 	{
		 		String S = fword[j];
		 		String yn = ob.check(K,S,phrase);
		 		System.out.print(yn+" ");
		 		 
		 	}
		 	System.out.println();


		 }

	}
}