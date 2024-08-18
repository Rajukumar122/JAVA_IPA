import java.util.Scanner;
class B
{
    int account;
    float bal;
    String name;
    B()
    {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter account, bal, name inside constructer from B");
       account=s.nextInt();
       bal=s.nextFloat();
       s.nextLine();
       name=s.nextLine();
    }
    B(int account, float bal, String name)
    {
       this.account=account;
       this.bal=bal;
       this.name=name;
    }
    public void display()
    {
      System.out.println(account+" B "+bal+" B "+name+" B ");
    }
} 
class C
{ 
    private int acc_no;
    private String name;
    private double bal;
    private static int count;
    private static double roi;
    static
    {
       roi=10.5;
       System.out.println("Static block call");
    }
    C()
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Account Number ");
      acc_no=s.nextInt();
      s.nextLine();
      System.out.println("Enter the Account Holder Name ");
      name=s.nextLine();
      System.out.println("Enter the Account Balence ");
      bal=s.nextDouble();
      count++;
    }
    public static void setRate(double r)
    { 
      roi=r;
    }
     public static void getRate()
    { 
      System.out.println(roi);
    }
    public static void getCount()
    {
      //int val;
      //System.out.println(acc_no+" "+name+" "+bal);
      //System.out.println(val); local variable is not assign bydefault, but instance variable assign either 0,null,0.0 according to data type; 
      System.out.println("Number of Data Enter "+count);
    }
    public void display()
    {
      System.out.println(acc_no+" "+name+" "+bal+" "+roi);
    }    
}
class A
{
  public static void main(String[]args)
  {
    /*System.out.println(args[0]+" "+args[1]);
    int x=Integer.parseInt(args[0]);//unboxing->non-primitive(object) to primitive and Auto boxing -> primitive to non-primitive(object)
    int y=Integer.parseInt(args[1]);
    System.out.println("val"+x+y);
    System.out.println(x+y);
    int a;
    int b;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    s.nextLine();
    String name=s.nextLine();
    int c=s.nextInt();
    System.out.println(a+" "+b+" "+name+" "+c);*/

    
    /*Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int []arr = new int [n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }*/

    
    //jagged Array
    /*Scanner s=new Scanner(System.in);
    System.out.println("Enter Number Of Row ");
    int n=s.nextInt();
    int [][]arr = new int [n][];
    for(int i=0;i<n;i++)
    {
        arr[i]=new int[i+1];
    }
    for(int i=0;i<n;i++)
    {
         System.out.println("Enter "+(i+1)+" Of Row ");
         for(int j=0;j<arr[i].length;j++)
         {
            arr[i][j]=s.nextInt();
         }
    }
    System.out.println("Display Matrix ");
    for(int i=0;i<n;i++)
    {
         for(int j=0;j<arr[i].length;j++)
         {
             System.out.print(arr[i][j]+" ");
         }
         System.out.println();
    }*/




    
    /*int account;
    float bal;
    String name;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter account, bal, name ");
    account=s.nextInt();
    bal=s.nextFloat();
    s.nextLine();
    name=s.nextLine();
    System.out.println(account+" "+bal+" "+name);
    B obj=new B();
    obj.display();
    B obj1=new B(11,11.11f,"ranjan kumar");
    obj1.display();*/
    
    


    //Create an array of reference
    /*Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of reverence create ");
    int n=s.nextInt();
    B [] arr = new B[n];
    for(int i=0;i<n;i++)
    {
       arr[i]= new B();
    }
    for(B i:arr)
    {
       i.display();
    }*/


    //Static variable mathod:
    /*C.getCount();
    //C.setRate(5.5);
    System.out.println("Enter the number of Account holder candidate");
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    C [] arr= new C[n];
    for(int i=0;i<n;i++){
      arr[i]= new C();
    }
    for(C i:arr){
    i.display();
    }*/
    /*C.getRate();// static block or method call directly without create object.
    C.getCount();*/
  }
}