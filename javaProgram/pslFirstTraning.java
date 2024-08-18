class A
{
 private float a=10;//instance variable only created inside the class
 private  int  b=15;
 private static int c=12;//static variable only created inside the class not on in method
 A()//if not created stil excute the program due to defult constructor
{
  
} 
  public float add()
{
  return (a+b);
}
 public static void main(String[]args)
{
   A obj= new A();// create a object to excess the instance variable of the class
    // defult constructor is created 
   System.out.println(c);//direct access static variable
   System.out.println(obj.b);// To access the veriable with the help of object
   System.out.println(obj.add());
}
}