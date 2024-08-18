import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;
class A
{ 
  public static void main(String[]args)
  {
     int x=0;
     int y=0;
     Scanner sc=new Scanner(System.in);
     try
     {
      x=sc.nextInt();
      y=sc.nextInt();
      int div=x/y;
      System.out.println("Division is "+div);
     }
     catch(InputMismatchException e)
     {
      System.out.println("only integer is insert ");
     }
     catch(ArithmeticException e)
     {
      System.out.println("denomenator can't be zero ");
     }
      catch(Exception e)
     {
       System.out.println("only catch ");
     }
     finally
     {
       System.out.println("Try catch is finish ");
     }
     System.out.println("Sum is "+(x+y));
  }
}