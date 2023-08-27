class NewThread implements Runnable
  {
    public void run()
    {
      for(int i=0;i<=10;i++)
        {
          if(i%2==0){
          if(i==6)
          {
            continue;
          }
          else{
          System.out.println(i+" "+Thread.currentThread().getId());
          }
        }
          else{
            continue;
          }
        }
    }
  }
class SampleThread2
  {
    public static void main(String args[])
    {
      NewThread t1=new NewThread();
      NewThread t2=new NewThread();
      NewThread t3=new NewThread();
      Thread nt1=new Thread(t1);
      Thread nt2=new Thread(t2);
      Thread nt3=new Thread(t3);
       nt1.start();
      nt2.start();
      nt3.start();
    }
  }