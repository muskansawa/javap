class A extends Thread implements Runnable
{
     
     
	public void run ( )
	{ 
	try{
			for (int i=0; i<4; i++)
			{
				 Thread.sleep(100);
			
				System.out.print(Thread.currentThread().
			}
		}catch(InterruptedException e){
			  
		}

	}
}
public class Testlo {
  public static void main(String args[]) throws Exception
  {
       A a=new A( );
      Thread t=new Thread(a,"A");
      Thread t1=new Thread(a,"B");
      t.start();
       t.join();
        t1.start();
  }
}