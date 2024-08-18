class A
{
  final int a=10;
  int x;
  int y;
 {
    System.out.println("initial block call from A");
 }
  static {
    System.out.println("static block call from A");
  }
 A(int x,int y)
 {
   this.x=x;
   this.y=y;
   System.out.println("Constructer A is call");
 }
 public void display()
 {
  System.out.println("Value of X "+x+" value of y "+y);
  //a=12; can not be assign again the final variable. 
  System.out.println("Value of a "+a);
 }
}
class B extends A
{
  int x;
  int y;
  int z;
  {
    System.out.println("initial block call from B");
  }
  static {
    System.out.println("static block call from B");
  }
  B(int x,int y)
  {
     super(20,30);
     z=10;
     this.x=x;
     this.y=y;
     System.out.println("Constructer B is call");
  }
  public void show()
 {
  System.out.println("Value of X B "+x+" value of y B "+y);
  System.out.println("Value of X A from B "+super.x+" value of y A from B "+super.y);
  System.out.println("Value of a "+a);
  display();
 } 
}
class C
{
  public static void main(String [] args)
 {
    B obj = new B(5,6);
    obj.show();
 }
}