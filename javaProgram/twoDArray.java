class A
{
  public static void main(String[]args)
 {
   int [][] arr = {
                    {1,2,3,4,5,6},
                    {10,11,12,13,14,15},
                    {199,2,45,5}
                  };
   System.out.println("base address of array "+arr);// [[and hase code
   System.out.println("base address of array "+arr[0]); //[ and hash code
   System.out.println("base address of array "+arr[1]); //[ and hash code
   System.out.println("base address of array "+arr[2]); //[ and hash code
   
   //print the Array
   for(int i=0;i<arr.length;i++)
   {  
      for(int j=0;j<arr[i].length;j++) 
     {
     System.out.println("Element of array ["+i+"]["+j+"] is "+arr[i][j]);
     }
   }

   System.out.println("======= Empty array bydefult assine zero ===========");
   System.out.println();
  // empty arr but initialse at 0;
  int [][] arr1 = new int[3][4];
  // print the element 
  for(int i=0;i<arr1.length;i++)
   {  
      for(int j=0;j<arr1[i].length;j++) 
     {
     System.out.println("Element of array ["+i+"]["+j+"] is "+arr1[i][j]);
     }
   }
 }
}