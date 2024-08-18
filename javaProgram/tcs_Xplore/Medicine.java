import java.util.*;
class Solution{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Medicine [] medicine = new Medicine [4];
        for(int i=0;i<4;i++)
        {
            String medicineName=sc.nextLine();
            String batch=sc.nextLine();
            String disease=sc.nextLine();
            int price=sc.nextInt(); sc.nextLine();
            medicine[i]= new Medicine(medicineName,batch,disease,price);
        }
        String disease= sc.nextLine();
        int [] ans = Solution.getPriceByDisease(medicine,disease);
        if(ans!=null){
        for(int i=0;i<ans.length;i++)
        {
              System.out.println(ans[i]);
        }
        }
        else{
            System.out.println("No Medicine found");
        }
    }
    public static int [] getPriceByDisease(Medicine medicine[], String disease)
    {
          int [] arr = new int [0];
          for(int i=0;i<medicine.length;i++)
          {
             if(medicine[i].getDisease().equalsIgnoreCase(disease))
             {
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=medicine[i].getPrice();
             }
          }
          Arrays.sort(arr);
          if(arr.length>0)
          {
             return arr;
          }
          else
          {
            return null;
          }
    }
}
class Medicine
{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;
    Medicine(String medicineName, String batch, String disease, int price)
    {
        this.medicineName=medicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
    public String getMedicineName(){return medicineName;}
    public String getBatch(){return batch;}
    public String getDisease(){return disease;}
    public int getPrice(){return price;}
}