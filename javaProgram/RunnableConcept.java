abstract class A implements Runnable
{
    void run()
    {
     System.out.println("Hello!");
    }
}
class B
{
   public static void main(String[]args)
  {
     
    A obj1 = new A();
    Thread th1 = new Thread(obj1);
  }
}