class A
{
  public static void main(String[]args)
{
   int [] arr= new int []{10,20,30,40,50,60};//explicit
   
   System.out.println("Arr is "+arr);//[and some hash code value
   
   // enhance for loop or for each loop
   for(int a:arr)
    {
      System.out.println(a);
    }
      System.out.println();
    int [] arr1= {100,200,300,400,500,600};//implicit
    System.out.println("Arr is "+arr1);//[and some hash code value
    for(int i=0;i<arr1.length;i++)
    {
      System.out.println("Element At the Index ["+i+"] "+arr1[i]);
    }
}
}