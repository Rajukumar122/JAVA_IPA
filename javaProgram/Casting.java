//upcasting 
class Parent
{
   String name;
   public void display()
   {
     System.out.println("Parent class Display is call");
   }
}
class Child extends Parent
{
  int age;
  public void show()
   {
     System.out.println("Child class Show is call");
   }
}
class A
{
   public static void main(String[]args)
   {
     //upcasting
     Parent obj =new Child();//implicitily 
     //obj.show();
     // when  call the method
    //obj.show();symbol:method show(), location: variable obj of type Parent
     obj.display();
     

    //downCasting
    Child obj1=(Child)obj;//explicitely
    obj1.show();
    obj1.display();

    System.out.println("Normal not explicitly and implicitily simple Inheritance ");
    Child obj2=new Child();
    obj2.show();
    obj2.display();

   //Child obj3= new Parent();
   // error: incompatible types: Parent cannot be converted to Child
    
   }
}