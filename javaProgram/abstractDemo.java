abstract class shape
{
   protected int length;
   protected int breadth;
   public abstract void area();
   public abstract void perimeter();
}

class Rectangle extends shape
{
  Rectangle(int length,int breadth)
  {
     this.length=length;
     this.breadth=breadth;
  }
  public void area()
  {
    System.out.println("Rectangle area is called "+(length*breadth));
  }
  public void perimeter()
  {
    System.out.println("Rectangle perimeter is called "+(length+breadth));
  }
}

class Square extends shape
{
  Square(int length,int breadth)
  {
     this.length=length;
     this.breadth=breadth;
  }
  public void area()
  {
    System.out.println("Square area is called "+(length*breadth));
  }
  public void perimeter()
  {
    System.out.println("Square perimeter is called "+(length+breadth));
  }
}


public class abstractDemo
{
  public static void main(String[]args)
  {
    shape obj1= new Rectangle(10,20);//shape reference class and object of rectangle 
    shape obj2= new Square(15,15);
    obj1.area();
    obj1.perimeter();
    obj2.area();
    obj2.perimeter();
  }
}
