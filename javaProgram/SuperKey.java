
class A
{
  int a;
  int b;
  A(int a, int b)
  {
    this.a=a;
    this.b=b;
  }
  void display()
  {
    System.out.println("value of x "+a+" value of y "+b);
  }
}
class B extends A
{
  int a=15;
  int b=25;
  B()
  {
    super(10,20);
  }
  void display1()
  {
    System.out.println("value of x "+a+" value of y "+b);
    System.out.println("value f parent x "+super.a+" value of parent y "+super.b);
  }
}
class C
{
  public static void main(String[]args)
  {
    B obj= new B();
    obj.display();
    obj.display1();
  }
}