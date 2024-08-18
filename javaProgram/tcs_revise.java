
// Basic java Concept

/*class A
{
  public int a;
   int b;
  final static int x;
  // {
  //   x=10;
  // }
  // static int b;
  static{
    x=20; //if final veriable is static then only initilise in static block.
  }
   A()
   {
     this(2,3);
     System.out.println(" parent constructer is called ");
   }
   A(int a, int b)
   {
    this.a=a;
    this.b=b;
     System.out.println("parent constructer is called with argument ");
   }
  {
    System.out.println("Initalise block Called ");
  }
  static
  {
    // System.out.println("value of b : "+b);
    // b=12;
    System.out.println("static block Called ");
  }
  // public static void run()
  // {
  //    System.out.println("value of b from static method : "+b);
  // }
  public void display()
  {
      System.out.println("Value of a & b : "+a+" "+b);
      System.out.println("final variable value  : "+x);
  }
  //  public void show()
  // {
  //     System.out.println("Value of a & b :  "+a+" "+b);
  // }
}
final class D 
{
    final int y;
    D()
    {
      y=10;
      System.out.println("final variable is initilised "+y);
    }
    public final void display()
    {
      System.out.println("final variable value  : "+y+" ");
    }
}
class C extends A
{
  int a,b;
  C()
  {
    // super(2,3);
    // this(5,6);
    System.out.println("Child class constructer called ");
  }
  // C(int a, int b)
  // {
  //   super(10,20);
  //   System.out.println("Child class constructer called with parameter ");
  //   this.a=a;
  //   this.b=b;
  // }
  public void show()
  {
      display();
      System.out.println("Value of a & b : "+super.a+" "+super.b+" "+a+" "+b);
  }
}
class B
{
  public static void main(String[]args)
  {
      C obj= new C();
    //  int a;
    //  System.out.println("Value of a : "+a);
    //  A.run();
    //  A.b=25;
    //  A.run();
    //  obj.display();
    D obj1= new D();
     obj.show();
     obj1.display();
  }
}*/





/*class B
{
   protected int a,b;
   B(int a, int b)
   {
      this.a=a;
      this.b=b;
   }
   public void area(int a,int b)
   {
      System.out.println("Area to be calculated"+a+" "+b);
   }
  //  public int area(int a,int b)
  //  {
  //     System.out.println("Area to be calculated"+a+" "+b);
  //     return 0;
  //  }
  //   public void area()
  //  {
  //     System.out.println("Area to be calculated");
  //  }
}
class A
{
    public static void main(String[]args)
    {
        B obj=new B(2,3);
        obj.area(2,3);

    }

}*/






//abstract class 

// abstract class Car
// {
//    protected int length;
//    protected int breadth;
//    public abstract void myBreak();
//    public abstract void battery();
//    public void run(){
//      System.out.println("run function call inside car class");
//    }
// }
// class Alto extends Car
// {
//    Alto(int length,int breadth)
//    {
//       this.length=length;
//       this.breadth=breadth;
//    }
//    public void myBreak()
//    {
//     System.out.println("Break function call inside car class");
//    }
//    public void battery()
//    {
//     System.out.println("battery function call inside car class");
//    }
//    public void run()
//    {
//     System.out.println("run function call inside Alto class");
//    }
// }
// class Nano extends Car
// {
//    Nano(int length,int breadth)
//    {
//       this.length=length;
//       this.breadth=breadth;
//    }
//    public void myBreak()
//    {
//     System.out.println("Break function call inside car nano");
//    }
//    public void battery()
//    {
//     System.out.println("battery function call inside car nano");
//    }
// }
// class A
// {
//      public static void main(String[]args)
//      {
//          Car obj=new Alto(2,3);
//          obj.myBreak();
//          obj.battery();
//          obj.run();
//          Nano obj1=new Nano(2,3);
//          obj1.myBreak();
//          obj1.battery();
//          obj1.run();
         
//      }
// }



//interface multiple inharitance implementation
/*interface A 
{
  void abc();
   default void show()
   {
     System.out.println(" The show method from interface A ");
   }
}
interface B
{
  void bcd();
   default void show()
   {
     System.out.println(" The show method from interface B ");
   }
}
class C implements A,B
{
   public void abc()
   {
    System.out.println(" The abc method from class C ");
   }
   public void bcd()
   {
    System.out.println(" The bcd method from class C ");
   }
   public void show()
   {
       System.out.println(" The show method from class C ");
       A.super.show();
       B.super.show();
   }
}
class Demo 
{
  public static void main(String[] args)
  {
        C obj=new C();
        obj.abc();
        obj.bcd();
        obj.show();
  }
}*/
class A 
{
   int a;
   int b;
   A (int a, int b)
   {
     this.a=a;
     this.b=b;
   }
   public void show()
  {
    System.out.println("I am from A");
  }
}
class B extends A{
  B (){
    super(12,23);
  A obj= new A(12,23);
  obj.show();}
  public void show()
  {
    System.out.println("I am from B");
  }
}
class Demo{
  public static void main(String[]args)
  {
    System.out.println("Hello World");
    B obj= new B();
    obj.show();
  }
}