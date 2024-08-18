abstract class Shape
{
  protected int length;
  protected int breadth;
  public abstract void perimeter();
  public void area()
  {}
}
class Rectangle extends Shape
{
  Rectangle(int l,int b)
  {
     length=l;
     breadth=b;
  }
  public void perimeter()
  {
    System.out.println("Perimeter of Perimeter :"+2*(length+breadth));
  }
  public void area()
  {
    System.out.println("Area of Rectangle :"+(length*breadth));
  }
}
class Square extends Shape
{
  Square(int l)
  {
     length=l;
  }
  public void perimeter()
  {
    System.out.println("Perimeter of Square :"+4*length);
  }
  public void area()
  {
    System.out.println("Area of Square :"+(length*length));
  }
}
class AbstructClass
{
   public static void main(String[]args)
   {
      Shape obj1= new Rectangle(12,10);
      Shape obj2= new Square(12);
      obj1.perimeter();
      obj1.area();
      obj2.perimeter();
      obj2.area();
   }

}