import first.*;
import second.*;
import first.first1.*;
class Packages
{
    public static void main(String[]args)
    {
        First_A obj=new First_A();
        obj.first_A_method();
        First_AB obj4=new First_AB();
        obj4.first_AB_method();
        First_B obj1=new First_B();
        obj1.display();
        Second_A obj2=new Second_A();
        obj2.second_A_method();
        First1_A obj3=new First1_A();
        obj3.first1_A_method();
    }
}