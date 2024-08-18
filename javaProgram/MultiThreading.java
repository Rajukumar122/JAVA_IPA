class Printer
{
   //synchronized void PrintDocument(int num , String name)
   // one way to synchronized the the methon on workinr on same printer object in multiple Threading
   void PrintDocument(int num , String name)
   {
     for(int i=1;i<=num;i++)
     {
        try{
          Thread.sleep(500);
        }
        catch( InterruptedException e)
        {
           e.printStackTrace();
        }
        System.out.println(i+" @@ Document Is "+name);
     }
   }
}
class MyThread extends Thread
{
  Printer ptr;
  MyThread(Printer p)
  {
    ptr=p;
  }
  
  public void run()
  {
   //another way to synchronized the the methon on workinr on same printer object in multiple Threading
    synchronized(ptr){
    ptr.PrintDocument(10,"RANJAN");
    }
    //ptr.PrintDocument(10,"RANJAN");
  }

}

class YourThread extends Thread
{
  Printer pftr;
  YourThread(Printer p)
  {
    pftr=p;
  }
  
  public void run()
  {
    //another way to synchronized the the methon on workinr on same printer object in multiple Threading
    synchronized(pftr){
     pftr.PrintDocument(10,"Sanjit");
    }
    //pftr.PrintDocument(10,"Sanjit");
  }

}
class MultiThreading
{
  public static void main(String[] args)
  {
    System.out.println("===Application is started===");
    Printer printer = new Printer();
    // Scenerio is that we have mutlipal thread working on  same printer object 
    // if multiple threading is going to work on same printer object then we must be synchronize them.
    MyThread mythread = new MyThread(printer); // mythread is the reference to the printer object
    YourThread yourthread = new YourThread(printer); // mythread is the reference to the printer object
    mythread.start();
    
    /* try{
          mythread.join();
        }
        catch( InterruptedException e)
        {
           e.printStackTrace();
        } */
    yourthread.start(); 
    //printer.PrintDocument(10,"RAJU");
     System.out.println("===Application is ended===");
  }
}