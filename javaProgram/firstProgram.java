 class Test

{

      public static void main(String args[])

 {
   String s01="abcde";
   System.out.println(s01.substring(1,4));//sub String method to 1 to 3 index print
   String s02="Hello";
   System.out.println(s02.indexOf("t")); // return -1 if element is not found 
   System.out.println(s02.indexOf("o")); // it will return index o i.e 4;
   //================================================================

   String str1 = "ap";
   String str2 = "br";
   //if srt1 is lexicographically greater then str2 then give positive value
   //if srt2 is lexicographically greater then str2 then give negative value
   //if srt1 is lexicographically equal to str2 then give zero value
   //if s1 > s2, it returns positive number  
   //if s1 < s2, it returns negative number  
   //if s1 == s2, it returns 0  

   System.out.println(str2.compareTo(str1));
   String s1="hello";  
   String s2="hello";  
   String s3="meklo";  
   String s4="hemlo";  
   String s5="flag";  
   System.out.println(s1.compareTo(s2));//0 because both are equal  
   System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
   System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
   System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" 

  }

}




/*class A
{
        {
          System.out.println("test"); // it will display when object is invoked
        }

  public static void main(String[] arr){

        A obj= new A();// if not create object then not call the static block as simple no output
  }
}*/



/*class A
{
  
 	   public static void main(String[] args) { 

    	double a, b,c;

    	float a1;

    	//a1=10.0/0;//error: incompatible types: possible lossy conversion from double to float a1=10.0/0;
        a1=10.0f/0;
        c=10.0/0;
       // a = 4/0;
       //Exception in thread "main" java.lang.ArithmeticException: / by zero at A.main(firstProgram.java:14)
        a = 4/0.0;//or 4.0/0;
        b = 0/3.0;

        System.out.println(a1);

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

    }
}*/




/*class A
{
  
 	   public static void main(String[] args) { 

    	char c = 65;

		System.out.println("c = " + 'c');//c=A ascii value of 65 is A;

    }
}*/




/*class A
{
  
       public static void main(String args[])

  {

	  System.out.println( "RAJU"+"A" + "B" + 'A' + 'a'+93);//RAJUABAa93
          System.out.println('A' +'a'+93);//225
          System.out.println('A' +'a');//162
         //if char are comming together with string the print actual value but 
         //when char comming with value or only char then print ascci value or sum it .

  }
}*/







/*class A
{
  
      static int i = 1;//no meaning hear

  public static void main(String args[])

  {

	  System.out.println('j' + 'a' + 'v' + 'a');// a-z=97-122 ||A-Z=65-90 and 
       // j=106(97+9 not 10)+97+118+97

}
}*/






/*class A
{
  
      public static void main(String[] args)

    {

        if (true)

            break; // break statement for the loop or switch;

    }
}*/




/*class A
{
  
       public static void main(String[] arr)//at least one time this method is present;
      { 
            
        System.out.println("Hello1");
             A.main("A");//run time polymorphism
            A.main(2);//run time polymorphism
      }

    public static void main(String arr){
  //it will also compile without String [] args  but at the run time its show declear the "String [] args" method.
       System.out.println("Hello2");
    }
    public static void main(int arr){
       System.out.println("Hello3");
    }
}*/