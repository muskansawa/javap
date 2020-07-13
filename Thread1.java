public class Thread1 {
  public static void main(String args[])
  {
      StringThread s=new StringThread(5);
      Thread t1=new Thread(s);
      t1.start();
  }
}
class StringThread extends Thread implements Runnable
{
    private int num;
    StringThread (int n) 
	{
		num=n;
	}
	
	public void run ( ) 
	{
		for (int i=1; i<=num; i++)
			System.out.print("Java" + " ");
	}
}
