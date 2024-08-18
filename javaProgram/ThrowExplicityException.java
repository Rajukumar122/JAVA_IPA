//explicitly throw the exception through throw (new) key word but not call method inside the user define class excepton(extends RuntimeException)
/*import java.util.Scanner;
class A
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
     int age=sc.nextInt();
     if(age<18)
     {
        try
        {
             throw new AgeNotValidException();
        }
        catch(AgeNotValidException e)
        {
           System.out.println("YOU ARE ELIGIBLE FOR LICENCE ");
        }
     }
     else
     {
       System.out.println("YOU ARE ELIGIBLE FOR LICENCE ");
     }
  }
}

class AgeNotValidException extends RuntimeException
{

}*/



//Execption manage through call the method of user define Exception classs
import java.util.Scanner;
class A
{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
   //   int age=sc.nextInt();
   //   if(age<18)
   //   {
   //    int i=0;
      //   do{
      //   if(age<10)
      //   {
      //     try{
      //        throw new AgeForChild();
      //     }
      //     catch(AgeForChild e)
      //     {
      //        System.out.println("You are child ");
      //        e.getMassage1();
      //        System.out.println(e.getMassage2());
      //     }
      //   }
      //   i++;
      //   }while(i!=2);
        try
        {
          int age=sc.nextInt();
            //  throw new AgeNotValidException();
             return ;
        }

        //Parent catch method is invocked always at the bottom of the catch block 
        catch(Exception e)
        {
          System.out.println("Hello");
        }
      //   catch(AgeNotValidException e)
      //   {
      //      System.out.println(e.getMassage1());
      //      e.getMassage2();
      //   }
        finally
        {
           System.out.println("YOU ARE ELIGIBLE FOR LICENCE 122");
        }
   //   }
   //   else
   //   {
   //     System.out.println("YOU ARE ELIGIBLE FOR LICENCE ");
   //   }
  }
}
//user define exception


class AgeNotValidException extends Exception
{
   public String getMassage1()
   {
     return "YOU ARE NOT ELIGIBLE FOR LICENCE";
   }  
   public void getMassage2()
   {
     System.out.println("ThankYou to You Interest");
   }  
}
class AgeForChild extends RuntimeException
{
    public void getMassage1()
    {
       System.out.println("you are below the age ");
    }
    public String  getMassage2()
    {
       return " please read the instructer carefully ";
    }
}