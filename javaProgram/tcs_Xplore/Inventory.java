import java.util.*;
class Solution 
{
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       Inventory [] inventory = new Inventory [4];
       for(int i=0;i<4;i++)
       {
          int inventoryId=sc.nextInt(); sc.nextLine();
          int maxiNumquantity=sc.nextInt(); sc.nextLine();
          int currentQuantity=sc.nextInt(); sc.nextLine();
          int threshold=sc.nextInt(); sc.nextLine();
          inventory[i]= new Inventory(inventoryId,maxiNumquantity,currentQuantity,threshold);
       }
       int level=sc.nextInt(); sc.nextLine();
       Inventory [] ans= Solution.replenish(inventory, level);
       for(int i=0;i<ans.length;i++)
       {
        int a=ans[i].getThreshold();
         if(a>75)
         {
            System.out.println(ans[i].getInventoryId()+" Critical Filling");
         }
         else if(a<=75&&a>50)
         {
            System.out.println(ans[i].getInventoryId()+" Moderate Filling");
         }
         else{
            System.out.println(ans[i].getInventoryId()+" Non-Critical Filling");
         }
       }

    }


    public static Inventory[] replenish(Inventory inventory[], int level)
    {
       Inventory [] arr = new Inventory [0];
       for(int i=0;i<inventory.length;i++)
       {
         if(inventory[i].getThreshold()<=level)
         {
              arr=Arrays.copyOf(arr,arr.length+1);
              arr[arr.length-1]=inventory[i];

         }
       }
       return arr;
    }
}
class Inventory
{
    private int inventoryId;
    private int maxiNumquantity;
    private int currentQuantity;
    private int threshold;
    Inventory(int inventoryId, int maxiNumquantity, int currentQuantity,int threshold)
    {
        this.inventoryId=inventoryId;
        this.maxiNumquantity=maxiNumquantity;
        this.currentQuantity=currentQuantity;
        this.threshold=threshold;
    }
    public int getInventoryId(){return inventoryId;}
    public int getMaxiNumquantity(){return maxiNumquantity;}
    public int getCurrentQuantity(){return currentQuantity;}
    public int getThreshold(){return threshold;}

}