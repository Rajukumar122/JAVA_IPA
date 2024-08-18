class A
{
  int a;
  int b;
  A(int a , int b)
  {
   this.a=a;
   this.b=b;
  }
  A(int a)
  {
   this.a=a;
  }
  A(A s)// copy constructor 
  {
   this.a=s.a;
   this.b=s.b;
  }
  public void show()
  {
   System.out.println("Value of a "+a);
  }
  public void show1()
  {
   System.out.println("Value of a "+a+" Value of b "+b);
  }  
  public static void main(String[]args)
  {
    A obj=new A(10,20);
    obj.show1();
    A obj1=new A(10,20);
    A obj3=obj;
    obj1.show();
    obj.show1();
  }
}