class NewThread extends Thread
  {
    public void run()
    {
      for(int i=0;i<=10;i++)
        {
          System.out.println(i+" "+Thread.currentThread().getId());
        }
    }
  }
class SampleThread
  {
    public static void main(String args[])
    {
      NewThread t1=new NewThread();
      NewThread t2=new NewThread();
      t1.start();
      t2.start();
    }
  }