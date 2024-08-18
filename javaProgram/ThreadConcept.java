class MyThread extends Thread
{
  public void run()
  {
    System.out.println("This is from Thread");
  }
}
public class ThreadConcept 
{
 public static void main(String[]args)
 {
   MyThread th1= new MyThread();
   th1.start();
   System.out.println("hello1");
   System.out.println("hello2");
   System.out.println("hello3");
   System.out.println("hello4");
   System.out.println("hello5");
   System.out.println("hello6");
   System.out.println("hello7");
 }
}