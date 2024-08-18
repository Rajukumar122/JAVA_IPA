package FileHandling;
import java.io.File;
//import java.io.IOExecption;
class CreateFile
{
   public static void main(String[] args)
   {
     try{
       File myobj=new File("D:\\javaProgram\\File1.txt");
       if(myobj.createNewFile())
       {
         System.out.println("File Created "+myobj.getName());
       }
       else
       {
          System.out.println("File Created is allready exists ");
       }
      }
      catch(Exception e)
      {
          System.out.println(" an error is occured ");
          //e.printStackTrace();
      }
   }

}