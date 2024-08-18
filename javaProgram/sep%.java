
class Prime extends Thread
{
  public void run()
  {
     try {
         for(int i=0;i<5;i++)
         {
          System.out.println("Prime Number "+(i+1));
          Thread.sleep(1000);
         }
        }
        catch (Exception e) {
            System.out.println(e);
        }     
  }
}

class Even extends Thread
{
  public void run()
  {
     try {
         for(int i=0;i<5;i++)
         {
          System.out.println("Even Number "+(i+1));
          Thread.sleep(1000);
          }
        }
        catch (Exception e) {
            System.out.println(e);
        }   
  }
}

class MyThread
{
   
   public static void main(String[]args)
   {
      System.out.println("===Application has been started===");
      Even th=new Even();
      Prime th1=new Prime();
      th.start();
      th1.start();
      System.out.println("===Application has been ended===");
   }
}