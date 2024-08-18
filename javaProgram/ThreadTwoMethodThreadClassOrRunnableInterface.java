
//Thread class
/*class MyThread extends Thread
{
   public void run()
   {
      System.out.println("I am from run method ");
   }
   
   public static void main(String[]args)
   {
      MyThread th=new MyThread();
      th.start();
   }
}*/



//parallel run MyTask and main Thread
/*class MyTask extends Thread
{
  public void run()
  {
    for(int i=0;i<10;i++)  
    {
       System.out.println("@@ Printed Document #"+i+" Printer 2");
    }    
  }
}
class MyThread
{
   
   public static void main(String[]args)
   {
      System.out.println("===Application has been started===");
      MyTask th=new MyTask();
      th.start();
      for(int i=0;i<10;i++)  
      {
       System.out.println("^^ Printed Document #"+i+" Printer 1");
      } 
      System.out.println("===Application has been ended===");
   }
}*/














//Runnable class

/*class MyThread implements Runnable
{
   public void run()
   {
      System.out.println("I am from run method ");
   }
   
   public static void main(String[]args)
   {
      Thread th=new Thread(new MyThread());//Important syntex to call
       MyThread th=new MyThread();
      th.start();
   }
}*/



/*

class A
{


}*/

/*class MyTask extends Thread , A*/ //its not possible due to java doesnot support multiple Inheritance
/*
class MyTask extends A implements Runnable
{
  public void run()
  {
    for(int i=0;i<10;i++)  
    {
       System.out.println("@@ Printed Document #"+i+" Printer 2");
    }    
  }
}
class MyThread
{
   
   public static void main(String[]args)
   {
      System.out.println("===Application has been started===");
      Runnable r= new MyTask();// reference veriable of interface pointing to the object 
      Thread th=new Thread(r);
      th.setDaemon(true); // its excuted by the jvm abd it will Excuted along main Thread
      th.start();// automattically invoke run method
*/
      /*new Thread(new MyTask()).start();*/ // another method to create the reference of interface and object 
      
/*
      for(int i=0;i<10;i++)  
      {
       System.out.println("^^ Printed Document #"+i+" Printer 1");
      } 
      System.out.println("===Application has been ended===");
   }
}*/




class Mythread implements Runnable
// class Mythread extends Thread
{
   public void run()
   {
      for(int i=1;i<=5;i++)
      {
         System.out.println(i);
      }
   }
   public static void main(String[]args)
   {
      Runnable mythread= new Mythread();
      Thread th1=new Thread(mythread);
      th1.start();
      System.out.println("HELLO1");
      System.out.println("HELLO2");
      System.out.println("HELLO3");
      System.out.println("HELLO4");
      System.out.println("HELLO5");
   }
}
