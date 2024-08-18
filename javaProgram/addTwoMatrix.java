class A
{
  public static void main(String[]args)
 {
   int [][] arr1 = {
                    {1,1,1,1,1},
                    {1,1,1,1,1},
                    {1,1,1,1,1}
                  };
   
   int [][] arr2 = {
                    {2,2,2,2,2},
                    {2,2,2,2,2},
                    {2,2,2,2,2}
                  };

   
    System.out.println("======MATIX1======");
   for(int i=0;i<arr1.length;i++)
   {  
      for(int j=0;j<arr1[i].length;j++) 
     {
      System.out.print(arr1[i][j]+" ");
     }
     System.out.println();
   }



   System.out.println("======MATIX2======");
   for(int i=0;i<arr2.length;i++)
   {  
      for(int j=0;j<arr2[i].length;j++) 
     {
      System.out.print(arr2[i][j]+" ");
     }
     System.out.println();
   }


 
  int [][] c = new int [3][5];
   for(int i=0;i<3;i++)
   {  
      for(int j=0;j<5;j++) 
     {
       c[i][j]=arr1[i][j]+arr2[i][j];
     }
   }

   

   System.out.println("======SUM OF THE MATIX======");
   for(int i=0;i<arr2.length;i++)
   {  
      for(int j=0;j<arr2[i].length;j++) 
     {
      System.out.print(c[i][j]+" ");
     }
     System.out.println();
   }



 }
}