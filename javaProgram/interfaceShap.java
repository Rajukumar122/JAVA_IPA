interface Shape
{
  void area();
}
abstract class figure
{
  protected int length;
  protected int breadth;
  public abstract void perimeter();
}
class Rectangle extends figure implements Shape
{
  Rectangle(int length, int breadth)
  {
   this.length=length;
   this.breadth=breadth;
  }
  public void area()
  {
   System.out.println("Area of Rectangle : "+(length*breadth));
  }
  public void perimeter()
  {
   System.out.println("Perimeter of Rectangle : "+2*(length+breadth));
  }
}
class A
{
  public static void main(String[]args)
  {
    Rectangle obj=new Rectangle(10,20);
    obj.area();
    obj.perimeter();
  }
}