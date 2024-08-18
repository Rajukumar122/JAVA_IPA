class A 
{
    protected int a,b;
    A(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    A(A c)
    {
        a=c.a;
        b=c.b;
    }
    public void display()
    {
        System.out.println("value of a & b "+a+" "+b);
    }
}
class Demo 
{
    public static void main(String[]args)
    {
        A obj= new A(2,3);
        A obj1= new A(obj);
        A obj2=obj;
        obj.display();
        obj2.display();
        obj1.display();

    }
}