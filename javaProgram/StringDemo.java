
class A
{
  public static void main(String[]args)
  { 
    String s1="java";//literal method to create string type object
    String s3=new String("java Programming");//new kay word to create string type object
    String s4="java";
    System.out.println(s1);
    s1.concat("Developer");//not concatinating due to string is immutable
    System.out.println(s1);
    System.out.println(s3);
    String s2=s1.concat("Developer");
    System.out.println(s1.length());
    System.out.println(s1.isEmpty());
    System.out.println(s2.length());
    System.out.println(s2.isEmpty());
    System.out.println(s2.toString());
    System.out.println(s1.toLowerCase());
    System.out.println(s2.toLowerCase());
    //String reverse method is not find  
    //System.out.println(s2.reverse());
    System.out.println(s2.toUpperCase());
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    int x=10+20;
    System.out.println(x);
    //int y=10/0;
    // At runtime Exception in thread "main" java.lang.ArithmeticException: / by zero
    //System.out.println(y);
    if(s1==s2)
    {
      System.out.println("Equal");
    }
    else
    {
      System.out.println("Not Equal");
    }
    if(s1==s4)
    {
      System.out.println("Equal");
    }
    else
    {
      System.out.println("Not Equal");
    }
    //==========================================================
    //SringBuffer is mutable
    StringBuffer sb1=new StringBuffer("StringBufferContent");
    System.out.println(sb1);
    sb1.append(" IS available ");
    System.out.println(sb1);
    System.out.println(sb1.length());
    System.out.println(sb1.toString());
    System.out.println(sb1.hashCode());
    System.out.println(sb1.reverse());
    // there two method are not found in StringBuffer class.
    //System.out.println(sb1.toUpperCase());
    //System.out.println(sb1.toLowerCase());    
   
  } 
}