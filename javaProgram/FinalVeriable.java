class A
{
 public static void main(String[]args)
 {
   final int i;
   i=20;
   int j=i+30;
   //i=j+30;
   // variable i might already have been assigned
   System.out.println(i+" "+j);
   A.main();
 }
 public static void main()
 {
   System.out.println(" another static method ");
 }
}